<%-- 
    Document   : reg
    Created on : Jan 10, 2018, 11:50:34 AM
    Author     : Nandan Raj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    .form1 form h4{
        padding-top: 10px;
    }
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <%@include file="loginHeader.jsp" %>
        <h1><center>Registration</center></h1>
        <div style="padding-left: 50px" class="form1">
        <form action="reg" method="post">
            <h4>Enter username</h4>
            <input type="text" name="uname" placeholder="Username"required="Data Required"><br>
            <h4>Enter password</h4>
            <input type="password" name="pass" placeholder="Password"required="Data Required"><br>
            <h4>Select </h4>
            <input type="radio" name="staff" value="1"required="Data Required">Accountant  
            <input type="radio" name="staff" value="0"required="Data Required">Student<br>
            <h4>Enter name</h4>
            <input type="text" name="name" placeholder="Full name"required="Data Required"><br>
            <h4>Enter class</h4>
            <input type="number" name="class" placeholder="class"required="Data Required" min="1"max="10"><br>
            <h4>Enter Phone no:</h4>
            <input type="text" name="phone" placeholder="phone"required="Data Required">
            <input type="submit" value="Register">
            
        </form>
            </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
