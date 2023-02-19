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
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap"
            rel="stylesheet"
            />
        <link rel="stylesheet" href="style/reset.css" />
        <link rel="stylesheet" href="style/forgot-password-2.css" />
        <title>Verify Page</title>
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
            <div class="forgot">
                <div class="container">
                    <div class="forgot-heading">
                        <h1>Password Recovery</h1>
                    </div>
                    <img srcset="images/Login-line.png 2x" alt="" />
                    <div class="forgot-form-container">
                        <img srcset="images/security-user.png 2x" alt="" />
                        <h3 class="forgot-text">Enter Code</h3>
                        <p class="forgot-text-detail">
                            We sent OTP code to your email address
                        </p>
                        <form action="verifyCodeController" method="POST">
                            <div class="forgot-form">
                                <c:set var = "scope" value="${requestScope.VERIFYCODE_SCOPE}"/>
                                <div class="forgot-input">
                                    <input type="number" class="forgot-input-otp"
                                           name="txtCode1" value="${param.txtCode1}"/><br/>
                                </div>
                                <div class="forgot-input">
                                    <input type="number" class="forgot-input-otp"
                                           name="txtCode2" value="${param.txtCode2}"/><br/>
                                </div>
                                <div class="forgot-input">
                                    <input type="number" class="forgot-input-otp"
                                           name="txtCode3" value="${param.txtCode3}"/><br/>
                                </div>
                                <div class="forgot-input">
                                    <input type="number" class="forgot-input-otp"
                                           name="txtCode4" value="${param.txtCode4}"/><br/>
                                </div>
                                <!--                                Code <input type="text" name="txtCode"
                                                                            value="${param.txtCode}"><br/>-->
                            </div>
                            <c:if test="${not empty scope.codeLengthError}">
                                <p class="forgot-form-container" 
                                   style="font-size: 20px; color: red" >
                                    ${scope.codeLengthError}
                                </p>
                            </c:if>
                            <c:if test="${not empty scope.codeNotExisted}">
                                <p class="forgot-form-container" 
                                   style="font-size: 20px; color: red" >
                                    ${scope.codeNotExisted}
                                </p>
                            </c:if>
                            <div class="forgot-function">
                                <p class="forgot-function-security">
                                    This site is protected by reCAPTCHA and the Google
                                    <a href="https://policies.google.com/terms">Privacy Policy</a>
                                    and
                                    <a href="https://policies.google.com/privacy"
                                       >Terms of Service</a
                                    >
                                    apply.
                                </p>
                                <div class="forgot-function-choose">
                                    <input type="submit" value="VERIFY" class="forgot-function-btn">
                                    <a href="loginPage" class="forgot-function-cancel">Cancel</a>
                                </div>
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
