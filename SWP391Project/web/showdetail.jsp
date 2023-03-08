<%-- 
    Document   : showdetail
    Created on : Mar 6, 2023, 1:41:30 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Monthly Sales Chart</h1>
        <img src="data:image/png;base64,${base64EncodedChart}" alt="Monthly Sales Chart">
    </body>
</html>
