package com.cubic.project;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Process")
public class Process extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		
		String targetmailid=req.getParameter("email");
		String to=targetmailid;//change accordingly
		String from="gangareddygogu@gmail.com";
		String password="1100reddy";
		String sub="Reg.Email Verification From Cubic It Solution";
		Random rand = new Random();
		int otp = rand.nextInt(900000) + 100000;
		String msg = "<i>Greetings!</i><br><br><br>";
	        msg += "<b>Hi...!!There We are From Cubic IT Solution!</b><br><br><br>";
	        msg += "<b>You'r OTP To Register In Video Login Form is !</b><br><br><br>";
	        msg += otp;
	 	Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage mess = new MimeMessage(session);
           
           /*mess.setSender(new InternetAddress("no-reply@domain.com", "Sender Name"));*/
          
           mess.setFrom(new InternetAddress("Sender Name" + "<" + "no-reply@domain.com" + ">"));
	 	   mess.setReplyTo(InternetAddress.parse("no_reply@gmail.com", false));
           mess.addRecipient(Message.RecipientType.TO,new InternetAddress(to,false));    
           mess.setSubject(sub);    
           mess.setText(msg); 
           mess.setSentDate(new Date());
           
           mess.setContent(msg, "text/html");
           //send message  
           Transport.send(mess);   
           req.setAttribute("otp",otp);
           req.setAttribute("email", targetmailid);
           //System.out.println("message sent successfully");    
           resp.getWriter().print("<script>window.alert('OTP Sent To You are Mail id Successfully')</script>");
			RequestDispatcher rd=req.getRequestDispatcher("otpprocess.jsp");
			rd.include(req, resp);
          /*resp.getWriter().print("<script>window.location.href='http://localhost:8085/DemoTemplate/index.jsp'</script>");*/
          } catch (MessagingException e) {throw new RuntimeException(e);}    		
	}
}
