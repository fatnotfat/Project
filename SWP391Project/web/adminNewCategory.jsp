<%-- 
    Document   : adminNewCategory
    Created on : Feb 17, 2023, 10:35:30 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Category Page</title>
    </head>
    <body>
        <h1>Create new category</h1>
        <form action="adminNewCategoryController" method="POST">
            <c:set var="errors" value="${requestScope.ADMINNEWCATEGORY_ERROR}"/>
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
            <input type="submit" value="Add" />
        </form>
    </body>
</html>
