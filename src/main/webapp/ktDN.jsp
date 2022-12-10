<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String username=request.getParameter("txtun");
		String password=request.getParameter("txtpass");
			if(session.getAttribute("dn")==null){
				session.setAttribute("dn", username);
				
			response.sendRedirect("home.jsp");
			}else
			//Nếu đăng nhập sai
				response.sendRedirect("dangNhap.jsp?kt=1");
	%>
</body>
</html>