package com.cg.project.admindetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserServlet() {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserId = request.getParameter("UserId");
		String password = request.getParameter("password");
		User user = new User(UserId, password);
		RequestDispatcher dispatcher;
		if(user.getUserId().equals("sundar") && user.getPassword().equals("root")){
			dispatcher = request.getRequestDispatcher("UserLoginSuccessPage.html");
			request.setAttribute("user", user);
			dispatcher.forward(request, response);
		}
		else{
			dispatcher =request.getRequestDispatcher("UserLogin.html");
			request.setAttribute("errorMessage", "UserId or Password is wrong");
			dispatcher.forward(request, response);
		}
	}

}

