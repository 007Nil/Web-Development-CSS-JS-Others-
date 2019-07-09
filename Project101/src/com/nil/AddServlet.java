package com.nil;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addNum")
public class AddServlet extends HttpServlet
{	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		Cookie cookie = new Cookie("key",k + "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
//		res.sendRedirect("sq?k="+k);
//		req.setAttribute("key", k);
//		
//	RequestDispatcher rd =  req.getRequestDispatcher("sq");
//    rd.forward(req, res);
	}

}
