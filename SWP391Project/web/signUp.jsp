<%-- 
    Document   : signUp
    Created on : Oct 20, 2022, 9:06:54 AM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--<%@ page language="java"
contentType="text/html;
charset=utf-8"
pageEncoding="utf-8"
import="java.sql.*"
%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap"
            rel="stylesheet"
            />
        <link rel="stylesheet" href="style/reset.css" />
        <link rel="stylesheet" href="style/register.css" />
        <title>Sign Up</title>
    </head>
    <body>
        <div class="wrapper">
            <header class="header">
                <div class="nav-top">
                    <div class="container">
                        <div class="shipping">
                            <p class="shipping-text">Free shipping with recept from 200$</p>
                        </div>
                    </div>
                </div>
                <img src="images/Nav-line.png" alt="" />
                <div class="nav-bot">
                    <div class="container">
                        <a href="#!" class="menu-logo"> LOGO </a>
                        <ul class="menu">
                            <li class="menu-item">
                                <a href="#!" class="menu-link">Categories</a>
                            </li>
                            <li class="menu-item">
                                <a href="#!" class="menu-link">About</a>
                            </li>
                            <li class="menu-item">
                                <a href="#!" class="menu-link">Shop</a>
                            </li>
                            <li class="menu-item">
                                <a href="#!" class="menu-link">Contact</a>
                            </li>
                        </ul>
                        <div class="menu-icon">
                            <img
                                class="menu-icon-img"
                                srcset="images/search-normal.png 2x"
                                alt=""
                                />
                            <img
                                class="menu-icon-img"
                                srcset="images/profile-circle.png 2x"
                                alt=""
                                />
                            <img
                                class="menu-icon-img"
                                srcset="images/shopping-cart.png 2x"
                                alt=""
                                />
                        </div>
                    </div>
                </div>
            </header>
            <img src="images/Nav-line.png" alt="" />
            <div class="register">
                <div class="container">
                    <div class="register-heading">
                        <h1>Register</h1>
                    </div>
                    <img src="images/Login-line.png" alt="" />

                    <div class="register-form-container">
                        <form action="signUpController" method="POST">
                            <div class="register-form">

                                <c:set var = "errors" value="${requestScope.SIGNUP_ERROR}"/>
                                <input type="text" name="txtFirstName"
                                       class="register-input-first-name"
                                       placeholder="First name"
                                       value="" /><br/>
                                <c:if test="${not empty errors.firstNameLengthError}">
                                    <font color="red">
                                    ${errors.firstNameLengthError}
                                    </font><br/>
                                </c:if>
                                <input type="text" name="txtLastName"
                                       class="register-input-last-name"
                                       placeholder="Last name"
                                       value="" /><br/>
                                <c:if test="${not empty errors.lastNameLengthError}">
                                    <font color="red">
                                    ${errors.lastNameLengthError}
                                    </font><br/>
                                </c:if>

                                <div class="register-form-gender">
                                    <br/>
                                    <div class="register-form-radio">
                                        <input type="radio" name="txtSex"
                                               class="register-form-input-radio"
                                               id="gender-male"
                                               value="Male" checked/>
                                        <span class="register-form-input-check-logo"></span>
                                        <label for="gender-male" class="register-form-input-male"
                                               >Male</label>
                                    </div>
                                    <div class="register-form-radio">
                                        <input type="radio" name="txtSex"
                                               class="register-form-input-radio"
                                               id="gender-female"value="Female"/>
                                        <span class="register-form-input-check-logo"></span>
                                        <label for="gender-female" class="register-form-input-female"
                                               >Female</label>
                                    </div>
                                </div>
                                <input type="date" name="txtBirthDate"
                                       class="register-input-date"
                                       placeholder="mm/dd/yyyy"
                                       value="${param.txtBirthDate}" /><br/>
                                <c:if test="${not empty errors.birthDateLengthError}">
                                    <font color="red">
                                    ${errors.birthDateLengthError}
                                    </font><br/>
                                </c:if>

                                <input type="text" name="txtEmail"
                                       class="register-input-email"
                                       placeholder="Email"
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

                                <input type="password" name="txtPassword"
                                       class="register-input-password"
                                       placeholder="Password"
                                       value="" /> (e.g, 6 - 30 chars)<br/>
                                <c:if test="${not empty errors.passwordLengthError}">
                                    <font color="red">
                                    ${errors.passwordLengthError}
                                    </font><br/>
                                </c:if>
                                <input type="password" name="txtConfirm"
                                       class="register-input-confirm-password"
                                       placeholder="Confirm Password"
                                       value="" /><br/>
                                <c:if test="${not empty errors.confirmNotMatched}">
                                    <font color="red">
                                    ${errors.confirmNotMatched}
                                    </font><br/>
                                </c:if>

                            </div>
                            <div class="register-function">
                                <p class="register-function-security">
                                    This site is protected by reCAPTCHA and the Google
                                    <a href="https://policies.google.com/terms">Privacy Policy</a>
                                    and
                                    <a href="https://policies.google.com/privacy"
                                       >Terms of Service</a>
                                    apply.
                                </p>
                                <input class="register-function-btn"
                                       type="submit" value="Sign up"
                                       name="btAction" /><br/>

                                <p class="register-function-register">
                                    <span class="register-function-register-question">
                                        Already have an account?
                                    </span> <a href="loginPage" class="register-function-register-hightlight" >Login</a> here<br/>
                                </p>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <img src="images/Footer-line.png" alt="" />
            <footer class="footer">
                <div class="container">
                    <ul class="footer-menu">
                        <li class="footer-menu-item">
                            <a href="#!" class="footer-menu-link">Help</a>
                        </li>
                        <li class="footer-menu-item">
                            <a href="#!" class="footer-menu-link">Hotline</a>
                        </li>
                        <li class="footer-menu-item">
                            <a href="#!" class="footer-menu-link">Instagram</a>
                        </li>
                        <li class="footer-menu-item">
                            <a href="#!" class="footer-menu-link">Shopee</a>
                        </li>
                        <li class="footer-menu-item">
                            <a href="#!" class="footer-menu-link">Lazada</a>
                        </li>
                        <li class="footer-menu-item">
                            <a href="#!" class="footer-menu-link">Facebook</a>
                        </li>
                        <li class="footer-menu-item">
                            <a href="#!" class="footer-menu-link">License</a>
                        </li>
                    </ul>
                </div>
            </footer>
        </div>
    </body>   
</html>
