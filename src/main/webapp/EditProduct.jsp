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
<title>Edit Product</title>
<link rel="stylesheet" type="text/css" href="EditProduct.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>

<body>
	<center>
		<%
		Adminbean abean=(Adminbean)session.getAttribute("abean");
		Productbean pbean=(Productbean)request.getAttribute("pbean");
		out.println("<u>Hello "+abean.getFname()+" please edit</u><br><br>");
		%>
		
		<form action="update" method="post">
		Product Price<input type="text" name=p_price value="<%=pbean.getP_price() %>"><br><br>

		Product Quantity<input type="text" name=p_qty value="<%=pbean.getP_qty() %>"><br><br>
		
		<input type="hidden" name=p_code value=<%=pbean.getP_codde() %>>
		<input type="submit" value="update">
		</form>
	</center>
</body>
</html>