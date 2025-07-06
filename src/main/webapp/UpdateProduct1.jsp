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
<link rel="stylesheet" type="text/css" href="UpdateProduct1.css">
</head>
<body>
	<center>
		<%
			Productbean bean=(Productbean)request.getAttribute("product");
			String reqno=(String)request.getAttribute("reqno");
			
			if(bean!=null&&reqno!=null)
			{
				int qty=Integer.parseInt(reqno);
				int price=Integer.parseInt(bean.getP_price());
				int totalcharge=price*qty;
				session.setAttribute("totalcharge", totalcharge);
		%>
		<h2>
		you have charged:<%=totalcharge %><br><br>
		your order is placed successfully!<br><br>
		
		</h2>
		<%
			}
		%>
		
		
		
		
		<a href="ViewProducts">View_Products</a><br><br>
		<a href="Logout.jsp">Logout</a><br><br>
	</center>
</body>
</html>