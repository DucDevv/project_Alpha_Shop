package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.giaybean;
import bean.loaigiaybean;
import bo.giaybo;
import bo.loaigiaybo;

/**
 * Servlet implementation class homeController
 */
@WebServlet("/homeController")
public class homeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		loaigiaybo lgbo =new loaigiaybo();
		ArrayList<loaigiaybean> dsloaigiay=lgbo.getloaigiay();
		request.setAttribute("dsloaigiay", dsloaigiay);
		giaybo gbo = new giaybo();
		ArrayList<giaybean> dsgiay=gbo.getgiay();
		String maloaigiay=request.getParameter("mlg");
		String key=request.getParameter("txttk");
		if(maloaigiay!=null) dsgiay=gbo.TimMa(maloaigiay);
		else  if(key!=null)
			dsgiay=gbo.Tim(key);
		request.setAttribute("dsgiay", dsgiay);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

