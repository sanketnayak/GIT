<%-- 
    Document   : Result
    Created on : Dec 4, 2014, 4:51:04 AM
    Author     : sanketnayak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="css/text">
                    .body{
                         width:100%;
        height: 100%;
        background: #E6A3A3;
        color:#555 !important;
        font-family:'Lucida Grande';
        font-size:14px;
}
        .CSSTableGenerator {
	margin:0px;padding:0px;
	width:100%;
	box-shadow: 10px 10px 5px #888888;
	border:1px solid #000000;
	
	-moz-border-radius-bottomleft:0px;
	-webkit-border-bottom-left-radius:0px;
	border-bottom-left-radius:0px;
	
	-moz-border-radius-bottomright:0px;
	-webkit-border-bottom-right-radius:0px;
	border-bottom-right-radius:0px;
	
	-moz-border-radius-topright:0px;
	-webkit-border-top-right-radius:0px;
	border-top-right-radius:0px;
	
	-moz-border-radius-topleft:0px;
	-webkit-border-top-left-radius:0px;
	border-top-left-radius:0px;
        }.CSSTableGenerator table{
            border-collapse: collapse;
                border-spacing: 0;
                width:100%;
                height:100%;
                margin:0px;padding:0px;
        }.CSSTableGenerator tr:last-child td:last-child {
                -moz-border-radius-bottomright:0px;
                -webkit-border-bottom-right-radius:0px;
                border-bottom-right-radius:0px;
        }
        .CSSTableGenerator table tr:first-child td:first-child {
                -moz-border-radius-topleft:0px;
                -webkit-border-top-left-radius:0px;
                border-top-left-radius:0px;
        }
        .CSSTableGenerator table tr:first-child td:last-child {
                -moz-border-radius-topright:0px;
                -webkit-border-top-right-radius:0px;
                border-top-right-radius:0px;
        }.CSSTableGenerator tr:last-child td:first-child{
                -moz-border-radius-bottomleft:0px;
                -webkit-border-bottom-left-radius:0px;
                border-bottom-left-radius:0px;
        }.CSSTableGenerator tr:hover td{

        }
        .CSSTableGenerator tr:nth-child(odd){ background-color:#aad4ff; }
        .CSSTableGenerator tr:nth-child(even)    { background-color:#ffffff; }.CSSTableGenerator td{
                vertical-align:middle;


                border:1px solid #000000;
                border-width:0px 1px 1px 0px;
                text-align:left;
                padding:7px;
                font-size:10px;
                font-family:Arial;
                font-weight:normal;
                color:#000000;
        }.CSSTableGenerator tr:last-child td{
                border-width:0px 1px 0px 0px;
        }.CSSTableGenerator tr td:last-child{
                border-width:0px 0px 1px 0px;
        }.CSSTableGenerator tr:last-child td:last-child{
                border-width:0px 0px 0px 0px;
        }
        .CSSTableGenerator tr:first-child td{
                        background:-o-linear-gradient(bottom, #005fbf 5%, #003f7f 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #005fbf), color-stop(1, #003f7f) );
                background:-moz-linear-gradient( center top, #005fbf 5%, #003f7f 100% );
                filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#005fbf", endColorstr="#003f7f");	background: -o-linear-gradient(top,#005fbf,003f7f);

                background-color:#005fbf;
                border:0px solid #000000;
                text-align:center;
                border-width:0px 0px 1px 1px;
                font-size:14px;
                font-family:Arial;
                font-weight:bold;
                color:#ffffff;
        }
        .CSSTableGenerator tr:first-child:hover td{
                background:-o-linear-gradient(bottom, #005fbf 5%, #003f7f 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #005fbf), color-stop(1, #003f7f) );
                background:-moz-linear-gradient( center top, #005fbf 5%, #003f7f 100% );
                filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#005fbf", endColorstr="#003f7f");	background: -o-linear-gradient(top,#005fbf,003f7f);

                background-color:#005fbf;
        }
        .CSSTableGenerator tr:first-child td:first-child{
                border-width:0px 0px 1px 0px;
        }
        .CSSTableGenerator tr:first-child td:last-child{
                border-width:0px 0px 1px 1px;
        }
</script>
    </head>
    <body>
        <div class="CSSTableGenerator" id="table" >
                <table>
                    <tr>
                        <td>
                            <b>Settings</b>
                        </td>
                        <td>
                            <b>Value</b>
                        </td>      
                    </tr>   
                </table>
            </div>        
    </body>
    <script src="javascript/text">
        var table = document.getElementById("table");
        var tr1 = document.createElement("tr");
        var td1 = document.createElement("td");
        td1.innerHTML = "ip";
        var td2 = document.createElement("td");
        td2.innerHTML = <%= request.getAttribute("ip")%>;
        tr1.appendChild(td1);
        tr1.appendChild(td2);
        table.appendChild(tr1);
        
    if(<%=request.getAttribute("java")%> == 'true') {
        var tr1 = document.createElement("tr");
        var td1 = document.createElement("td");
        td1.innerHTML = "Java";
        var td2 = document.createElement("td");
        td2.innerHTML = "Installed";
        tr1.appendChild(td1);
        tr1.appendChild(td2);
        table.appendChild(tr1);
    }
    if(<%=request.getAttribute("tomcat")%> == 'true') {
        var tr1 = document.createElement("tr");
        var td1 = document.createElement("td");
        td1.innerHTML = "Tomcat";
        var td2 = document.createElement("td");
        td2.innerHTML = "Installed";
        tr1.appendChild(td1);
        tr1.appendChild(td2);
        table.appendChild(tr1);
    }
    if(<%=request.getAttribute("mysql")%> == 'true') {
        var tr1 = document.createElement("tr");
        var td1 = document.createElement("td");
        td1.innerHTML = "MySql";
        var td2 = document.createElement("td");
        td2.innerHTML = "Installed";
        tr1.appendChild(td1);
        tr1.appendChild(td2);
        table.appendChild(tr1);
    }
    if(<%=request.getAttribute("ruby")%> == 'true') {
        var tr1 = document.createElement("tr");
        var td1 = document.createElement("td");
        td1.innerHTML = "Ruby";
        var td2 = document.createElement("td");
        td2.innerHTML = "Installed";
        tr1.appendChild(td1);
        tr1.appendChild(td2);
        table.appendChild(tr1);
    }
    if(<%=request.getAttribute("perl")%> == 'true') {
        var tr1 = document.createElement("tr");
        var td1 = document.createElement("td");
        td1.innerHTML = "Perl";
        var td2 = document.createElement("td");
        td2.innerHTML = "Installed";
        tr1.appendChild(td1);
        tr1.appendChild(td2);
        table.appendChild(tr1);
    }
        
        
    </script>
    
</html>
