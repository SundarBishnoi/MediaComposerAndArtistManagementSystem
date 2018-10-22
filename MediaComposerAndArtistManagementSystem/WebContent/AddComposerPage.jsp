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
<form method="post" action="AddComposerServlet">
<table>
<tr>
	<td>Composer Name:</td>
	<td><input type="text" name="composer_Name"></td>
</tr>
<tr>
	<td>Composer Date of Birth:</td>
	<td><input type="text" name="composer_BornDate"></td>
</tr>
<tr>
	<td>Composer Date of Death:</td>
	<td><input type="text" name="composer_DiedDate"></td>
</tr>
<tr>
	<td>Composer CAE ipi Number:</td>
	<td><input type="text" name="composer_CaeipiNumber"></td>
</tr>
<tr>
	<td>Composer Music Society ID:</td>
	<td><input type="text" name="composer_MusicSocietyID"></td>
</tr>
</table>	
</form>
</div>
</body>
</html>