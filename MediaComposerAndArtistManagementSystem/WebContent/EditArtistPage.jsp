<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div><form method="post" action="EditArtistServlet">
Enter the details to be updated:
<table>
<tr>
	<td>Artist Name:</td>
	<td><input type="text" name="artist_Name"></td>
</tr>
<tr>
	<td>Artist Date of Death:</td>
	<td><input type="text" name="artist_DiedDate"></td>
</tr>
<tr>
<td><input Type="submit" value="edit"></td>
</tr>
</table>
</form>
</div>
</body>
</html>