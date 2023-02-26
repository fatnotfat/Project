<%-- 
    Document   : userInfor
    Created on : Feb 26, 2023, 12:04:13 AM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <link rel="stylesheet" href="style/reset.css" />
        <link rel="stylesheet" href="style/overview.css" />
        <title>User Information</title>
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
                <!-- NAV DESKTOP - TABLET -->
                <div class="nav-bot">
                    <div class="container">
                        <a href="mainPage" class="menu-logo"> LOGO </a>
                        <ul class="menu">
                            <li class="menu-item">
                                <a href="#!" class="menu-link menu-link-category">Categories</a>
                                <ul class="menu-link-category-tab">
                                    <div class="container">
                                        <li class="menu-link-category-tab-title">
                                            <a href="SearchByFilterServlet?txtProductCateID=1" class="menu-link menu-link-bracelet">BRACELET</a>
                                            <ul class="menu-link-category-tab-list">
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-bracelet">
                                                        1
                                                    </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-bracelet">
                                                        2
                                                    </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-bracelet">
                                                        3 
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-link-category-tab-title">
                                            <a href="#!" class="menu-link menu-link-ring">
                                                RING 
                                            </a>
                                            <ul class="menu-link-category-tab-list">
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-ring">
                                                        1 
                                                    </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-ring">
                                                        2 
                                                    </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-ring">
                                                        3 
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-link-category-tab-title">
                                            <a href="#!" class="menu-link menu-link-necklace">
                                                NECKLACE 
                                            </a>
                                            <ul class="menu-link-category-tab-list">
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-necklace">
                                                        1 
                                                    </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-necklace">
                                                        2 
                                                    </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-necklace">
                                                        3 
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-link-category-tab-title">
                                            <a href="#!" class="menu-link menu-link-earring">
                                                EARRINGS 
                                            </a>
                                            <ul class="menu-link-category-tab-list">
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-earring">
                                                        1 
                                                    </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-earring">
                                                        2 
                                                    </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-earring">
                                                        3 
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                    </div>
                                </ul>
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
                            <!-- SEARCH -->
                            <div class="menu-icon-tab">
                                <button class="menu-icon-tab-search" href="#!">
                                    <img
                                        class="menu-icon-img"
                                        srcset="images/search-normal.png 2x"
                                        alt=""
                                        />
                                </button>
                                <div class="menu-icon-tab-search-content">
                                    <div class="container">
                                        <div class="menu-icon-tab-search-content-title">
                                            <p class="menu-icon-tab-search-content-title-desc">
                                                SEARCH
                                            </p>
                                            <img srcset="images/Footer-line.png 2x" alt="" />
                                        </div>
                                        <div class="menu-icon-tab-search-form">
                                            <form action="searchTextController">
                                                <input
                                                    type="text"
                                                    class="menu-icon-tab-search-input"
                                                    placeholder="Search Product..."
                                                    name="txtSearch" value="${param.txtSearch}"
                                                    />
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- PROFILE -->
                            <div class="menu-icon-tab">
                                <button class="menu-icon-tab-profile" href="#!">
                                    <img
                                        class="menu-icon-img"
                                        srcset="images/profile-circle.png 2x"
                                        alt=""
                                        />
                                </button>
                                <div class="menu-icon-tab-profile-content">
                                    <div class="container">
                                        <c:if test="${not empty sessionScope.USER}">
                                            <div class="menu-icon-tab-profile-content-title">
                                                <p class="menu-icon-tab-profile-content-title-desc">
                                                    ACCOUNT INFORMATION
                                                </p>
                                                <img srcset="images/Footer-line.png 2x" alt="" />
                                            </div>
                                            <div class="menu-icon-tab-profile-form">
                                                <p class="menu-icon-tab-profile-form-name">${sessionScope.USER.name}</p>
                                                <a href="userInforPage" class="menu-icon-tab-profile-form-link"
                                                   >My account</a
                                                >
                                                <!--                                            <a href="#!" class="menu-icon-tab-profile-form-link"
                                                                                               >Address List</a
                                                                                            >-->
                                                <a href="logoutController" class="menu-icon-tab-profile-form-link"
                                                   >Log out</a
                                                >
                                            </div>
                                        </c:if>
                                        <c:if test="${empty sessionScope.USER}">
                                            <p style="font-size: 15px; margin: 5px 0">YOU ARE NOT ALREADY LOGGED, PLEASE LOGIN FIRST!!</p><br/>
                                            <a style="font-size: 15px; text-decoration: none; font-weight: bold" href="loginPage">Login here </a>
                                        </c:if>
                                    </div>
                                </div>
                            </div>
                            <!-- CART -->
                            <div class="menu-icon-tab">
                                <button class="menu-icon-tab-cart" href="#!">
                                    <img
                                        class="menu-icon-img"
                                        srcset="images/shopping-cart.png 2x"
                                        alt=""
                                        />
                                </button>
                                <div class="menu-icon-tab-cart-content">
                                    <div class="container">
                                        <div class="menu-icon-tab-cart-content-title">
                                            <div class="menu-icon-tab-cart-content-title-container">
                                                <p class="menu-icon-tab-cart-content-title-desc">
                                                    Cart
                                                </p>
                                                <img
                                                    srcset="images/Footer-line.png 2x"
                                                    alt=""
                                                    class="menu-icon-tab-cart-space"
                                                    />
                                            </div>
                                        </div>
                                        <div class="menu-icon-tab-cart-content-show">
                                            <div class="menu-icon-tab-cart-content-show-icon">
                                                <img
                                                    srcset="images/shopping-icon-tab.png 2x"
                                                    alt=""
                                                    />
                                            </div>
                                            <div class="menu-icon-tab-cart-content-show-txt">
                                                <p class="menu-icon-tab-cart-content-show-txt-desc">
                                                    There are currently no products
                                                </p>
                                            </div>
                                        </div>
                                        <img srcset="images/Footer-line.png 2x" alt="" />
                                        <div class="menu-icon-tab-cart-content-function">
                                            <div class="menu-icon-tab-cart-content-function-total">
                                                <p
                                                    class="menu-icon-tab-cart-content-function-total-txt"
                                                    >
                                                    TOTAL AMOUNT
                                                </p>
                                                <p
                                                    class="menu-icon-tab-cart-content-function-total-price"
                                                    >
                                                    0₫
                                                </p>
                                            </div>
                                            <div class="menu-icon-tab-cart-content-function-method">
                                                <button
                                                    class="menu-icon-tab-cart-content-function-method-btn"
                                                    >
                                                    VIEW CART
                                                </button>
                                                <button
                                                    class="menu-icon-tab-cart-content-function-method-btn"
                                                    >
                                                    PAY
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- NAV MOBILE -->
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
                <!--  -->
            </header>
            <img src="images/Nav-line.png" alt="" />



            <div class="overview">
                <div class="container">

                    <c:if test="${not empty sessionScope.USER}">
                        <div class="overview-left">
                            <h1 class="overview-left-title">ACCOUNT</h1>
                            <ul class="overview-left-list">
                                <li class="overview-left-item--circle">
                                    <a href="#!" class="overview-left-item-link">Account information</a> 
                                </li>
                                <!--                            <li class="overview-left-item--circle">
                                                                <a href="#!" class="overview-left-item-link">Address List</a> 
                                                            </li>-->
                                <li class="overview-left-item--circle">
                                    <a href="#!" class="overview-left-item-link">Log out</a> 
                                </li>
                            </ul>
                        </div>
                        <!-- ____________________________________________________ -->
                        <img class="overview-space" srcset="images/Login-line.png 2x" alt="" />
                        <div class="overview-right">
                            <div class="overview-right-account-info">
                                <h1 class="overview-right-account-info-title">ACCOUNT INFORMATION</h1>
                                <img srcset="images/Overview-line.png 2x" alt="">
                                <ul class="overview-right-account-info-option">
                                    <li class="overview-right-account-info-option-item">
                                        <p class="overview-right-account-info-option-item-name">${sessionScope.USER.name}</p>
                                    </li>
                                    <li class="overview-right-account-info-option-item">
                                        <p class="overview-right-account-info-option-item-mail">${sessionScope.USER.email}</p>
                                    </li>
                                    <!--                                <li class="overview-right-account-info-option-item">
                                                                        <p href="#!" class="overview-right-account-info-option-item-country">Country</p>
                                                                    </li>-->
                                    <!--                                <li class="overview-right-account-info-option-item">
                                                                        <a href="#!" class="overview-right-account-info-option-item-address">View address</a>
                                                                    </li>-->
                                    <li class="overview-right-account-info-option-item">
                                        <a href="#!" class="overview-right-account-info-option-item-orders">View list of order</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="overview-right-latest-order">
                                <div class="overview-right-latest-order-title">LATEST ORDER
                                    <img srcset="images/Overview-line.png 2x" alt="">
                                </div>
                                <div class="overview-right-latest-order-table">
                                    <div class="overview-right-latest-order-table-title">
                                        <ul class="overview-right-latest-order-table-title-list">
                                            <li class="overview-right-latest-order-table-title-list-item">Code</li>
                                            <li class="overview-right-latest-order-table-title-list-item">Booking date</li>
                                            <li class="overview-right-latest-order-table-title-list-item">Into money</li>
                                            <li class="overview-right-latest-order-table-title-list-item">Status</li>
                                            <li class="overview-right-latest-order-table-title-list-item">Transport</li>
                                        </ul>
                                        <img srcset="images/Overview-line.png 2x" alt="">
                                        <ul class="overview-right-latest-order-table-desc-list">
                                            <li class="overview-right-latest-order-table-desc-list-item">000000</li>
                                            <li class="overview-right-latest-order-table-desc-list-item">mm/dd/yyyyy</li>
                                            <li class="overview-right-latest-order-table-desc-list-item">000,000 vnđ</li>
                                            <li class="overview-right-latest-order-table-desc-list-item">Finished</li>
                                            <li class="overview-right-latest-order-table-desc-list-item">Delivered</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <c:if test="${empty sessionScope.USER}">
                        <div style="text-align: center; margin: 300px 0;">
                            <h1 style="font-size: 30px; margin: 20px 0;">YOU ARE NOT ALREADY LOGGED, PLEASE LOGIN FIRST!!</h1>
                            <a style="font-size: 20px; text-decoration: none; font-weight: bold" href="loginPage">Login here </a><span style="font-size: 20px">or </span><a style="font-size: 20px; text-decoration: none; font-weight: bold" href="signUpPage">Register here!</a><br/>
                            <span style="font-size: 20px">Or</span><br/>
                            <a style="font-size: 20px; text-decoration: none; font-weight: bold" href="https://accounts.google.com/o/oauth2/auth?scope=email%20profile%20openid&redirect_uri=http://localhost:8080/SWP391ProjectMVC/LoginGoogleHandler&response_type=code
                               &client_id=781842961263-gokuov74qslei1a1t44nufilc8u0d8sb.apps.googleusercontent.com&approval_prompt=force">Login with Google</a>
                        </div>
                    </c:if>
                </div>
            </div>
            <img src="images/Footer-line.png" alt="" />
            <footer class="footer">
                <div class="container">
                    <div class="footer-menu">
                        <div class="footer-menu-connect">
                            <h3 class="footer-menu-connect-title">CONNECT WITH US</h3>
                            <div class="footer-menu-connect-desc">
                                <p class="footer-menu-connect-desc-txt">
                                    PTDK is an accessory brand founded by people who are
                                    passionate about jewelry, love the crafts created by pure
                                    Vietnamese hands, and want to bring the works to the world.
                                </p>
                                <p class="footer-menu-connect-desc-txt">
                                    PTDK Company (Phat-Truong-Dung-Duy-Khoa)
                                </p>
                                <p class="footer-menu-connect-desc-txt">
                                    Email: cubiiwork@gmail.com
                                </p>
                                <p class="footer-menu-connect-desc-txt">Zip code: 70000</p>
                            </div>
                            <div class="footer-menu-connect-icon">
                                <span class="footer-menu-connect-icon-facebook"
                                      ><i class="fa-brands fa-facebook-f"></i
                                    ></span>
                                <span class="footer-menu-connect-icon-instagram"
                                      ><i class="fa-brands fa-instagram"></i
                                    ></span>
                            </div>
                        </div>
                        <div class="footer-menu-cus-service">
                            <h3 class="footer-menu-cus-service-title">CUSTOMER SERVICE</h3>
                            <div class="footer-menu-cus-service-desc">
                                <p class="footer-menu-cus-service-desc-txt">
                                    TERMS OF SERVICE
                                </p>
                                <p class="footer-menu-cus-service-desc-txt">
                                    REFUND POLICY
                                </p>
                            </div>
                        </div>
                        <div class="footer-menu-about">
                            <h3 class="footer-menu-about-title">ABOUT US</h3>
                            <div class="footer-menu-about-desc">
                                <p class="footer-menu-about-desc-txt">
                                    STORY OF PDTK
                                </p>
                            </div>
                        </div>
                        <div class="footer-menu-care">
                            <h3 class="footer-menu-care-title">FOR CUSTOMERS</h3>
                            <div class="footer-menu-care-desc">
                                <p class="footer-menu-care-desc-txt">
                                    INSTRUCTIONS FOR STORAGE OF US PRODUCTS
                                </p>
                                <p class="footer-menu-care-desc-txt">
                                    FASHION KNOWLEDGE
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="footer-copyright">
                    <div class="container">
                        <p class="footer-copyright-txt">
                            © 2023 PTDK All Rights Reserved.
                        </p>
                    </div>
                </div>
            </footer>
        </div>
        <script src="js/app.js"></script>
    </body>
</html>
