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
Enter the details of the song:
<table>
<form action="AddSongServlet" method="post">
<tr>
	<td>Song name:</td>
	<td><input type="text" name="song_Name"></td>
</tr>
<tr>
	<td>Song duration (in minutes):</td>
	<td><input type="number" name="song_Name"></td>
</tr>
<tr>
	<td>Composer ID</td>
	<td><input type="number" name="composer_ID"></td>
</tr>
<tr>
	<td>Artist ID</td>
	<td><input type="number" name="artist_ID"></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" value="Add"></td>
</tr>
</form>
</table>
</div>
</body>
</html>