package com.cg.project.admindetails;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Composer_Master;
import com.cg.project.daoservices.ManagementDAO;
import com.cg.project.daoservices.ManagementDAOImpl;

/**
 * Servlet implementation class EditComposerServlet
 */
@WebServlet("/EditComposerServlet")
public class EditComposerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EditComposerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookie=request.getCookies();
		int id = 0;
		for(Cookie cookie1 : cookie)
			id=Integer.parseInt(cookie1.getValue());
		String composer_Name=request.getParameter("composer_Name");
		String composer_DiedDate=request.getParameter("composer_DiedDate");
		Composer_Master composer=new Composer_Master(id,composer_Name,composer_DiedDate);
		ManagementDAO managementDAO= new ManagementDAOImpl();
		managementDAO.updateComposer(composer);
		request.setAttribute("composer", composer);
	}

}
