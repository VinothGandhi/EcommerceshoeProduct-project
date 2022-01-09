<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertproduct</title>
<style>
        label{
            width:120px;
            display: inline-block;
        }
        </style>    
</head>
<body style="text-align: center;"><form action="ProductController" method="post"> <div>
    <h1><STRONG>INSERT PRODUCT DETAILS</STRONG></h1>
            <label for="BrandName"><strong>BrandName:</strong></label>
            <input type="text" name="bname" id="brandName" list="bname" autofocus required><br><br>

            <label for="BrandType"><strong>BrandType:</strong></label>
            <input type="text" name="Btype" id="BrandType" list="Btype"  required><br><br>

            <label for="BrandSize"><strong>Size:</strong></label>
            <input type="number" name="bsize" id="Sizes" list="sizes" required><br><br>

            <label for="Color"><strong>Color:</strong></label>
            <input type="text" name="col" id="COLOR" list="COL" required><br><br>

            <label for="Price"><strong>Price:</strong></label>
            <input type="number" name="pri" id="Price" list="pri"required><br><br>
            
             <label for="manufacturedate"><strong>ManufactureDate:</strong></label>
            <input type="date" name="manufacture" id="mdate" list="mdate" placeholder="yyyy-mm-dd" value=""
         required><br><br>
              
          
            
            <div>
                <button><strong>Submit</strong></button>&nbsp; &nbsp; &nbsp; &nbsp;
                <button type="reset"><strong>Reset</strong></button>
            </div>
</div>
</form>
</body>
</html>