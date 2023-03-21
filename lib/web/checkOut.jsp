<%-- 
    Document   : checkOut
    Created on : Feb 26, 2023, 3:29:13 AM
    Author     : Duy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="swp391.product.ProductDAO" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Out Page</title>
    </head>
    <body>
        <h1>Thanks ${sessionScope.USER.name} for choosing us</h1>
        <h2>Here is the bill</h2>
        <c:set var="customerInfomation" value="${requestScope.SHIPPING_INFO_FOR_CHECKOUT}"/>
        
        
        Order number: ${customerInfomation.ordersID}<br/>
        Date order: ${customerInfomation.dateOrders}<br/>
        Name: ${customerInfomation.cusName}<br/>
        Address: ${customerInfomation.cusAddress}<br/>
        Phone Number: ${customerInfomation.cusPhone}<br/>
        Email Address: ${sessionScope.USER.email}<br/>
        Total: ${totalPrice} <br/>
        <h2>We will contact you soon</h2>
        <a href="mainPage">Click here to back home</a>
    </body>
</html>
