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
 * Servlet implementation class suaXoaController
 */
@WebServlet("/suaXoaController")
public class suaXoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suaXoaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		gioHangbo gh = (gioHangbo)session.getAttribute("gio");
		  String[] check= request.getParameterValues("check");
		  if(check!=null)
			  for(String mg:check)
				  gh.xoa(mg);
		  if(request.getParameter("butxoa")!=null){
			  String mg=request.getParameter("butxoa");
			  gh.xoa(mg);
		  }
		  if(request.getParameter("butsua")!=null){
			  String mg=request.getParameter("butsua");
			  String sl=request.getParameter(mg);
			//  out.print(mg+":"+sl);
			  gh.Them(mg, "", Long.parseLong(sl), 0, "");
		  }
		  session.setAttribute("gio", gh);
		  if(gh.ds.size()==0)
			  response.sendRedirect("homeController");
		  else
			  response.sendRedirect("homeController");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
