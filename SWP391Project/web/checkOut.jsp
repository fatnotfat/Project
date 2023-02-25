<%-- 
    Document   : checkOut
    Created on : Feb 24, 2023, 9:40:17 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Out Page</title>
    </head>
    <body>
        <h1>Thanks ${sessionScope.USER.name} for choosing us</h1>
        <h2>Here is the bill</h2>
        <c:set var="customerInfomation" value="${sessionScope.USER}"/>
        Order number: <br/>
        Name: ${customerInfomation.name}<br/>
        Address: ${customerInfomation.address}<br/>
        Phone Number: ${customerInfomation.phone}<br/>
        Email Address: ${customerInfomation.email}<br/>
        Total: <br/>
        <h2>We will contact you soon</h2>
        <a href="mainPage">Click here to back home</a>
    </body>
</html>
