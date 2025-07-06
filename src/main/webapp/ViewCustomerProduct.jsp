<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.CustomerBean"%>
<%@page import="pack1.Productbean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="ViewCustomerProduct.css">

</head>
<body>
	<center>
		<%
		CustomerBean cbean = (CustomerBean)session.getAttribute("cbean");

		
			ArrayList<Productbean> al=(ArrayList<Productbean>)session.getAttribute("Customerlist");
			out.println("<h1><u>Hello "+"</u></h1> These are your products details"+"<br><br>");
			if(al.size()==0)
			{
				out.println("Product Not Available");
			}
			else
			{
				Iterator<Productbean> i=al.iterator();
				while(i.hasNext())
				{
					Productbean bean=i.next();
					out.println("<div class='product-card'>");
					out.println("Code: " + bean.getP_codde() + "<br>");
					out.println("Name: " + bean.getP_name() + "<br>");
					out.println("Company: " + bean.getP_company() + "<br>");
					out.println("Price: " + bean.getP_price() + "<br>");
					out.println("Quantity: " + bean.getP_qty() + "<br>");
					out.println("<a href='buy?pcode=" + bean.getP_codde() + "'>Buy</a>");
					out.println("</div>");

				}
			}
		%>
	</center>
</body>
</html>