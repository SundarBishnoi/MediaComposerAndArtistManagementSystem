package com.cg.project.admindetails;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Artist_Master;
import com.cg.project.beans.Composer_Master;
import com.cg.project.daoservices.ManagementDAO;
import com.cg.project.daoservices.ManagementDAOImpl;

/**
 * Servlet implementation class AddArtistServlet
 */
@WebServlet("/AddArtistServlet")
public class AddArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddArtistServlet() {
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
		String artistName=request.getParameter("artist_Name"),
				artistDOB=request.getParameter("artist_BornDate"),
				artistDOD=request.getParameter("artist_DiedDate"),
				artistType=request.getParameter("artist_Type");
		Artist_Master artist=new Artist_Master(id, artistName, artistDOB, artistDOD, artistType);
		ManagementDAO managementDAO= new ManagementDAOImpl();
		artist=managementDAO.saveArtist(artist);
		request.setAttribute("artist", artist);
	}

}
