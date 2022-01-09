<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.ecommerceshoe.daoimpl.*"%>
<%@ page import="java.util.List"%>
<%@ page import="com.ecommerceshoe.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #04AA6D;
}

#products{
position: relative;
top: 30px;
padding-bottom: 10px;
}

#products h3{
position: relative;
top:-300px;
left:350px;
}
#products .btn{
position: relative;
top:-300px;
left:350px;
}

</style>
</head>
<body style="background-color:grey;">

	
		<div>
		<h1 style="text-align:center;">PRODUCTS</h1>
			<ul>  

 
  <li><a href="walletupdate.jsp">RechargeWallet</a></li>
  <li><a href="OrderCancel.jsp?oid=0&price=0">OrderCancel</a></li>
  <li><a href="showorder.jsp">MyOrder</a></li>
  <li><a href="showcartjsp.jsp">MyCart</a></li>
  <li style="float:right;"><a href="User.jsp"> LogOut</a></li>

</ul><br><br><br><br>
</div>
			<div>
				<%
				Users user=(Users)session.getAttribute("CurrentUser");
				ProductDaoImpl productdao = new ProductDaoImpl();
				List<Product> ProductList = productdao.showProduct();
                session.setAttribute("product",ProductList );
				for (int i = 0; i < ProductList.size(); i++) {
					Product productlist = ProductList.get(i);
				%>


				<div style="background-color:;" id="products">
				    <img src="<%= productlist.getColor()%>.jpg" alt="img" width=300px height=300px><br>
											
					
										<h3>BrandName: <%=productlist.getBrandName()%></h3>
										<h3>BrandType  :<%=productlist.getBrandType()%></h3>
										<h3>BrandSize :<%=productlist.getBrandSize()%></h3>
										<h3>Color :<%=productlist.getColor()%></h3>
										<h3>Price :<%=productlist.getPrices()%></h3>
										<h3>ManufactureDate :<%=productlist.getManufactureDate()%></h3>
					
					<a class="btn" href="orderpro.jsp?user=<%=user %>&brandname=<%=productlist.getBrandName()%>&btype=<%=productlist.getBrandType()%>&bsize=<%=productlist.getBrandSize()%>&color=<%=productlist.getColor()%>"><button><strong>Order</strong></button></a>&nbsp; &nbsp;
						<a class="btn" href="cartpro.jsp?brandname=<%=productlist.getBrandName()%>&btype=<%=productlist.getBrandType()%>&bsize=<%=productlist.getBrandSize()%>&color=<%=productlist.getColor()%>"><button><strong> AddCart</strong></button></a>
					

				
				<%
				}
				%>
			
		</div>
	</div>
</body>
</html>




