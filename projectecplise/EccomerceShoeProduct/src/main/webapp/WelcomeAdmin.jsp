<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin Page</title>
<style>
div{
background-color: grey;
border-style: solid;
border-width: 5px;
border-color: blue;
 border-radius: 5px;
  padding: 5px;
   padding-top: 5px;
   padding-bottom: 5px;
}


</style>
</head>
<body style="background-color: pink;">
<marquee width="100%" direction="LEFT" height="100px" scrollamount="10" >
 <h1 style="color:black;" >
WELCOME ADMIN
</h1></marquee>

<div>
<h2><a href="product.jsp"><b style="color:red;"><button><strong>InsertProduct</strong></button></b></a> &nbsp; &nbsp; &nbsp;
    <a href="UpdateProduct.jsp"><b style="text-decoration:none; color:black;"><button><strong>UpdateProduct</strong></button></b></a> &nbsp;  &nbsp; &nbsp; 
    <a href="deleteProduct.jsp?prodId=0"><b style="color:orange"><button><strong>DeleteProduct</strong></button></b></a> &nbsp; &nbsp; &nbsp; </h2>
    </div>
</body>
</html>