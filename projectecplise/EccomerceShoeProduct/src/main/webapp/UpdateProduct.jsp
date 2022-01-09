<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.ecommerceshoe.daoimpl.*" %>
    <%@ page import="java.util.List" %>
    <%@ page import="com.ecommerceshoe.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>updateproduct</title>
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

        label{
            width:80px;
            display: inline-block;
            TEXT-ALIGN:CENTER;
        }
</style>
</head>
<body style=" background-color:pink"><form action="UpdateProductController" method="post"> <div>
<h1 style="text-align:center">ShowProduct</h1>
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
<td><%=ProductList.get(i).getManufactureDate() %>
</tr>
<%
}

%>
</table>
</div>

    <h1 style="TEXT-ALIGN:CENTER"><STRONG>UPDATE PRODUCT</STRONG></h1>
        <div style="text-align:center">   
              <label for="ProductId"><strong>ProductId:</strong></label>
            <input type="number" name="proid" id="proid" list="proid" required><br><br>

            <label for="BrandSize"><strong>Size:</strong></label>
            <input type="number" name="bsize" id="Sizes" list="sizes" required><br><br>

            <label for="Price"><strong>Price:</strong></label>
            <input type="int" name="pri" id="Price" list="pri"required><br><br>
            
           
            
                <button><strong>Submit</strong></button>&nbsp; &nbsp; &nbsp; &nbsp;
                <button type="reset"><strong>Reset</strong></button>
            </div>
</div>
</form>


</body>
</html>