<%-- 
    Document   : signUp
    Created on : Oct 20, 2022, 9:06:54 AM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <h1>Create new account</h1>
        <form action="signUpController" method="POST">
            <c:set var = "errors" value="${requestScope.SIGNUP_ERROR}"/>
            Name* <input type="text" name="txtName"
                         value="${param.txtName}" /><br/>
            <c:if test="${not empty errors.nameLengthError}">
                <font color="red">
                ${errors.nameLengthError}
                </font><br/>
            </c:if>
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
            Email* <input type="text" name="txtEmail" 
                          value="${param.txtEmail}" /><br/>
            <c:if test="${not empty errors.emailLengthError}">
                <font color="red">
                ${errors.emailLengthError}
                </font><br/>
            </c:if>
            <c:if test="${not empty errors.emailIsExisted}">
                <font color="red">
                ${errors.emailIsExisted}
                </font><br/>
            </c:if>
            Phone* <input type="tel" name="txtPhone" 
                          value="${param.txtPhone}" /><br/>
            <c:if test="${not empty errors.phoneLengthError}">
                <font color="red">
                ${errors.phoneLengthError}
                </font><br/>
            </c:if>
            Address* <input type="text" name="txtAddress" 
                            value="${param.txtAddress}" /><br/>
            <c:if test="${not empty errors.addressLengthError}">
                <font color="red">
                ${errors.addressLengthError}
                </font><br/>
            </c:if>
            Birthday <input type="date" name="txtBirthDate" 
                             value="${param.txtBirthDate}" /><br/>

            Sex <br/><input type="radio" name="txtSex" value="Male" checked> Male<br>
            <input type="radio" name="txtSex" value="Female"> Female<br>
            <input type="radio" name="txtSex" value="Other"> Other<br>

            <input type="submit" value="Sign up" name="btAction" /><br/>
        </form>
        Already have an account? <a href="loginPage">Login</a> here<br/>
    </body>
</html>
