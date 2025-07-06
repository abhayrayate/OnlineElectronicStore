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
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="ViewProduct.css">
</head>
<body><center>
<%
Adminbean abean=(Adminbean)session.getAttribute("abean");
ArrayList<Productbean> al=(ArrayList<Productbean>)session.getAttribute("productlist");
out.println("<h1><u>Hello "+abean.getFname()+"</h1> These are your Product Details"+"</u><br><br>");
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
	out.println("<a href='edit?pcode=" + bean.getP_codde() + "'>Edit</a>");
	out.println("<a href='delete?pcode=" + bean.getP_codde() + "'>Delete</a>");
	out.println("</div>");

	}
}


%>
<a href="Logout">LogOut</a>
</center>

</body>
</html>