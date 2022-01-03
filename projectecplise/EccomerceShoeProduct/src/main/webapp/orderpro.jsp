<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ecommerceshoe.daoimpl.*" %>
    <%@ page import="java.util.List" %>
    <%@ page import="com.ecommerceshoe.model.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>orderproduct</title>
</head>
<body style="text-align: center;"><form action="orderProductController" method="post"> <div>
    <h1><STRONG>ORDER DETAILS</STRONG></h1>
   
           <label for="UserId"><strong>UserID:</strong></label>
            <input type="number" name="userid" id="user" list="users" required><br><br>
            
             <label for="ProductId"><strong>ProductId:</strong></label>
            <input type="number" name="productid" id="proid" list="productsid" required><br><br>
   
         <label for="Quantity"><strong>Quantity:</strong></label>
            <input type="number" name="quan" id="quantity" list="quantity" required><br><br>


            <label for="Price"><strong>Price:</strong></label>
            <input type="number" name="pri" id="Price" list="pri"required><br><br>
            
            <label for="Orderdate"><strong>OrderDate:</strong></label>
            <input type="date" name="orderdate" id="odate" list="odate" placeholder="dd-mm-yyyy" value=""
         required><br><br><br>

 <div>
                <button><strong>Order</strong></button>&nbsp; &nbsp; &nbsp; &nbsp;
                <button type="reset"><strong>Reset</strong></button>
            </div>
</div>
</form>
</body>
</html>
<script>
<%
int proId=Integer.parseInt(request.getParameter("ProductId"));

%>
</script>