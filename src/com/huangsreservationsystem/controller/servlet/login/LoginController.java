package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 8095282046652575492L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		doPost(req,res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Acme login</title></head>");
		out.print("<body>");
		
		out.print("login Controller");
		
		out.print("</body>");
		out.print("</html>");
	}
}
