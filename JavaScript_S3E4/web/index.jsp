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
        <title>JSP Page</title>
        <link rel="stylesheet" href="demo.css">
        <script type="text/javascript" src="functions.js"></script>
        <script src="http://cdn.jsdelivr.net/rgraph/20131231/libraries/jquery.min.js"></script>
        <script>
            function f1() {
                if($('#count').val()>100) {
                    $('#test').css("background-color","red");
                }
            }
        </script>
    </head>
    <body>
        
     <div id="test">
        <form name="input" action="test.jsp" method="post">
            Count :  <input id="count" type="text" name="count">
              Message  :  <input type="text" name="name">
              <input type="submit" value="Submit"><input type="button" value="verify" onclick="f1()">
        </form>
     </div>
    </body>
</html>



function f1() {
            if ($( "#sel1 option:selected" ).text() === "") {
                $('#op1').html("");
                $('#op2').html("");
                $('#op3').html("");
            }   
            if ($( "#sel1 option:selected" ).text() === "Category 1") {
                $('#op1').html("Item 1");
                $('#op2').html("Item 2");
                $('#op3').html("Item 3");
            }   
            if ($( "#sel1 option:selected" ).text() === "Category 2")
             {
                $('#op1').html("Item 4");
                $('#op2').html("Item 5");
                $('#op3').html("Item 6");
            }  
            if ($( "#sel1 option:selected" ).text() === "Category 3")
            {
                $('#op1').html("Item 7");
                $('#op2').html("Item 8");
                $('#op3').html("Item 9");
            }
        }