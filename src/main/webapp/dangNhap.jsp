<%@page import="bean.khachHangbean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign in</title>
<link rel='shortcut icon' href='https://scontent.fdad1-4.fna.fbcdn.net/v/t1.6435-9/125862641_1354296324912030_3484096335265497949_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=174925&_nc_ohc=7eI59Ellc08AX_cCLhD&_nc_ht=scontent.fdad1-4.fna&oh=00_AfBzCnGbunUJIlNK5vQ5lSaqHzADIEJ9FA5k41YIKeGZ8w&oe=639BF5A7'/>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="dangNhap.css">
</head>
<body>


	<form action="ktDN" method="post">
  		<h2>
  			<a href="homeController">
  			<span class="entypo-login"><i class="fa fa-sign-in"></i></span> Alpha Shop
  			</a>
  		</h2>
  		<button name="butdn" type="submit" value="login"><span class="entypo-lock"><i class="fa fa-lock"></i></span></button>
  	<span class="entypo-user inputUserIcon">
     	<i class="fa fa-user"></i>
	</span>
	<input name="txtun" type="text" class="user" placeholder="ursername"/>
  	<span class="entypo-key inputPassIcon">
     	<i class="fa fa-key"></i>
	</span>
  		<input name="txtpass" type="password" class="pass"placeholder="password"/>
  		<%if(request.getParameter("kt")!=null){
    	  out.print("Đăng nhập sai");
    	  }%>
	</form>
	
	<script>
	$(".user").focusin(function(){
	  $(".inputUserIcon").css("color", "#e74c3c");
	}).focusout(function(){
	  $(".inputUserIcon").css("color", "white");
	});

	$(".pass").focusin(function(){
	  $(".inputPassIcon").css("color", "#e74c3c");
	}).focusout(function(){
	  $(".inputPassIcon").css("color", "white");
	});
	</script>
</body>
</html>