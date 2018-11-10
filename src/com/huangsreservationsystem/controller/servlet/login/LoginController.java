package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangsreservationsystem.model.domain.Customer;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8095282046652575492L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// get the input parameters

		// process the data

		// generate a response

		Customer customer = extractLoginInfo(req);
		
		if(customer != null) {
			res.sendRedirect("welcome.html");
			//view(req,res);
		}else {
			res.sendRedirect("loginError.html");
		}
		
		
	}

	private Customer extractLoginInfo(HttpServletRequest req) {
		Customer customer = new Customer();
		String userName = req.getParameter("username");
		String password = req.getParameter("password");

		if ((userName.equals("jayhuang")) && (password.equals("123456"))) {
			customer.setUserName(userName);
			customer.setPassword(password);
		} else {
			customer = null;
		}
		return customer;

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
//	public void view(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
//		res.setContentType("text/html");
//		PrintWriter out = res.getWriter();
//		out.print("<html>");
//		out.print("<head><title>Acme login</title></head>");
//		out.print("<body>");
//
//		out.print("login Controller");
//
//		out.print("</body>");
//		out.print("</html>");
//	}
}
