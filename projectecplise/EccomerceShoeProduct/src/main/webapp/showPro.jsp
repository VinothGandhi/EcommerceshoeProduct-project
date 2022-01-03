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
</head>
<body>
<div>
<table>
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
<td><%=ProductList.get(i).getManufactureDate() %>
<td><a href="orderpro.jsp?ProductId=<%=ProductList.get(i).getProductId() %>">Order</a> </td>
</tr>
<%
}

%>
</table>
</div>
</body>
</html>