<%-- 
    Document   : verifyCode
    Created on : Feb 5, 2023, 7:55:30 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verify Page</title>
    </head>
    <body>
        <span>We already send a verification code to your email.</span>
        <form action="verifyCodeController" method="POST">
            <c:set var = "scope" value="${requestScope.VERIFYCODE_SCOPE}"/>
            Code <input type="text" name="txtCode"
                         value="${param.txtCode}"><br/>
            <c:if test="${not empty scope.codeLengthError}">
                <font color="red">
                ${scope.codeLengthError}
                </font><br/>
            </c:if>
            <c:if test="${not empty scope.codeNotExisted}">
                <font color="red">
                ${scope.codeNotExisted}
                </font><br/>
            </c:if>
            <input type="submit" value="Verify">
        </form>
    </body>
</html>
