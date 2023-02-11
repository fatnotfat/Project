<%-- 
    Document   : resetPassword
    Created on : Feb 6, 2023, 4:57:15 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
    </head>
    <body>
        <h1>Please input your password</h1>
        <form action="resetPasswordController" method="POST">
            <c:set var = "errors" value="${requestScope.RESETPASSWORD_ERROR}"/>
            Password* <input type="password" name="txtPassword" value="" /> (e.g, 6 - 30 chars)<br/>
            <c:if test="${not empty errors.passwordLengthError}">
                <font color="red">
                ${errors.passwordLengthError}
                </font><br/>
            </c:if>
            Confirm* <input type="password" name="txtConfirm" value="" /><br/>
            <c:if test="${not empty errors.confirmNotMatched}">
                <font color="red">
                ${errors.confirmNotMatched}
                </font><br/>
            </c:if>
            <input type="submit" value="Reset" name="btAction" />
        </form>
    </body>
</html>
