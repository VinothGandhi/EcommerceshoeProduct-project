<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.ecommerceshoe.daoimpl.*" %>
    <%@ page import="java.util.List" %>
    <%@ page import="com.ecommerceshoe.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#prod {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#prod td, #prod th {
  border: 1px solid #ddd;
  padding: 8px;
}

#prod tr:nth-child(even){background-color: #f2f2f2;}

#prod tr:hover {background-color: #ddd;}

#prod th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body style=" background-color: pink">
<form action="deleteProductController" method="post"></form> <div>
<h1 style="text-align: center">ShowProduct</h1>
<div>
<table id="prod">
<tr>
<th>
productId</th>
<th>
BrandName</th>
<th>
Brandtype
</th>
<th>
Brandsize</th>
<th>
color</th>
<th>
price</th>
<th>manufacturedate</th>
</tr>
<% 
ProductDaoImpl productdao=new ProductDaoImpl();
List<Product> ProductList = productdao.showProduct();

for (int i = 0; i < ProductList.size(); i++) {%>

<tr>
<td>
<%= ProductList.get(i).getProductId() %></td> <td><%=ProductList.get(i).getBrandName() %>
</td>
<td><%=ProductList.get(i).getBrandType() %>
</td>
<td>
<%=ProductList.get(i).getBrandSize() %>
</td>
<td>
<%=ProductList.get(i).getColor() %></td>
<td> <%=ProductList.get(i).getPrices() %></td>
<td><%=ProductList.get(i).getManufactureDate() %></td>
<td><a href="deleteProduct.jsp?prodId=<%=ProductList.get(i).getProductId()%>"><button><strong>Delete</strong></button></a></td>
</tr>
<%
}

%>

</table>
<%int proId=Integer.parseInt(request.getParameter("prodId")); 
 productdao.delete(proId);
%>

</div>

</div>
</body>
</html>