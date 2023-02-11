<%-- 
    Document   : customerVerify
    Created on : Feb 6, 2023, 3:52:32 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email Verification</title>
    </head>
    <body>
        <h1>Email Verification</h1>
        <form action="customerVerifyController" method="POST">
            <c:set var = "scope" value="${requestScope.VERIFYMAIL_SCOPE}"/>
            Email <input type="email" name="txtEmail" 
                         value="${param.txtEmail}"><br/>
            <c:if test="${not empty scope.emailLengthError}">
                <font color="red">
                ${scope.emailLengthError}
                </font><br/>
            </c:if>
            <c:if test="${not empty scope.emailNotExisted}">
                <font color="red">
                ${scope.emailNotExisted}
                </font><br/>
            </c:if>
            <input type="submit" value="Register">
        </form>
    </body>
</html>
