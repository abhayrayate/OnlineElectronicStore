<%@page import="pack1.Adminbean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Product Status</title>
    <link rel="stylesheet" type="text/css" href="AddProduct1.css">
    

</head>
<body>
    
        <%
            Adminbean bean = (Adminbean) session.getAttribute("abean");
            String data = (String) request.getAttribute("msg");
            out.println("<h2>" + data + " Mr. " + bean.getFname() + "</h2>");
        %>
 
            <a href="Addproduct.html">Add Product</a><br><br>
            <a href="view">View Product</a><br><br>
            <a href="Logout">Logout</a><br><br>
    
</body>
</html>