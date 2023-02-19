<%-- 
    Document   : admin
    Created on : Feb 16, 2023, 2:33:55 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Login Page</title>
    </head>
    <body>
        <h1>Administrator login page</h1>
        <form action="adminLoginController" method="POST">
            <c:set var="errors" value="${requestScope.ADMINLOGIN_ERROR}"/>
            Username <input type="text" name="txtUsername" 
                            value="${param.txtUsername}" /><br/>
            <c:if test="${not empty errors.usernameLengthError}">
                <font color="red">
                ${errors.usernameLengthError}
                </font><br/>
            </c:if>
            Password <input type="password" name="txtPassword" value="" /><br/>
            <c:if test="${not empty errors.passwordLengthError}">
                <font color="red">
                ${errors.passwordLengthError}
                </font><br/>
            </c:if>
            <c:if test="${not empty errors.loginFail}">
                <font color="red">
                ${errors.loginFail}
                </font><br/>
            </c:if>
            <input type="submit" value="Login" />
        </form>
            
    </body>
</html>
