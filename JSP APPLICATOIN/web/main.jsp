<%-- 
    Document   : main
    Created on : 13 Oct 2026, 2:15:03 pm
    Author     : Rajguru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String x = (String)session.getAttribute("user") ;
            out.println("Welcome"+x);
       
       %>
    </body>
</html>
