

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
 * Servlet implementation class EditArtistServlet
 */
@WebServlet("/EditArtistServlet")
public class EditArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EditArtistServlet() {
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
		String artist_Name=request.getParameter("artist_Name");
		String artist_DiedDate=request.getParameter("artist_DiedDate");
		Artist_Master artist=new Artist_Master(id, artist_Name, artist_DiedDate);
		ManagementDAO managementDAO= new ManagementDAOImpl();
		managementDAO.updateArtist(artist);
		request.setAttribute("artist", artist);
	}

}
