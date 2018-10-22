<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.cg.project.admindetails.Admin"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	
</div>
	<div align="center">
		<form action="SearchComposerServlet" method="post">
			<input type="text" placeholder="Search.." name="searchComposer"><input
				type="submit" value="Search Composer"><br>
		</form>

		<form action="AddComposerPage.jsp" method="post">
			<input type="submit" value="Add Composer"><br>
		</form>
		
		<form action="EditComposerPage.jsp" method="post">
			<input type="submit" value="Edit Composer"><br> 
		</form>
		
		<form action="SearchArtistServlet" method="post">
			<input type="text" placeholder="Search.."><input type="submit"	value="Search Artist"><br>
		</form> 
		
		<form action="AddArtistPage.jsp" method="post">
			<input type="submit"	value="Add Artist"><br> 
		</form>
		
		<form action="EditArtistPage.jsp" method="post">
			<input type="submit" value="Edit Artist"><br>
		 </form>
		 
		 <form action="AddSongPage.jsp" method="post">
			<input type="submit" value="Add Song"><br>
		</form>
	</div>
</body>
</html>