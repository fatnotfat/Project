<%-- 
    Document   : payment
    Created on : Feb 26, 2023, 3:12:18 PM
    Author     : Duy
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap"
            rel="stylesheet"
            />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            />
        <link rel="stylesheet" href="style/reset.css" />
        <link rel="stylesheet" href="style/payment-3.css" />
        <title>Payment-3</title>
    </head>
    <body>
        <div class="wrapper">
            <!-- HEADER -->
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
                        <a href="#!" class="menu-logo"> LOGO </a>
                        <ul class="menu">
                            <li class="menu-item">
                                <a href="#!" class="menu-link menu-link-category">Categories</a>
                                <ul class="menu-link-category-tab">
                                    <div class="container">
                                        <li class="menu-link-category-tab-title">
                                            <a href="#!" class="menu-link menu-link-bracelet"
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
                                            <a href="#!" class="menu-link menu-link-ring"> RING </a>
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
                                            <input
                                                type="text"
                                                class="menu-icon-tab-search-input"
                                                placeholder="Search Product..."
                                                />
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
                                        <div class="menu-icon-tab-profile-content-title">
                                            <p class="menu-icon-tab-profile-content-title-desc">
                                                ACCOUNT INFORMATION
                                            </p>
                                            <img srcset="images/Footer-line.png 2x" alt="" />
                                        </div>
                                        <div class="menu-icon-tab-profile-form">
                                            <p class="menu-icon-tab-profile-form-name">NAME</p>
                                            <a href="#!" class="menu-icon-tab-profile-form-link"
                                               >My account</a
                                            >
                                            <a href="#!" class="menu-icon-tab-profile-form-link"
                                               >Address List</a
                                            >
                                            <a href="#!" class="menu-icon-tab-profile-form-link"
                                               >Log out</a
                                            >
                                        </div>
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
                            <!-- <img
                                         class="menu-responsive-icon-img"
                                         srcset="./../../images/shopping-cart.png 2x"
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
                                                <p
                                                    class="menu-responsive-icon-tab-cart-content-show-txt-desc"
                                                    >
                                                    There are currently no products
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
                                                <p
                                                    class="menu-responsive-icon-tab-cart-content-function-total-price"
                                                    >
                                                    0₫
                                                </p>
                                            </div>
                                            <div
                                                class="menu-responsive-icon-tab-cart-content-function-method"
                                                >
                                                <button
                                                    class="menu-responsive-icon-tab-cart-content-function-method-btn"
                                                    >
                                                    VIEW CART
                                                </button>
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
                        <a href="#!" class="menu-responsive-logo"> LOGO </a>
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
            <section class="shipping-info">
                <div class="container">
                    <form action="paymentController" method="POST">
                        <div class="shipping-info-left">
                            <c:set var="customerInfomation" value="${sessionScope.USER}"/>
                            <input type="hidden" name="txtCustomerID" value="${customerInfomation.customerID}" />
                            <c:set var = "errors" value="${requestScope.PAYMENT_ERROR}"/>
                            <c:set var = "shippingID" value="${requestScope.SHIPPING_ID}"/>
                            <div class="container">
                                <div class="shipping-info-left-breadcrumb">
                                    <div class="container">
                                        <ul class="shipping-info-left-breadcrumb-menu">
                                            <li><a href="userCart.jsp">Cart</a></li>
                                            <li><a href="shipping.jsp">Shipping information</a></li>
                                            <li><a href="payment.jsp">Payment methods</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="shipping-info-left-avatar">
                                    <div class="container">
                                        <div class="shipping-info-left-avatar-icon">
                                            <i class="fa-solid fa-user"></i>
                                        </div>
                                        <div class="shipping-info-left-avatar-content">
                                            <p class="shipping-info-left-avatar-content-name">
                                                ${customerInfomation.name}
                                            </p>
                                        </div>
                                    </div>
                                </div>
                                <div class="shipping-info-left-title">
                                    <div class="container">
                                        <p class="shipping-info-left-title-txt">Shipping method</p>
                                    </div>
                                </div>

                                <c:forEach items="${SHIPPINGMETHOD_LIST}" var="shippingMethod" varStatus="loop">
                                    <div class="shipping-info-left-form-delivery-home">
                                        <label class="radio-label">
                                            <div class="radio-input">
                                                <input
                                                    type="radio"
                                                    id="location"
                                                    name="location"
                                                    value="${shippingMethod.shippingID}"
                                                    class="input-radio"
                                                    <c:if test="${loop.first}">checked</c:if>
                                                        />
                                                </div>
                                                <span class="radio-label-primary">${shippingMethod.nameOfMethod}</span>
                                        </label>
                                        <div class="shipping-info-left-form-delivery-home-price">
                                            <p class="shipping-info-left-form-delivery-home-price-number">
                                                ${shippingMethod.transportFee}Đ
                                            </p>
                                        </div>
                                    </div>
                                </c:forEach>
                                <div class="shipping-info-left-payment">                                  
                                    <div class="shipping-info-left-payment-title">
                                        <div class="container">
                                            <p class="shipping-info-left-payment-title-txt">
                                                Payment Methods
                                            </p>
                                        </div>
                                    </div>
                                    <div class="shipping-info-left-payment-all">
                                        <div class="shipping-info-left-payment-field">                                      

                                            <div class="shipping-info-left-payment-field-input">
                                                <label class="radio-label" id="shipping-info-cod-radio">
                                                    <div class="radio-input">
                                                        <input
                                                            type="radio"
                                                            id="method"
                                                            name="method"
                                                            value="${1}"
                                                            class="input-radio"
                                                            checked
                                                            />
                                                    </div>
                                                    <img
                                                        src="images/cod.svg"
                                                        alt=""
                                                        class="main-img"
                                                        />
                                                    <span class="radio-label-primary"
                                                          >Collecting Household (COD)</span
                                                    >
                                                </label>
                                            </div>
                                        </div>
                                        <div class="shipping-info-left-payment-content-cod">
                                            The customer will pay the product invoice and delivery fee
                                            upon receipt.
                                        </div>
                                        <div class="shipping-info-left-payment-field-other">
                                            <div class="shipping-info-left-payment-field-other-input">
                                                <label class="radio-label" id="shipping-info-other-radio">
                                                    <div class="radio-input">
                                                        <input
                                                            type="radio"
                                                            id="method"
                                                            name="method"
                                                            value="${2}"
                                                            class="input-radio"
                                                            />
                                                    </div>
                                                    <img
                                                        src="images/other.svg"
                                                        alt=""
                                                        class="main-img"
                                                        />
                                                    <span class="radio-label-primary">Bank transfer</span>
                                                </label>
                                            </div>
                                        </div>
                                        <div class="shipping-info-left-payment-content-other">
                                            Customers transfer via bank's number:<br>
                                            0781000487810 - VCB - NGUYEN VAN DUNG <br>
                                            Content: Full name + phone number
                                        </div>
                                    </div>
                                    <c:if test="${not empty errors.paymentIDLengthError}">
                                        <font color="red">
                                        ${errors.paymentIDLengthError}
                                        </font><br/>
                                    </c:if>
                                </div>
                                <button class="shipping-info-left-btn" type="submit">
                                    Complete payment 
                                </button>
                            </div>
                        </div>
                    </form>
                    <img
                        srcset="images/Login-line.png 2x"
                        alt=""
                        class="shipping-info-space"
                        />
                    <!-- RIGHT -->
                    <div class="shipping-info-right">
                        <c:set var="cartList" value="${sessionScope.CART.items}" />
                        <c:set var="cartListDetail" value="${sessionScope.CART.itemDetail}" />
                        <c:set var="total" value="0" />
                        <div class="container">
                            <c:forEach var="item" items="${cartList}" varStatus="counter">
                                <c:forEach var="detail" items="${cartListDetail}">
                                    <c:if test="${item.key eq detail.key}">
                                        <div class="shipping-info-right-product">
                                            <div class="container">
                                                <div class="shipping-info-right-product-logo">
                                                    <div class="container">
                                                        <div class="shipping-info-right-product-logo-img">
                                                            <img
                                                                src="images/product-demo.png"
                                                                alt=""
                                                                class="shipping-info-right-product-logo-img-pic"
                                                                />
                                                        </div>
                                                        <span class="shipping-info-right-product-logo-quantity">
                                                            ${item.value}
                                                        </span>
                                                    </div>
                                                </div>
                                                <div class="shipping-info-right-product-content">
                                                    <div class="container">
                                                        <div class="shipping-info-right-product-content-name">
                                                            <div class="container">
                                                                <p
                                                                    class="shipping-info-right-product-content-name-title"
                                                                    >
                                                                    ${detail.value.name}
                                                                </p>
                                                                <p
                                                                    class="shipping-info-right-product-content-name-size"
                                                                    >
                                                                    ${detail.value.size}
                                                                </p>
                                                            </div>
                                                        </div>
                                                        <div class="shipping-info-right-product-content-price">
                                                            <div class="container">
                                                                <p
                                                                    class="shipping-info-right-product-content-price-number"
                                                                    >
                                                                    ${detail.value.price * item.value}₫
                                                                </p>
                                                            </div>
                                                            <c:set var="total" value="${total + detail.value.price * item.value}" />
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </c:forEach>
                            <div class="shipping-info-right-product-fee">
                                <div class="container">
                                    <div class="shipping-info-right-product-fee-name">
                                        <div class="container">
                                            <p
                                                class="shipping-info-right-product-fee-name-provisional"
                                                >
                                                Provisional
                                            </p>
                                            <p class="shipping-info-right-product-fee-name-ship">
                                                Shipping fee
                                            </p>
                                        </div>
                                    </div>
                                    <div class="shipping-info-right-product-fee-price">
                                        <div class="container">
                                            <p
                                                class="shipping-info-right-product-fee-price-provisional"
                                                >
                                                ${total}₫
                                            </p>
                                            <p class="shipping-info-right-product-fee-price-ship">
                                                <span id="shipping-fee">${SHIPPINGMETHOD_LIST[2].transportFee}</span>Đ
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="shipping-info-right-product-total">
                                <div class="container">
                                    <div class="shipping-info-right-product-total-name">
                                        <div class="container">
                                            <p class="shipping-info-right-product-total-name-title">
                                                Total
                                            </p>
                                        </div>
                                    </div>
                                    <div class="shipping-info-right-product-total-price">
                                        <div class="container">
                                            <p
                                                class="shipping-info-right-product-total-price-country"
                                                >
                                                VND
                                            </p>
                                            <p class="shipping-info-right-product-total-price-number">
                                                ${total + shippingMethod.transportFee}Đ
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- RIGHT -->
                </div>
            </section>

            <!-- FOOTER -->
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


        <script src="js/app2.js"></script>
    </body>
</html>
