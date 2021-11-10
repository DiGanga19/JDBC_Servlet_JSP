package com.ganga.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 long n1 = Long.parseLong(req.getParameter("num1"));
		long n2 = Long.parseLong(req.getParameter("num2"));
		PrintWriter out = res.getWriter();
		out.println("The result is"+(n1+n2));
		
		

	}

}
