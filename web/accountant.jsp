<%-- 
    Document   : staff
    Created on : Jan 10, 2018, 11:26:10 AM
    Author     : Nandan Raj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <%@include file="accountantHeader.jsp" %>
    <center><h1>Accountant</h1></center>
        <% String username=(String)session.getAttribute("username");
        String name=(String)session.getAttribute("name");
        
        String phone=(String)session.getAttribute("phone");

        
        %>
        <div style="margin-left: 200px; margin-top: 80px">
                <h4>UserName:</h4>
                <p><% out.print(username); %></p><br>
                <h4>Name:</h4>
                <h5><% out.print(name); %></h5><br>
                
                <h4>Phone:</h4>
                <h5><% out.print(phone); %></h5><br>
                
        </div>
    <%@include file="footer.jsp"%>
    </body>
</html>
