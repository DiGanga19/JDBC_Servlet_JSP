package com.ganga.training.servlets.sm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SourceServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		Cookie[] cookies = request.getCookies();
		for(int i=0;i<cookies.length;i++) {
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());	
		}
		
		response.addCookie(new Cookie("SecuritToken","1234"));
		String userName = request.getParameter("userName");
		HttpSession session=request.getSession();
		session.setAttribute("user", userName);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<a href='targetServlet'>Click here to get the user Name</a> ");
		
	}

}
