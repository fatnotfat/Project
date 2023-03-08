<%-- 
    Document   : userCart
    Created on : Feb 20, 2023, 3:48:23 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/paginationjs/2.1.4/pagination.min.js"></script>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Payment-1</title>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap"
            rel="stylesheet"
            />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            />

        <style>
            .confirm-popup {
                position: fixed;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                background: rgba(0, 0, 0, 0.5);
                display: flex;
                justify-content: center;
                align-items: center;
                z-index: 100;
            }

            .confirm-popup__content {
                background: #fff;
                border-radius: 8px;
                padding: 20px;
                text-align: center;
            }

            .confirm-popup__content p {
                margin: 0 0 20px;
            }

            .confirm-popup__buttons {
                display: flex;
                justify-content: center;
            }

            .confirm-popup__button {
                background-color: #ff4a4a;
                border: none;
                color: #fff;
                padding: 10px 20px;
                border-radius: 5px;
                font-size: 16px;
                cursor: pointer;
                margin-right: 10px;
            }

            .confirm-popup__button:last-child {
                margin-right: 0;
                background-color: #0c71c3;
            }
        </style>
        <script src="js/cart.js"></script>
        <link rel="stylesheet" href="style/reset.css" />
        <link rel="stylesheet" href="style/payment-1.css" />
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
                <img src="images/Nav-line.png" alt="" class="nav-line" />
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
                                                    src="images/shopping-icon-tab.png"
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
                                                <p class="menu-icon-tab-cart-content-show-txt-desc">
                                                    <c:if test="${cartSize eq 0}">
                                                        There are no currently products.
                                                    </c:if>
                                                    <c:if test="${cartSize ne 0}">
                                                        There are <span id="cart-size-header" style="font-weight: bold">${totalQuantity}</span> products
                                                    </c:if>
                                                </p>
                                            </div>
                                        </div>
                                        <img srcset="images/Footer-line.png 2x" alt="" />
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
                                                <p  id="total-price-header"
                                                    class="menu-icon-tab-cart-content-function-total-price"
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
                            <!-- <img
                                     class="menu-responsive-icon-img"
                                     srcset="./../images/shopping-cart.png 2x"
                                     alt=""
                                   /> -->
                            <div class="menu-responsive-icon-tab">
                                <button class="menu-responsive-icon-tab-cart" href="#!">
                                    <img
                                        class="menu-responsive-icon-img menu-responsive-icon-img-cart"
                                        srcset="images/shopping-cart.png 2x"
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
                                                    srcset="images/Footer-line.png 2x"
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
                                                    srcset="images/shopping-icon-tab.png 2x"
                                                    alt=""
                                                    />
                                            </div>
                                            <div
                                                class="menu-responsive-icon-tab-cart-content-show-txt"
                                                >
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
                                                    <c:if test="${cartSize eq 0}">
                                                        There are no currently products.
                                                    </c:if>
                                                    <c:if test="${cartSize ne 0}">
                                                        There are <span id="cart-size-header" style="font-weight: bold">${totalQuantity}</span> products
                                                    </c:if>
                                                </p>
                                            </div>
                                        </div>
                                        <img srcset="images/Footer-line.png 2x" alt="" />
                                        <div class="menu-responsive-icon-tab-cart-content-function">
                                            <div
                                                class="menu-responsive-icon-tab-cart-content-function-total"
                                                >
                                                <p
                                                    class="menu-responsive-icon-tab-cart-content-function-total-txt"
                                                    >
                                                    TOTAL AMOUNT
                                                </p>
                                                <p  id="total-price-mobile"
                                                    class="menu-responsive-icon-tab-cart-content-function-total-price"
                                                    >
                                                    0₫
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
                                srcset="images/textalign-justifycenter.png 2x"
                                alt=""
                                />
                        </div>
                    </div>
                </div>
                <!--  -->
                <img src="images/Nav-line.png" alt="" class="nav-line-bot" />
            </header>
            <!-- YOUR CART TITLE-->
            <c:if test="${not empty sessionScope}">
                <c:set var="cart" value="${sessionScope.CART}"/>
                <%--<c:if test="${not empty CART}">--%>
                <c:set var="items" value="${cart.items}"/>
                <c:set var="itemDetail" value = "${cart.itemDetail}" />
                <%--<c:if test="${not empty items}">--%>
                <div class="your-cart">
                    <div class="container">
                        <h1 class="your-cart-title">Your Cart</h1>
                        <p class="your-cart-desc">
                            There is
                            <c:set var="cartSize" value="${sessionScope.CART.items.size()}"/>
                            <c:if test="${empty sessionScope.CART.items.size()}">
                                <c:set var="cartSize" value="${0}"/>
                            </c:if>

                            <c:set var="totalQuantity" value="${0}" />
                            <c:forEach var="quantity" items="${sessionScope.CART.items.values()}">
                                <c:set var="totalQuantity" value="${totalQuantity + quantity}" />
                            </c:forEach>
                            <c:if test="${totalQuantity eq 0 or totalQuantity eq 1}">
                                <span id="cart-size" class="your-cart-desc-number" style="font-weight: 700"
                                      >${totalQuantity}</span
                                >
                                <span style="font-weight: 700">product</span> in your cart
                            </c:if>

                            <c:if test="${totalQuantity ne 0 and totalQuantity ne 1}">
                                <span id="cart-size" class="your-cart-desc-number" style="font-weight: 700"
                                      >${totalQuantity}</span
                                >
                                <span style="font-weight: 700">products</span> in your cart
                            </c:if>
                        </p>
                    </div>
                </div>


                <div class="your-cart-body">
                    <div class="container">
                        <!-- LEFT________________________________ -->
                        <div class="your-cart-body-left-all">
                            <div class="container">
                                <div class="your-cart-body-left">
                                    <div class="container">
                                        <div class="your-cart-body-left-product">
                                            <c:set var="cartList" value="${sessionScope.CART.items}" />
                                            <c:set var="cartListDetail" value="${sessionScope.CART.itemDetail}" />

                                            <c:forEach var="item" items="${cartList}" varStatus="counter">
                                                <c:forEach var="detail" items="${cartListDetail}">
                                                    <c:if test="${item.key eq detail.key}">

                                                        <div class="container" id="product-${item.key}">
                                                            <div class="your-cart-body-left-product-detail-left">
                                                                <img
                                                                    srcset="images/product-demo.png 2x"
                                                                    alt=""
                                                                    class="your-cart-body-left-product-img"
                                                                    />
                                                                <div class="container">
                                                                    <h1
                                                                        class="your-cart-body-left-product-detail-left-name"
                                                                        >
                                                                        ${detail.value.name}
                                                                    </h1>
                                                                    <p
                                                                        class="your-cart-body-left-product-detail-left-price"
                                                                        >

                                                                        <fmt:formatNumber var="price" value="${detail.value.price}" pattern="#,###"/>
                                                                        ${price}₫
                                                                    </p>
                                                                    <p
                                                                        class="your-cart-body-left-product-detail-left-size"
                                                                        >
                                                                        Size:${detail.value.size}
                                                                    </p>
                                                                    <div
                                                                        class="your-cart-body-left-product-detail-left-count"
                                                                        >
                                                                        <button
                                                                            class="your-cart-body-left-product-detail-left-minus"

                                                                            id="minus_${item.key}"
                                                                            >
                                                                            -
                                                                        </button>
                                                                        <span
                                                                            class="your-cart-body-left-product-detail-left-count-update"
                                                                            id="quantity${item.key}"
                                                                            >
                                                                            ${item.value}
                                                                        </span>
                                                                        <button
                                                                            class="your-cart-body-left-product-detail-left-plus"

                                                                            id="plus_${item.key}"
                                                                            >
                                                                            +
                                                                        </button>


                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="your-cart-body-left-product-detail-right">
                                                                <div class="container">
                                                                    <span
                                                                        class="your-cart-body-left-product-detail-right-icon" 
                                                                        id="${item.key}"
                                                                        >
                                                                        <i class="fa-solid fa-xmark"></i>
                                                                    </span>
                                                                    <p
                                                                        class="your-cart-body-left-product-detail-right-sum"
                                                                        >
                                                                        <fmt:formatNumber var="price" value="${detail.value.price * item.value}" pattern="#,###"/>
                                                                        <span class="product-price" id="price-${item.key}">${price}</span>₫
                                                                    </p>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </c:if>
                                                </c:forEach>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                                <div class="your-cart-body-left-bot">
                                    <div class="container">
                                        <div class="your-cart-body-left-bot-note">
                                            <h1 class="your-cart-body-left-bot-note-title">
                                                Order Notes
                                            </h1>
                                            <textarea
                                                name="note"
                                                id="note"
                                                rows="4"
                                                placeholder="Notes"
                                                class="your-cart-body-left-bot-note-area"
                                                >
                                            </textarea>
                                        </div>
                                        <div class="your-cart-body-left-bot-policy">
                                            <div class="container">
                                                <h1 class="your-cart-body-left-bot-policy-title">
                                                    Purchase Policy
                                                </h1>
                                                <ul class="your-cart-body-left-bot-policy-detail">
                                                    <li class="your-cart-body-left-bot-policy-item">
                                                        <span class="your-cart-body-left-bot-policy-item-icon"
                                                              ><i class="fa-solid fa-arrow-right"></i
                                                            ></span>
                                                        Products are not exchangeable
                                                    </li>
                                                    <li class="your-cart-body-left-bot-policy-item">
                                                        <span class="your-cart-body-left-bot-policy-item-icon"
                                                              ><i class="fa-solid fa-arrow-right"></i
                                                            ></span>
                                                        Each invoice can be exchanged only once, no payment
                                                        support.
                                                    </li>
                                                    <li class="your-cart-body-left-bot-policy-item">
                                                        <span class="your-cart-body-left-bot-policy-item-icon"
                                                              ><i class="fa-solid fa-arrow-right"></i
                                                            ></span>
                                                        Only products of equal or higher value are accepted.
                                                    </li>
                                                    <li class="your-cart-body-left-bot-policy-item">
                                                        <span class="your-cart-body-left-bot-policy-item-icon"
                                                              ><i class="fa-solid fa-arrow-right"></i
                                                            ></span>
                                                        The product has all the tags and is unused.
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- LEFT________________________________ -->
                        <!-- RIGHT_______________________________ -->
                        <div class="your-cart-body-right">
                            <div class="container">
                                <div class="your-cart-body-right-all">
                                    <div class="container">
                                        <div class="your-cart-body-right-order">
                                            <div class="container">
                                                <div class="your-cart-body-right-order-border">
                                                    <h1 class="your-cart-body-right-order-title">
                                                        Order Information
                                                    </h1>
                                                    <div class="your-cart-body-right-order-total">
                                                        <div class="container">
                                                            <h2 class="your-cart-body-right-order-total-title">
                                                                Total:
                                                            </h2>
                                                            <h1 id="total-price" class="your-cart-body-right-order-total-price">
                                                                0₫
                                                            </h1>
                                                        </div>
                                                    </div>
                                                    <p class="your-cart-body-right-order-desc">
                                                        Shipping fee will be calculated at the checkout page.
                                                        You can also enter the discount code at the checkout
                                                        page.
                                                    </p>
                                                    <button class="your-cart-body-right-order-btn">
                                                        PAY
                                                    </button>
                                                    <a href="SearchByFilterServlet?txtProductCateID=1" class="your-cart-body-right-order-continue">
                                                        Continue shopping
                                                    </a>
                                                </div>
                                                <!--  -->
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- RIGHT_______________________________ -->
                    </div>
                </div>
                <%--</c:if>--%>
                <%--<c:if test="${empty items}">
                    <span>Your cart is empty! Click here to buy something!!</span>
                </c:if>--%>
                <%--</c:if>--%>  
            </c:if>

            <%--<c:if test="${empty sessionScope.CART.items}">
                <h2>Cart is empty!!! You should buy something first!</h2>
            </c:if>--%>
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
                                <p class="footer-menu-cus-service-desc-txt">TERMS OF SERVICE</p>
                                <p class="footer-menu-cus-service-desc-txt">REFUND POLICY</p>
                            </div>
                        </div>
                        <div class="footer-menu-about">
                            <h3 class="footer-menu-about-title">ABOUT US</h3>
                            <div class="footer-menu-about-desc">
                                <p class="footer-menu-about-desc-txt">STORY OF PDTK</p>
                            </div>
                        </div>
                        <div class="footer-menu-care">
                            <h3 class="footer-menu-care-title">FOR CUSTOMERS</h3>
                            <div class="footer-menu-care-desc">
                                <p class="footer-menu-care-desc-txt">
                                    INSTRUCTIONS FOR STORAGE OF US PRODUCTS
                                </p>
                                <p class="footer-menu-care-desc-txt">FASHION KNOWLEDGE</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="footer-copyright">
                    <div class="container">
                        <p class="footer-copyright-txt">© 2023 PTDK All Rights Reserved.</p>
                    </div>
                </div>
            </footer>
        </div>
        <script src="js/app.js"></script>
    </body>
</html>
