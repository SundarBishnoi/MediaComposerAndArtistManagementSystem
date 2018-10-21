package com.cg.project.admindetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminServlet() {
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String AdminId = request.getParameter("AdminId");
		String password = request.getParameter("password");
		Admin admin = new Admin(AdminId, password);
		RequestDispatcher dispatcher;
		if(admin.getAdminId().equals("SUNDAR") && admin.getPassword().equals("BISHNOI")){
			dispatcher = request.getRequestDispatcher("AdminLoginSuccessPage.html");
			request.setAttribute("admin", admin);
			dispatcher.forward(request, response);
		}
		else{
			dispatcher =request.getRequestDispatcher("AdminLogin.html");
			request.setAttribute("errorMessage", "AdminId or Password is wrong");
			dispatcher.forward(request, response);
		}
	}

}