<%-- 
    Document   : searchByFilter
    Created on : Feb 13, 2023, 8:29:38 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Filtered Results</title>
    </head>
    <body>
        <h1>Filtered Results</h1>
        <form action="searchByFilterController" method="POST">
            Name <input type="text" name="txtName" value="${param.txtName}" /><br/>
            Price From <input type="number" name="txtPriceFrom" value="1" /><br/>
            Price To <input type="number" name="txtPriceTo" value="20" /><br/>
            Size <input type="number" name="txtSize" value="5" /><br/>
            Category <input type="text" name="txtCategory" value="10" /><br/>
            <input type="submit" value="Search" name="btAction" /><br/>
        </form><br/>
        <c:set var="result" value="${requestScope.SEARCHBYFILTER_RESULT}"/>
        <c:if test="${not empty result}">
            <table border="1">
                <thead>
                    <tr>
                        <th>Number</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Size</th>
                        <th>Category</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dto" items="${result}" varStatus="counter">
                        <tr>
                            <td>${counter.count}</td>
                            <td>${dto.name}</td>
                            <td>${dto.description}</td>
                            <td>${dto.quantity}</td>
                            <td>${dto.price}</td>
                            <td>${dto.size}</td>
                            <td>${dto.category}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <c:if test="${empty result}">
            <h2>Sorry, We could not find anything for "${param.txtName}".</h2>
        </c:if>
    </body>
</html>
