package com.cubic.project;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemoProject extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) {
		
		ServletConfig config=getServletConfig();
		ServletContext context=req.getServletContext();
		
	}
}
