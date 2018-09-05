<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="OtpVerification.jsp" method="get">
<%
int otptrue=(Integer)request.getAttribute("otp");
String email =(String)request.getAttribute("email");
session.setAttribute("otptrue", otptrue);
session.setAttribute("Email Id", email);
%>
You'r Mail id:<input type="text" name="email" value="<%=email%>" readonly="readonly"><br><br>
Enter OTP You Received From Cubic Throw Mail<input type="text" name="otp"><br><br>
<input type="submit" value="submit">
</form>
</body>
</html>