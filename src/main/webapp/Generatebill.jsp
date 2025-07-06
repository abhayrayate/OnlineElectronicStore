<%@page import="pack1.CustomerBean" %>
<%@page import="java.util.Iterator"%>
<%@page import="pack1.Productbean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%
		CustomerBean bean=(CustomerBean)session.getAttribute("cbean");
		Productbean pbean=(Productbean)session.getAttribute("viewgenertebill");
	
		out.println("<u>Invoice</u><br><br>");
		out.println("Customer Details:<br><br>");
		out.println("Customer Name: "+bean.getUname()+"<br><br>");
		out.println("Mobile Number: "+bean.getMobile()+"<br><br>");
		out.println("Mail Id: "+bean.getMailid()+"<br><br>");
		out.println("Address: "+bean.getAddress()+"<br><br>");
		out.println("Product Details:<br><br>");
		out.println("product Code:"+pbean.getP_codde()+"<br><br>");
		out.println("product Name:"+pbean.getP_name()+"<br><br>");
		out.println("product company:"+pbean.getP_company()+"<br><br>");
		out.println("product Quantity:"+pbean.getP_qty()+"<br><br>");
		out.println("product Price:"+pbean.getP_price()+"<br><br>");
		

		
		
		
    


		%>
	</center>
</body>
</html>