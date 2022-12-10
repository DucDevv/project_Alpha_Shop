package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.khachHangbean;
import bo.lichSubo;

/**
 * Servlet implementation class lichSuController
 */
@WebServlet("/lichSuController")
public class lichSuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lichSuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		khachHangbean kh=(khachHangbean)session.getAttribute("kh");
		if(kh==null ){//chua dang nhap
			response.sendRedirect("ktDN");
		}else {
			lichSubo lbo= new lichSubo();
			request.setAttribute("dslichsu", lbo.getlichSu(kh.getMaKh()));
			RequestDispatcher rd= request.getRequestDispatcher("htLichsu.jsp");
			rd.forward(request, response);
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
