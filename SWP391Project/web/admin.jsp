<%-- 
    Document   : admin
    Created on : Feb 16, 2023, 2:33:55 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Page</title>
    </head>
    <body>
        <h1>Administrator Login Page</h1>
        <form action="adminLoginController" method="POST">
            Username <input type="text" name="txtUsername" value="" /><br/>
            Password <input type="password" name="txtPassword" value="" /><br/>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
