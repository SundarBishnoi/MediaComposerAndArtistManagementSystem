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
	Artist Name: ${requestScope.artist.Artist_Name}<br>
	Artist ID: ${requestScope.artist.artist_ID}<br>
	Artist Date of Birth: ${requestScope.artist.artist_BornDate}<br>
	Artist Date of Death: ${requestScope.artist.artist_DiedDate}<br>
	Artist Type: ${requestScope.artist.artist_Type}<br>
</div>
</body>
</html>