<%-- 
    Document   : student
    Created on : Jan 10, 2018, 11:25:56 AM
    Author     : Nandan Raj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <%@include file="studentHeader.jsp" %>
        <center><h1>Student</h1></center>
        <% String username=(String)session.getAttribute("username");
        String name=(String)session.getAttribute("name");
        String standard=(String)session.getAttribute("class");
        String phone=(String)session.getAttribute("phone");
        String fee=(String)session.getAttribute("fee");
        
        %>
        <div style="margin-left: 200px; margin-top: 80px">
                <h4>UserName:</h4>
                <p><% out.print(username); %></p><br>
                <h4>Name:</h4>
                <h5><% out.print(name); %></h5><br>
                <h4>Class:</h4>
                <h5><% out.print(standard); %></h5><br>
                <h4>Phone:</h4>
                <h5><% out.print(phone); %></h5><br>
                <h4>Fee Renaming:</h4>
                <h5><% out.print(fee); %></h5><br>
        </div>
           
         <%@include file="footer.jsp"%>
    </body>
</html>
