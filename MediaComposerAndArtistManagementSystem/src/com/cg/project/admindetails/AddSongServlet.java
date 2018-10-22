package com.cg.project.admindetails;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Artist_Song_Assoc;
import com.cg.project.beans.Composer_Song_Assoc;
import com.cg.project.beans.Song_Master;
import com.cg.project.daoservices.ManagementDAO;
import com.cg.project.daoservices.ManagementDAOImpl;


@WebServlet("/AddSongServlet")
public class AddSongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddSongServlet() {
        super();        
    }

	public void init(ServletConfig config) throws ServletException {
	}
	public void destroy() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String songName=request.getParameter("song_Name");
		int songDuration= Integer.parseInt(request.getParameter("song_Duration")),
				composerID=Integer.parseInt(request.getParameter("composer_ID")),
				artistID=Integer.parseInt(request.getParameter("artist_ID"));
		Cookie[] cookie=request.getCookies();
		int id = 0;
		for(Cookie cookie1 : cookie)
			id=Integer.parseInt(cookie1.getValue());
		Song_Master song= new Song_Master(id, id, songDuration, songName, new Artist_Song_Assoc(artistID, id, id), new Composer_Song_Assoc(composerID, id, id));
		ManagementDAO managementDAO= new ManagementDAOImpl();
		song.setSong_ID(managementDAO.saveSong(song));
		request.setAttribute("song", song);
	}

}
