<%@page import="pack1.CustomerBean"%>
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
		String data=(String)request.getAttribute("msg");
		out.println("welcome  "+data+"<br><br>");
		%>
		<jsp:include page="index.html"/>
		
	</center>
</body>
</html>