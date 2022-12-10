<%@page import="bo.gioHangbo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
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
	  response.sendRedirect("home.jsp");
  else
	  response.sendRedirect("htGio.jsp");
%>
</body>
</html>