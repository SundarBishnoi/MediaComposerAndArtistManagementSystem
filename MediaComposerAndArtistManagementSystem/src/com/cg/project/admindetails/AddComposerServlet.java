package com.cg.project.admindetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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


@WebServlet("/AddComposerServlet")
public class AddComposerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddComposerServlet() {
        super();        
    }

	public void init(ServletConfig config) throws ServletException {
		
	}

	public void destroy() {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookie=request.getCookies();
		int id = 0;
		for(Cookie cookie1 : cookie)
			id=Integer.parseInt(cookie1.getValue());
		String composerName=request.getParameter("composer_Name"),
				composerDOB=request.getParameter("composer_BornDate"),
				composerDOD=request.getParameter("composer_DiedDate"),
				composerCaeipi=request.getParameter("composer_CaeipiNumber"),
				composerMusicSocietyID=request.getParameter("composer_MusicSocietyID");
		Composer_Master composer=new Composer_Master(id, composerName, composerCaeipi, composerMusicSocietyID, composerDOB, composerDOD);
		ManagementDAO managementDAO= new ManagementDAOImpl();
		composer=managementDAO.saveComposer(composer);
		request.setAttribute("composer", composer);
//		RequestDispatcher dispatcher = request.getRequestDispatcher(arg0)
	}

}
