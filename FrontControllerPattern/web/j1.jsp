<%-- 
    Document   : j1
    Created on : Aug 11, 2014, 6:09:21 PM
    Author     : sanketnayak
--%>

<%@page import="com.org.sanket.UserForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Welcome<% 
            HttpSession s = request.getSession();
            UserForm f = (UserForm) s.getAttribute("form");
            out.println(" "+f.getUsername());
           %></title>
    </head>
    <body>
        <h1>I am Entry 1 from S1</h1>
    
    </body>
</html>
