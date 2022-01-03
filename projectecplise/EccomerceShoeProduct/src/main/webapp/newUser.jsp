<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        label{
            width:80px;
            display: inline-block;
        }
        </style>      
</head>

<body style="text-align:center"><form action="createAccount" method="post">
<div>
    <h1><b>SIGNUP</b></h1>
           

            <label for="NAME"><strong>Name:</strong></label>
            <input type="text" name="name" id="NAME" list="NAM" autofocus required><br><br>

             <label for="PASSWORD"><strong>Password:</strong></label>
             <input type="password" name="pass" id="Password" list="word" required><br><br>
             
              <label for="MobileNumber"><strong>MobileNumber:</strong></label>
             <input type="tel" name="num" id="number"required><br><br>
             
              <label for="Email"><strong>Email-id:</strong></label>
            <input type="email" name="UserEmail" id="mail" list="email" required placeholder="abcd22@gmail.com" pattern="[a-z][a-z0-9]+[@][a-z]+[.][a-z]+"><br><br>
            
            <label for="Address"><strong >Address: </strong></label>
            <input type="text" name="address" id="add" list="add" required><br><br>
            
            <div>
                <button><strong>Submit</strong></button>&nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp; &nbsp;
                <button type="reset"><strong>Reset</strong></button>
            </div>
</div>
</form>
</body>
</html>