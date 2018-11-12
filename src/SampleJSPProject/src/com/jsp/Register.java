package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String passwd=request.getParameter("passwd");
		String customerName=request.getParameter("custname");
		String gender=request.getParameter("gender");
		String mobileno=request.getParameter("mobileno");
		String city=request.getParameter("city");
		
		out.println("<table align='center'>");
		out.println("<tr><td>User Name<td><td>:"+username+"</td></tr>");
		out.println("Password:"+passwd);
		out.println("Customer Name:"+customerName);
		out.println("Gender:"+gender);
		out.println("Mobile Number:"+mobileno);
		out.println("City:"+city);
	}
}
