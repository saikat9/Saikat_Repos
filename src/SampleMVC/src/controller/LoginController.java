package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		String password=request.getParameter("passwd");
		
		model.LoginCredential credential=new model.LoginCredential();
		
		credential.setUsername(username);
		credential.setPassword(password);
		
		if(credential.checkLogin())
		{
			request.setAttribute("username",username);
			RequestDispatcher dispatcher=request.getRequestDispatcher("Success.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("Failure.jsp");
			dispatcher.forward(request, response);
		}
	}
}