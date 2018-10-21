package com.cg.project.admindetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Composer_Master;
import com.cg.project.daoservices.ManagementDAO;
import com.cg.project.daoservices.ManagementDAOImpl;

@WebServlet("/SearchComposerServlet")
public class SearchComposerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SearchComposerServlet() {
        super();
    }
	public void init(ServletConfig config) throws ServletException {
	}
	public void destroy() {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("SearchComposerSuccessPage.jsp");
		request.setAttribute("errorMessage", "associateId or password is wrong");
		dispatcher.forward(request, response);
//		String composer_Name=request.getParameter("searchComposer");
//		ManagementDAO managementDAO= new ManagementDAOImpl();
//		Composer_Master composer =managementDAO.findComposer(composer_Name);
//		if(composer!=null){
//			RequestDispatcher dispatcher=request.getRequestDispatcher("SearchComposerSuccessPage.jsp");
//			request.setAttribute("composer", composer);
//			dispatcher.forward(request, response);
//		}
		
	}

}
