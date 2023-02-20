<%-- 
    Document   : shippingPage
    Created on : Feb 20, 2023, 2:15:16 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shipping Page</title>
    </head>
    <body>
        <h1>Shipping</h1>
        <h2>Information</h2>

        <h2>Shipping methods</h2>
        <form action="shippingController" method="POST">
            Order: <input type="hidden" name="txtOrdersDtID" 
                          value="${100}" />${100}<br/>
            <input type="radio" name="chkShippingID" 
                   value="${1}" />Standard<br/>
            <input type="submit" value="Choose" />
        </form>
    </body>
</html>
