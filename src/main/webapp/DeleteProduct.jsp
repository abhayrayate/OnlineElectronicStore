<%@page import="pack1.Adminbean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Message</title>
<link rel="stylesheet" type="text/css" href="DeleteProduct.css">
</head>

<body>
	<center>
		<%
		Adminbean abean=(Adminbean)session.getAttribute("abean");
		String data=(String)request.getAttribute("msg");
		out.println("hello "+abean.getFname()+" "+data+"<br><br>");
		%>
		<a href="Addproduct.html">Add Product</a><br><br>
	<a href="view">View Product</a>"<br><br>
	<a href="Logout">Logout</a>"<br><br>
	</center>
</body>
</html>