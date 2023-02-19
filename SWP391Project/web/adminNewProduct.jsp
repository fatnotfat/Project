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
            Name <input type="text" name="txtName" value="" /><br/>
            <c:if test="${not empty errors.nameLengthError}">
                <font color="red">
                ${errors.nameLengthError}
                </font><br/>
            </c:if>
            Description <input type="text" name="txtDescription" value="" /><br/>
            <c:if test="${not empty errors.descriptionLengthError}">
                <font color="red">
                ${errors.descriptionLengthError}
                </font><br/>
            </c:if>
            Quantity <input type="number" name="txtQuantity" value="1" /><br/>
            Price <input type="number" name="txtPrice" value="1" /><br/>
            Size <input type="number" name="txtSize" value="1" /><br/>
            CategoryID <input type="number" name="txtCategoryID" value="1" /><br/>
            BrandID <input type="number" name="txtBrandID" value="1" /><br/>
            <input type="submit" value="Add" /> 
        </form>
    </body>
</html>
