<%-- 
    Document   : main01
    Created on : 19 Oct 2026, 3:16:00 pm
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
        <h1>Hello World!</h1>
        <form action="" method="POST">
            USer id:
            <input type="text" name="t1"><br>
            Password:
            <input type="text" name="t2"><br>
            
            <<input type="submit" value="Login">
      
        </form>
        <% 
            String msg =(String)session.getAttribute("message");
            if(msg!=null){
            out.println(msg);
            }
            
            %>
    </body>
</html>
