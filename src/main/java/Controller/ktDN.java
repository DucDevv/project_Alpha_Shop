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
import bo.khachHangbo;

/**
 * Servlet implementation class ktDN
 */
@WebServlet("/ktDN")
public class ktDN extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktDN() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("txtun");
		String pass=request.getParameter("txtpass");
		khachHangbo khbo= new khachHangbo();
		khachHangbean kh=null;
		RequestDispatcher rd;
		if(un!=null && pass!=null) {
			//Tao doi tuong session
		  HttpSession session=request.getSession();
		   //Neu chua tao session
		  if(session.getAttribute("kh")==null) {
			  kh=new khachHangbean();
		  }
		  kh=khbo.ktDN(un, pass);
		  if(kh==null) 
			   rd= request.getRequestDispatcher("dangNhap.jsp?kt=1");
		else {
			   session.setAttribute("kh", kh);
			  rd= request.getRequestDispatcher("homeController");
		  }
	   }else 
		   rd= request.getRequestDispatcher("dangNhap.jsp");
	
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
