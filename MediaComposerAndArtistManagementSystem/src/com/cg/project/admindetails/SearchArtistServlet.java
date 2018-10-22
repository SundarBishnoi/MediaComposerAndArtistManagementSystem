package com.cg.project.admindetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Artist_Master;
import com.cg.project.beans.Composer_Master;
import com.cg.project.daoservices.ManagementDAO;
import com.cg.project.daoservices.ManagementDAOImpl;

/**
 * Servlet implementation class SearchArtistServlet
 */
@WebServlet("/SearchArtistServlet")
public class SearchArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchArtistServlet() {
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
		String artist_Name=request.getParameter("searchArtist");
		ManagementDAO managementDAO= new ManagementDAOImpl();
		Artist_Master artist =managementDAO.findArtist(artist_Name);
		if(artist!=null){
			RequestDispatcher dispatcher=request.getRequestDispatcher("SearchArtistSuccessPage.jsp");
			request.setAttribute("artist", artist);
			dispatcher.forward(request, response);
		}

	}
}
