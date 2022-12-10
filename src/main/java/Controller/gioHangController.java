package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.gioHangbo;

/**
 * Servlet implementation class gioHangController
 */
@WebServlet("/gioHangController")
public class gioHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gioHangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String magiay=request.getParameter("mg");
		String tengiay=request.getParameter("tg");
		if(magiay!=null) {
		long soluong=(long)1;
		long gia=Long.parseLong(request.getParameter("gia"));
		String anh=request.getParameter("anh");
		gioHangbo gh;
		//Neu mua lan dau
		if(session.getAttribute("gio")==null){
			gh= new gioHangbo();
			session.setAttribute("gio", gh);
		}
		//b1: gan session vao 1 bien
		gh=(gioHangbo) session.getAttribute("gio");
		//b2: Thao tac trên bien: gh
		gh.Them(magiay, tengiay, soluong, gia, anh);
		//b3: Luu gh vao session
		session.setAttribute("gio", gh);
		//Hien thi gio
		response.sendRedirect("htGioController");
		} else {
			response.sendRedirect("homeController");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
