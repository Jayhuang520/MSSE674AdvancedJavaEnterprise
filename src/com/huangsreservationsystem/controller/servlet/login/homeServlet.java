package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangsreservationsystem.model.domain.CustomerBean;

@WebServlet("/homeServlet")
public class homeServlet {
	
	public void dePost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
	// set the content type first
    res.setContentType("text/html");
    // get a PrintWriter
    PrintWriter out = res.getWriter();
    CustomerBean login = (CustomerBean)req.getAttribute("customer");
    out.println("<html><head><title>Welcome</title></head>");
    out.println("<body><h1>");
    out.println("Hello " + login.getUserName());
    out.println("</h1></body></html>");
  }

}
