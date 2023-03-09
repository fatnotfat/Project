<%-- 
    Document   : login
    Created on : Jan 30, 2023, 1:19:59 PM
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
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            />
        <link rel="stylesheet" href=" style/reset.css" />
        <link rel="stylesheet" href=" style/login.css" />
        <title>Login</title>
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

                <div class="nav-bot-responsive">
                    <div class="container">
                        <div class="menu-responsive-icon">
                            <img
                                class="menu-responsive-icon-img"
                                srcset="images/shopping-cart.png 2x"
                                alt=""
                                />
                        </div>
                        <a href="#!" class="menu-responsive-logo"> LOGO </a>
                        <div class="menu-responsive-icon">
                            <img
                                class="menu-responsive-icon-img"
                                srcset="images/textalign-justifycenter.png 2x"
                                alt=""
                                />
                        </div>
                    </div>
                </div>
            </header>
            <img src="images/Nav-line.png" alt="" />
            <div class="login">
                <div class="container">
                    <div class="login-heading">
                        <h1>Login</h1>
                    </div>
                    <img srcset="images/Login-line.png 2x" alt="" 
                         class="login-space"/>
                    <div class="login-form-container">

                        <form action="loginController" method="POST">
                            <div class="login-form">
                                <c:set var = "errors" value="${requestScope.LOGIN_ERROR}"/>
                                <input type="text" name="txtEmail"
                                       class="login-input-email"
                                       placeholder="Email"
                                       value="${param.txtEmail}" /><br/>
                                <c:if test="${not empty errors.emailLengthError}">
                                    <font color="red">
                                    ${errors.emailLengthError}
                                    </font><br/>
                                </c:if>
                                <input type="password" name="txtPassword"
                                       class="login-input-password"
                                       placeholder="Password"
                                       value="" /><br/>
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
                            </div>
                            <div class="login-option">
                                <div class="login-option-checkbox">
                                    <input
                                        type="checkbox"
                                        class="login-option-input-checkbox"
                                        id="create-acc"
                                        name="create-acc"
                                        />
                                    <span class="login-option-input-check-logo"
                                          ></span>
                                    <label for="create-acc" class="login-option-input-keep"
                                           >Keep me logged in</label>
                                </div>
                                <a class="login-link" href="customerVerifyPage">Forgot password?</a>
                            </div>
                            <div class="login-function">
                                <p class="login-function-security">
                                    This site is protected by reCAPTCHA and the Google
                                    <a href="https://policies.google.com/terms">Privacy Policy</a>
                                    and
                                    <a href="https://policies.google.com/privacy"
                                       >Terms of Service</a
                                    >
                                    apply.
                                </p>
                                <input class="login-function-btn" type="submit" value="Login" name="btAction" />
                                <p class="login-function-register">
                                    <span class="login-function-register-question">
                                        Don't have an account?
                                    </span>
                                    <a href="signUpPage" class="login-function-register-hightlight"
                                       >Register</a>
                                    <br/>

                                </p>
                                <span class="login-function-register-question">Or</span>
                                <a class="login-link" href="https://accounts.google.com/o/oauth2/auth?scope=email%20profile%20openid&redirect_uri=http://localhost:8080/SWP391ProjectMVC/LoginGoogleHandler&response_type=code
                                   &client_id=781842961263-gokuov74qslei1a1t44nufilc8u0d8sb.apps.googleusercontent.com&approval_prompt=force">Login with Google</a>
                            </div>                              
                        </form><br/>
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
