<%-- 
    Document   : mainPage
    Created on : Feb 8, 2023, 1:44:23 PM
    Author     : nguye
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
        <h1>Product Information</h1>
        <table border="1" class = "product">
            <tr>
                <th>Product ID</th>
                <th>Name</th>
                <th>Description</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Status</th>
                <th>Size</th>     
                <th>Create Time</th>    

            </tr>
            <c:forEach var="product" items="${requestScope.productList}">
                <tr>
                    <td><c:out value="${product.getProductID()}"></c:out></td>
                    <td><c:out value="${product.getName()}"></c:out></td>
                    <td><c:out value="${product.getDescription()}"></c:out></td>
                    <td><c:out value="${product.getQuantity()}"></c:out></td>
                    <td><c:out value="${product.getPrice()}"></c:out></td>
                    <td><c:out value="${product.getStatus()}"></c:out></td>
                    <td><c:out value="${product.getSize()}"></c:out></td>
                    <td><c:out value="${product.getCreateTime()}"></c:out></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
