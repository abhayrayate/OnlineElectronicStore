<%@page import="java.util.Iterator"%>
<%@page import="pack1.Productbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.Adminbean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Status</title>
<link rel="stylesheet" type="text/css" href="UpdateProduct.css">
</head>

<body>
	<center>
	<%
	
		Adminbean abean=(Adminbean)session.getAttribute("abean");
		Productbean pbean=(Productbean)request.getAttribute("pbean");
		String data=(String)request.getAttribute("msg");
		
		out.println("Hello "+abean.getFname()+"<br><br>");
		out.println(data+"<br><br>");
		%>
		<a href="Addproduct.html">Add Product</a><br><br>
	<a href="view">View Product</a>"<br><br>
	<a href="Logout">Logout</a>"<br><br>
	</center>
</body>
</html>