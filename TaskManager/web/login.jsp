<%-- 
    Document   : login
    Created on : Aug 19, 2014, 4:51:21 PM
    Author     : sanketnayak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form method="get" action="http://localhost:8081/TaskManager/TaskAction.do">           
            Username:<input type="text" name="username"><br>
            Password: <input type="password" name="pwd">
            <input type="submit" value="Go">
        </form>
    </body>
</html>
