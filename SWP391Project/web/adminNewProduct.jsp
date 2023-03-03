<%-- 
    Document   : adminNewProduct
    Created on : Feb 16, 2023, 4:16:16 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Product Page</title>
    </head>
    <body>
        <h1>Create new product</h1>
        <form action="adminNewProductController" method="POST">
            <c:set var="errors" value="${requestScope.ADMINNEWPRODUCT_ERROR}"/>
            Name <input type="text" name="txtName" 
                        value="${param.txtName}" /><br/>
            <c:if test="${not empty errors.nameLengthError}">
                <font color="red">
                ${errors.nameLengthError}
                </font><br/>
            </c:if>
            Description <input type="text" name="txtDescription" 
                               value="${param.txtDescription}" /><br/>
            <c:if test="${not empty errors.descriptionLengthError}">
                <font color="red">
                ${errors.descriptionLengthError}
                </font><br/>
            </c:if>
            Quantity <input type="number" name="txtQuantity" value="1" /><br/>
            <c:if test="${not empty errors.quantityError}">
                <font color="red">
                ${errors.quantityError}
                </font><br/>
            </c:if>
            Price <input type="number" name="txtPrice" value="1" /><br/>
            <c:if test="${not empty errors.priceError}">
                <font color="red">
                ${errors.priceError}
                </font><br/>
            </c:if>
            Size <input type="number" name="txtSize" value="1" /><br/>
            <c:if test="${not empty errors.sizeError}">
                <font color="red">
                ${errors.sizeError}
                </font><br/>
            </c:if>
            <c:set var="categoryResults" value="${requestScope.CATEGORY_RESULT}"/>
            Category <select name="cboCategory">
                <c:forEach var="dto1" items="${categoryResults}">
                    <option value="${dto1.categoryID}">${dto1.categoryID}-${dto1.name}</option>
                </c:forEach>
            </select><br/>
            <c:set var="brandResults" value="${requestScope.BRAND_RESULT}"/>
            Brand <select name="cboBrand">
                <c:forEach var="dto2" items="${brandResults}">
                    <option value="${dto2.brandID}">${dto2.brandID}-${dto2.name}</option>
                </c:forEach>
            </select><br/>
            <input type="submit" value="Add" /> 
        </form>
    </body>
</html>
