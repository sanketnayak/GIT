<%-- 
    Document   : index
    Created on : Aug 6, 2014, 2:38:46 PM
    Author     : sanketnayak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Page</title>
        <link rel="stylesheet" href="demo.css">
        <script type="text/javascript" src="functions.js"></script>
        
    </head>
    <body>
        
        <h1>JSP Test</h1>
        <p id="a" onclick="f1()">Paragraph 1</p>
        <p class="sanket">Paragraph 2</p>
        
        <% 
            
            for (int i =0 ; i < Integer.parseInt(request.getParameter("count")) ; i++) {
                out.println("<p><b>" + request.getParameter("name") + "<br><p>");
            }
            
            out.print("<script> var p = document.getElementById('a');p.innerHTML = 'Manish';");
         %>
    </body>
</html>
