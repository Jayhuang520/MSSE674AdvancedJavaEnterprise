package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangsreservationsystem.model.domain.CustomerBean;

public class WelcomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7663423900095412994L;

	public WelcomeServlet() {
		super();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("Inside the doPost of the Welcome Servlet");
		// set the content type first
		res.setContentType("text/html");
		// get a PrintWriter
		PrintWriter out = res.getWriter();
		CustomerBean login = (CustomerBean) req.getAttribute("customer");
		out.println("<html><head><title>Welcome</title></head>");
		out.println("<body><h1>");
		out.println("Hello " + login.getUserName());
		out.println("</h1></body></html>");
	}

}
