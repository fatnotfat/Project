<%-- 
    Document   : payment
    Created on : Feb 20, 2023, 12:07:52 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Page</title>
    </head>
    <body>
        <h1>Payment</h1>
        <h2>Information</h2>

        <h2>Payment methods</h2>
        <form action="paymentController" method="POST">
            Order: <input type="hidden" name="txtOrdersDtID" 
                          value="${100}" />${100}<br/>
            <input type="radio" name="chkPaymentID" 
                   value="${1}" />COD (Cash On Delivery)<br/>
            <input type="radio" name="chkPaymentID" 
                   value="${2}" />PayPal<br/>
            <input type="submit" value="Choose" />
        </form>
    </body>
</html>
