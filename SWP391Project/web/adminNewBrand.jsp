<%-- 
    Document   : adminNewBrand
    Created on : Feb 17, 2023, 10:35:16 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Brand Page</title>
    </head>
    <body>
        <h1>Create new brand</h1>
        <form action="adminNewBrandController" method="POST">
            Name <input type="text" name="txtName" value="" />
            Description <input type="text" name="txtDescription" value="" />
            <input type="submit" value="Add" />
        </form>
    </body>
</html>
