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
<link rel="stylesheet" type="text/css" href="BuyProduct.css">

</head>
<body>
	<center>
		<% 
		ArrayList<Productbean> al=(ArrayList<Productbean>)session.getAttribute("viewcustomerproduct");
		if(al.size()==0)
		{
			throw new ServletException("products details are not available");
		}
		else
		{
			Iterator<Productbean> i=al.iterator();
			while(i.hasNext())
			{	
				Productbean bean=i.next();
				
		%>
				<div class="product-card">
    Product code: <%= bean.getP_codde() %><br><br>
    Product Name: <%= bean.getP_name() %><br><br>
    Product Company: <%= bean.getP_company() %><br><br>
    Product Price: <%= bean.getP_price() %><br><br>
    Product Quantity: <%= bean.getP_qty() %><br><br>

    <form action="Buy1" method="post">
        <input type="hidden" name="pcode" value="<%= bean.getP_codde() %>">
        <input type="hidden" name="p_price" value="<%= bean.getP_price() %>">
        <input type="hidden" name="p_qty" value="<%= bean.getP_qty() %>">
        Product ReqNo: <input type="text" name="reqno" required><br><br>
        <input type="submit" value="Buy">
    </form>
</div>

          
                <%
            }
        }
    %>
		
	</center>
</body>
</html>

