<%@page import="pack1.Adminbean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Admin Home</title>
    <link rel="stylesheet" type="text/css" href="AdminHome.css">
</head>
<body>
    <div class="dashboard-container">
        <%
            Adminbean bean = (Adminbean) session.getAttribute("abean");
            out.println("<h2>Welcome Mr. " + bean.getFname() + "</h2>");
        %>
        <div class="dashboard-links">
            <a href="Addproduct.html">Add Product</a>
            <a href="view">View Product</a>
            <a href="Logout">Logout</a>
        </div>
    </div>
</body>
</html>