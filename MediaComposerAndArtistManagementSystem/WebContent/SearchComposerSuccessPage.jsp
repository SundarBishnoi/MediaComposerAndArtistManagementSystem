<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	${requestScope.errorMessage}<br>
	Composer Name: ${requestScope.composer.composer_Name}<br>
	Composer ID: ${requestScope.composer.composer_ID}<br>
	Composer Date of Birth: ${requestScope.composer.composer_BornDate}<br>
	Composer CAE ipi Number: ${requestScope.composer.composer_CaeipiNumber}<br> 
	Composer Music Society ID: ${requestScope.composer.composer_MusicSocietyID}<br>
	Composer Date of Death: ${requestScope.composer.composer_DiedDate}<br>
</div>
</body>
</html>