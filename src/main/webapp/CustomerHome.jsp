<%@page import="pack1.CustomerBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="CustomerHome.css">

</head>
<body>
	<center>
		<%
			CustomerBean bean=(CustomerBean)session.getAttribute("cbean");
		out.println("Welcome Mr."+bean.getFirstname()+"<br><br>");
		%>
		<a href="ViewProducts">View_Products</a><br><br>
		<a href="logout">Logout</a><br><br>
	</center>
</body>
</html>