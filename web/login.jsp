<%-- 
    Document   : login
    Created on : Jan 9, 2018, 11:18:25 PM
    Author     : Nandan Raj
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
    </head>
    <body>
        <%@include file="loginHeader.jsp" %>
        <h1><center>Login</center></h1>
        
        <div style="padding-left: 50px">
            <form action="login" method="post">
                <h4 style="padding-top: 10px">Username</h4>
                <input type="text" name="uname" placeholder="username"required="Data Required" >
                <h4 style="padding-top: 10px">Password</h4>
                <input type="password" name="pass" placeholder="password" required="Data Required">
                <input type="submit" value="Login">
                
                
            </form>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>

