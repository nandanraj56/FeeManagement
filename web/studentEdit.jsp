<%-- 
    Document   : studentEdit
    Created on : Jan 18, 2018, 1:21:09 AM
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
<%
    String uname=(String)session.getAttribute("username");
    String pass=(String)session.getAttribute("password");
    String name=(String)session.getAttribute("name");
    String standard=(String)session.getAttribute("class");
    String phone=(String)session.getAttribute("phone");
    

%>
    <center><h1>Edit Your Data</h1></center>
        <form action="StudentEdit" method="post" style="margin-left: 100px;margin-top: 50px">
            <p>Username:</p>
            <% out.print(uname);%><br>
            <p>Password</p>
            <input type="text" value="<% out.print(pass);%>" name="pass">
            <p>Name</p>
            <input type="text" value="<% out.print(name);%>"name="name">
            <p>Class</p>
            <input type="Number" value="<% out.print(standard);%>" min="1"max="10"name="class">
            <p>Phone</p>
            <input type="text" value="<% out.print(phone);%>" name="phone">
            
            <input type="Submit" value="Change">
        </form>
    <%@include file="footer.jsp"%>
    </body>
</html>
