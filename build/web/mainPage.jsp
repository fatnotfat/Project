<%-- 
    Document   : mainPage
    Created on : Feb 8, 2023, 1:44:23 PM
    Author     : nguye
--%>

<%@page import="swp391.cart.CartObject"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.List"%>
<%@page import="swp391.product.ProductDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SWP391</title>
        <link rel="stylesheet" href="style/reset.css">
        <link rel="stylesheet" href="style/mainPage.css">
        <link rel="stylesheet" href="style/base.css">
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap"
            rel="stylesheet"
            />
        <link rel="stylesheet" href="myProjects/webProject/icofont/css/icofont.min.css">
        <link href='https://css.gg/facebook.css' rel='stylesheet'>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
              integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">


        <!-- animation libary -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
        <!-- Responsive library -->
        <link rel="stylesheet" href="style/grid.css">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


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
                <img src="assets/image/Nav-line.png" alt="" class="nav-line" />
                <!-- NAV DESKTOP - TABLET -->
                <div class="nav-bot">
                    <div class="container">
                        <a href="mainPage" class="menu-logo"> LOGO </a>
                        <ul class="menu">
                            <li class="menu-item">
                                <a href="#!" class="menu-link menu-link-category">Categories</a>
                                <ul class="menu-link-category-tab">
                                    <div class="container">
                                        <%--
                                        <c:set var="categoryList" value="${sessionScope.CATEGORY}"/>
                                        <c:forEach var="category" items="${categoryList}">
                                            <li class="menu-link-category-tab-title">
                                                <a href="SearchByFilterServlet?txtProductCateID=${category.cateID}" class="menu-link menu-link-bracelet"
                                                   >${fn:toUpperCase(category.name)}</a
                                                >
                                            </li>
                                        </c:forEach>
                                        --%>
                                        <li class="menu-link-category-tab-title">
                                            <a href="SearchByFilterServlet?txtProductCateID=1" class="menu-link menu-link-bracelet"
                                               >BRACELET</a
                                            >
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
                                            <a href="SearchByFilterServlet?txtProductCateID=2" class="menu-link menu-link-ring"> RING </a>
                                            <ul class="menu-link-category-tab-list">
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-ring"> 1 </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-ring"> 2 </a>
                                                </li>
                                                <li class="menu-link-category-tab-list-item">
                                                    <a href="#!" class="menu-link menu-link-ring"> 3 </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-link-category-tab-title">
                                            <a href="SearchByFilterServlet?txtProductCateID=3" class="menu-link menu-link-necklace">
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
                                            <a href="SearchByFilterServlet?txtProductCateID=4" class="menu-link menu-link-earring">
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
                                        srcset="assets/image/search-normal.png 2x"
                                        alt=""
                                        />
                                </button>
                                <div class="menu-icon-tab-search-content">
                                    <div class="container">
                                        <div class="menu-icon-tab-search-content-title">
                                            <p class="menu-icon-tab-search-content-title-desc">
                                                SEARCH
                                            </p>
                                            <img srcset="assets/image/Footer-line.png 2x" alt="" />
                                        </div>
                                        <div class="menu-icon-tab-search-form">
                                            <form action="searchTextController">
                                                <input
                                                    type="text"
                                                    id="search-button"
                                                    class="menu-icon-tab-search-input"
                                                    placeholder="Search Product..."
                                                    name="txtSearch" value=""
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
                                        srcset="assets/image/profile-circle.png 2x"
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
                                            <p style="font-size: 15px; margin: 5px 0">You are not already logged <span style="color: red">PLEASE LOGIN FIRST!!</span></p><br/>
                                            <%--<c:set var="URL" value="userCart.jsp" scope="session"/>--%>
                                            <form action="loginPage" method="GET">
                                                <button class="menu-icon-tab-cart-content-function-method-btn">
                                                    <a style="font-size: 15px; text-decoration: none; font-weight: bold; color: inherit" href="loginPage">LOGIN</a>
                                                </button>
                                            </form>
                                        </c:if>

                                    </div>
                                </div>
                            </div>
                            <!-- CART -->
                            <div class="menu-icon-tab">
                                <button class="menu-icon-tab-cart" href="#!">
                                    <img
                                        class="menu-icon-img"
                                        srcset="assets/image/shopping-cart.png 2x"
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
                                                    srcset="assets/image/Footer-line.png 2x"
                                                    alt=""
                                                    class="menu-icon-tab-cart-space"
                                                    />
                                            </div>
                                        </div>
                                        <div class="menu-icon-tab-cart-content-show">
                                            <div class="menu-icon-tab-cart-content-show-icon">
                                                <img
                                                    srcset="assets/image/shopping-icon-tab.png 2x"
                                                    alt=""
                                                    />
                                            </div>
                                            <div class="menu-icon-tab-cart-content-show-txt">
                                                <c:set var="cartSize" value="${sessionScope.CART.items.size()}"/>
                                                <c:set var="totalQuantity" value="${0}" />
                                                <c:forEach var="quantity" items="${sessionScope.CART.items.values()}">
                                                    <c:set var="totalQuantity" value="${totalQuantity + quantity}" />
                                                </c:forEach>
                                                <c:if test="${empty sessionScope.CART.items.size()}">
                                                    <c:set var="totalQuantity" value="${0}"/>
                                                </c:if>

                                                <p
                                                    class="menu-responsive-icon-tab-cart-content-show-txt-desc"
                                                    >
                                                    <c:if test="${totalQuantity eq 0}">
                                                        There are <span id="cart-size-header" style="font-weight: bold">no</span> currently products.
                                                    </c:if>
                                                    <c:if test="${totalQuantity ne 0}">
                                                        There are <span id="cart-size-header" style="font-weight: bold">${totalQuantity}</span> products
                                                    </c:if>
                                                </p>
                                            </div>
                                        </div>
                                        <img srcset="assets/image/Footer-line.png 2x" alt="" />
                                        <c:set var="listCart" value="${sessionScope.CART}"/>
                                        <c:set var="totalPrice" value="${0}"/>

                                        <c:forEach var="item" items="${sessionScope.CART.items}">
                                            <c:forEach var="detail" items="${sessionScope.CART.itemDetail}">
                                                <c:if test="${item.key eq detail.key}">
                                                    <c:set var="totalPrice" value="${totalPrice + (item.value * detail.value.price)}"/>
                                                </c:if>
                                            </c:forEach>
                                        </c:forEach>
                                        <div class="menu-icon-tab-cart-content-function">
                                            <div class="menu-icon-tab-cart-content-function-total">
                                                <p
                                                    class="menu-icon-tab-cart-content-function-total-txt"
                                                    >
                                                    TOTAL AMOUNT
                                                </p>
                                                <p
                                                    class="menu-icon-tab-cart-content-function-total-price"
                                                    id="totalPrice"
                                                    >
                                                    <fmt:formatNumber var="price" value="${totalPrice}" pattern="#,###"/>
                                                    ${price}₫
                                                </p>
                                            </div>
                                            <div class="menu-icon-tab-cart-content-function-method">
                                                <form action="addToCartPage" method="POST">
                                                    <button
                                                        class="menu-icon-tab-cart-content-function-method-btn"
                                                        >
                                                        VIEW CART
                                                    </button>
                                                </form>
                                                <button
                                                    class="pay-button menu-icon-tab-cart-content-function-method-btn"
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
                            <!-- <img
                              class="menu-responsive-icon-img"
                              srcset="./assets/image/shopping-cart.png 2x"
                              alt=""
                            /> -->
                            <div class="menu-responsive-icon-tab">
                                <button class="menu-responsive-icon-tab-cart" href="#!">
                                    <img
                                        class="menu-responsive-icon-img menu-responsive-icon-img-cart"
                                        srcset="assets/image/shopping-cart.png 2x"
                                        alt=""
                                        />
                                </button>
                                <div class="menu-responsive-icon-tab-cart-content">
                                    <div class="container">
                                        <div class="menu-responsive-icon-tab-cart-content-title">
                                            <div
                                                class="menu-responsive-icon-tab-cart-content-title-container"
                                                >
                                                <p
                                                    class="menu-responsive-icon-tab-cart-content-title-desc"
                                                    >
                                                    Cart
                                                </p>
                                                <img
                                                    srcset="assets/image/Footer-line.png 2x"
                                                    alt=""
                                                    class="menu-responsive-icon-tab-cart-space"
                                                    />
                                            </div>
                                        </div>
                                        <div class="menu-responsive-icon-tab-cart-content-show">
                                            <div
                                                class="menu-responsive-icon-tab-cart-content-show-icon"
                                                >
                                                <img
                                                    srcset="assets/image/shopping-icon-tab.png 2x"
                                                    alt=""
                                                    />
                                            </div>
                                            <div
                                                class="menu-responsive-icon-tab-cart-content-show-txt"
                                                >
                                                <c:set var="cartSize" value="${sessionScope.CART.items.size()}"/>
                                                <c:if test="${empty sessionScope.CART.items.size()}">
                                                    <c:set var="cartSize" value="${0}"/>
                                                </c:if>
                                                <p
                                                    class="menu-responsive-icon-tab-cart-content-show-txt-desc"
                                                    >
                                                    <c:if test="${cartSize eq 0}">
                                                        There are no currently products.
                                                    </c:if>
                                                    <c:if test="${cartSize ne 0}">
                                                        There are <span id="cart-size-header" style="font-weight: bold">${cartSize}</span> products
                                                    </c:if>
                                                </p>

                                            </div>
                                        </div>
                                        <img srcset="assets/image/Footer-line.png 2x" alt="" />
                                        <div class="menu-responsive-icon-tab-cart-content-function">
                                            <div
                                                class="menu-responsive-icon-tab-cart-content-function-total"
                                                >
                                                <p
                                                    class="menu-responsive-icon-tab-cart-content-function-total-txt"
                                                    >
                                                    TOTAL AMOUNT
                                                </p>
                                                <p
                                                    class="menu-responsive-icon-tab-cart-content-function-total-price"

                                                    >
                                                    <fmt:formatNumber var="price" value="${totalPrice}" pattern="#,###" />
                                                    ${price}₫
                                                </p>
                                            </div>
                                            <div
                                                class="menu-responsive-icon-tab-cart-content-function-method"
                                                >
                                                <form action="addToCartPage" method="POST">
                                                    <button
                                                        class="menu-responsive-icon-tab-cart-content-function-method-btn"
                                                        >
                                                        VIEW CART
                                                    </button>
                                                </form>
                                                <button
                                                    class="menu-responsive-icon-tab-cart-content-function-method-btn"
                                                    >
                                                    PAY
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <a href="mainPage" class="menu-responsive-logo"> LOGO </a>
                        <div class="menu-responsive-icon">
                            <img
                                class="menu-responsive-icon-img menu-responsive-icon-img-bar"
                                srcset="assets/image/textalign-justifycenter.png 2x"
                                alt=""
                                />
                        </div>
                    </div>
                </div>
                <!--  -->
                <img src="assets/image/Nav-line.png" alt="" class="nav-line-bot" />
            </header>

            <div class="main_page">

                <div class="grid wide ">
                    <div class="grid__row">

                        <div class="grid__full-width">

                            <div class="product">
                                <div class="row">

                                    <div class="product_firstline">
                                        <div class="first-ring">
                                            <img  src="assets/image/Group-removebg-preview.png" alt="cat">
                                            <h1 class="first-title">Jewelery tells a freat story</h1>
                                            <ul class="first-content">
                                                <li>
                                                    <h2>
                                                        Gold
                                                    </h2>
                                                    <p>
                                                        Her previson acuteness had two why intention
                                                    </p>
                                                </li>
                                                <li>
                                                    <h2>
                                                        Sliver
                                                    </h2>
                                                    <p>
                                                        Her previson acuteness had two why intention
                                                    </p>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="second-ring">
                                            <p class="second-title">Our Story</p>
                                            <p class="second-content">
                                                With the mission of bringing customers the best products,
                                                we have always sought and created a place to provide the 
                                                magnificent and beautiful jewelry for customers
                                            </p>
                                            <img src="assets/image/2_1-removebg-preview.png" alt="humuhumu">
                                        </div>
                                    </div>
                                </div>

                                <div class="product_secondline">
                                    <c:set var="newestProduct" value="${sessionScope.NEWEST_PRODUCT.get(0)}"/>

                                    <img class="product_secondline-img" src="assets/image/${newestProduct.avatar}" alt="">

                                    <div class="product-info">
                                        <div class="product-content-1">
                                            <h4>${newestProduct.name}</h4>
                                            <p>
                                                ${newestProduct.description}
                                            </p>
                                        </div>
                                        <!--<form action="addToCartController" method="POST">-->
                                        <div class="product-size-1">
                                            <h4>Size</h4>
                                            <ul class="product-size-list">

                                                <c:set var="counter" value="${0}"/>
                                                <c:forEach var="product" items="${sessionScope.NEWEST_PRODUCT}">
                                                    <li>
                                                        <c:set var="counter" value="${counter + 1}"/>
                                                        <input type="checkbox" id="check_${counter}" 
                                                               name="check_${counter}" value="check_${counter}"
                                                               class="my-checkbox"
                                                               >

                                                        <label for="check_${counter}">${product.size}</label>
                                                        <input type="hidden" name="txtProductID${counter}" value="${product.id}" />
                                                        <input type="hidden" name="txtProductSize${counter}" value="${product.size}" />
                                                        <input type="hidden" name="txtProductPrice${counter}" value="${product.price}" />
                                                    </li>
                                                </c:forEach>
                                            </ul>

                                        </div>
                                        <div class="product-buy-1">
                                            <button id="addToCartButton">Add To Cart</button>
                                            <fmt:formatNumber var="price" value="${newestProduct.price}" pattern="#,##0.###################"/>
                                            <p>${price}đ</p>
                                        </div>

                                        <!--</form>-->
                                    </div>

                                </div>

                                <div class="product_thirdline">
                                    <c:set var="newestProduct2" value="${sessionScope.SECOND_NEWEST_PRODUCT.get(0)}"/>
                                    <div class="product-info">
                                        <div class="product-content-2">
                                            <h4>${newestProduct2.name}</h4>
                                            <p>
                                                ${newestProduct2.description}
                                            </p>
                                        </div>

                                        <!--<form action="addToCartController" method="POST">-->
                                        <div class="product-size-2">
                                            <h4>Size</h4>

                                            <ul class="product-size-list">
                                                <c:set var="list" value="${sessionScope.SECOND_NEWEST_PRODUCT}"/>
                                                <c:set var="counter" value="${3}"/>
                                                <c:forEach var="product2" items="${list}">
                                                    <c:set var="counter" value="${counter + 1}"/>
                                                    <li>
                                                        <input type="checkbox" id="check_${counter}" name="check_${counter}" value="check_${counter}">
                                                        <label for="check_${counter}">${product2.size}</label>
                                                        <input type="hidden" name="txtProductID${counter}" value="${product2.id}" />
                                                        <input type="hidden" name="txtProductSize${counter}" value="${product2.size}" />
                                                        <input type="hidden" name="txtProductPrice${counter}" value="${product2.price}" />
                                                    </li>
                                                </c:forEach>
                                            </ul>

                                        </div>

                                        <div class="product-buy-2">
                                            <button id="addToCartButton2">Add To Cart</button>
                                            <fmt:formatNumber var="price2" value="${newestProduct2.price}" pattern="#,##0.###################"/>
                                            <p>${price2} đ</p>
                                        </div>
                                        <!--</form>-->
                                    </div>
                                    <img class="product_thirdline-img" src="assets/image/${newestProduct2.avatar}" alt="">

                                </div>
                            </div>


                            <div class="outstanding">
                                <div class="frame">
                                    <img class="frame__first-img" src="assets/image/5 50.png" alt="">
                                    <div class="content">
                                        <h3 class="content__first-title ">
                                            Luxury-Shop’s Best
                                            Collections
                                        </h3>
                                        <div class="content-comfort">
                                            <h4 class="content-comfort-title">Comfort</h4>
                                            <p class="content-comfort-info">Lorem ipsum dolor sit amet
                                                consectetur.Sollicitudin morbi molestie at amet praesent tortor.Maecenas non
                                                tempus at consequat ac est varius. Tortor aliquet nulla consequat
                                                risus.consequatconsequat
                                            </p>
                                        </div>
                                    </div>
                                </div>

                                <div class="frame">
                                    <div class="content">
                                        <div class="content-gold">
                                            <h3 class="content__second-title">100% Gold</h3>
                                            <p class="content-gold-info">Lorem ipsum dolor sit amet consectetur.Sollicitudin
                                                morbi molestie at amet praesent tortor.Maecenas non tempus at consequat ac
                                                est varius. Tortor aliquet nulla consequat risus.consequatconsequat
                                            </p>
                                        </div>
                                    </div>
                                    <img class="frame__second-img" src="assets/image/6 1.png" alt="">
                                </div>

                                <div class="frame">
                                    <img class="frame__third-img" src="assets/image/7 1.png" alt="">
                                    <div class="content">
                                        <div class="content-trend">
                                            <h3 class="content__third-title">Trendy</h3>
                                            <p class="content-trend-info">Lorem ipsum dolor sit amet
                                                consectetur.Sollicitudin morbi molestie at amet praesent tortor.Maecenas non
                                                tempus at consequat ac est varius. Tortor aliquet nulla consequat
                                                risus.consequatconsequat
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="list_company">
                                <p><span>Trusted</span> by leading companies</p>
                                <img src="assets/image/BRANDS 1.png" alt="">
                            </div>


                            <div class="join_shop">
                                <h1>Join Luxury-Shop’s Family</h1>
                                <div class="join_group">
                                    <form class="join_form" action="#">
                                        <input type="email" placeholder="Enter your email">
                                        <button>Join Family</button>
                                    </form>
                                </div>
                            </div>


                            <div class="our_blog">
                                <h1>Our Blogs</h1>

                                <div class="our_blog-info">
                                    <div class="info">
                                        <img src="assets/image/8.png" alt="">
                                        <h2>For Beauty</h2>
                                        <p>Lorem ipsum dolor sit amet consectetur.Sollicitudin morbi molestie at amet
                                            praesent tortor.Maecenas non tempus at consequat ac
                                        </p>
                                    </div>

                                    <div class="info">
                                        <img src="assets/image/9.png" alt="">
                                        <h2>Product Quality</h2>
                                        <p>Lorem ipsum dolor sit amet consectetur.Sollicitudin morbi molestie at amet
                                            praesent tortor.Maecenas non tempus at consequat ac
                                        </p>
                                    </div>

                                    <div class="info">
                                        <img src="assets/image/10.png" alt="">
                                        <h2>For Comfort</h2>
                                        <p>Lorem ipsum dolor sit amet consectetur.Sollicitudin morbi molestie at amet
                                            praesent tortor.Maecenas non tempus at consequat ac
                                        </p>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>


                </div>


            </div>



            <img src="assets/image/Footer-line.png" alt="" />
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
    </body>
    <script src="js/header.js"></script>
    <script src="js/mainPage.js"></script>
    <script src="js/cart1.js"></script>
    <script src="js/handleEvent.js"></script>
    <script src="js/handleEvent1.js"></script>
</html>