<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>wallet update</title>
</head>
<body>
<form action="UpdateWalletController">
<div style="text-align:center">
    <h1><b>WalletUpdate</b></h1>
    <label for="Amount"><strong>EnterAmount:</strong></label>
    <input type="number" name="Amount" id="amount" list="amount" autofocus required placeholder=""><br><br>

     
     <div>
       <button><strong>update</strong></button> &nbsp; &nbsp; &nbsp; &nbsp;
        <button type="reset"><strong>Reset</strong></button>
     </div>
    
</div> 
</form>
</body>
</html>