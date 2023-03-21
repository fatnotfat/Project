<%-- 
    Document   : viewProduct
    Created on : Mar 4, 2023, 12:08:27 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ProductItem</title>
        <link rel="stylesheet" href="style/reset.css">
        <link rel="stylesheet" href="style/base.css">
        <link rel="stylesheet" href="style/productItem.css">
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
        <link rel="stylesheet" href="myProjects/webProject/icofont/css/icofont.min.css">
        <link href='https://css.gg/facebook.css' rel='stylesheet'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />


        <!-- Link Swiper's CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />

        <!-- animation library -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
                                    <c:set var="uri" value="${pageContext.request.requestURI}" scope="session"/>
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
                                                <c:if test="${empty sessionScope.CART.items.size()}">
                                                    <c:set var="cartSize" value="${0}"/>
                                                    <%--<c:set var="CART_PRICE" value="${calculateTotalPrice()}" scope="session"/>--%>
                                                </c:if>
                                                <p class="menu-icon-tab-cart-content-show-txt-desc">
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
                                                    id="totalPrice"
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

            <div class="container">
                <div class="grid__full-width">
                    <div class="grid__row">
                        <div class="product__item">
                            <div class="grid__column-8">
                                <div class="product__item-img">
                                    <img src="assets/image/331131002_877885213442462_5128773086041927233_n.png" alt="">
                                    <div class="product__item-img-group-2">
                                        <img src="assets/image/slide1.jpg" alt="">
                                        <img src="assets/image/slide3.jpg" alt="">
                                        <img src="assets/image/silde2.jpg" alt="">
                                        <img src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="">

                                    </div>

                                </div>
                            </div>
                            <c:if test="${not empty requestScope.FEEDBACK_SUCCESS}">
                                <script>alert('${requestScope.FEEDBACK_SUCCESS}');</script>
                            </c:if>
                            <c:if test="${not empty requestScope.FEEDBACK_ERROR_RESULT}">
                                <script>alert('${requestScope.FEEDBACK_ERROR_RESULT}');</script>
                            </c:if>

                            <c:set var="itemDetail" value="${sessionScope.ITEM_DETAIL}" />

                            <div class="grid__column-4">
                                <div class="product__item-include">
                                    <div class="product__item-info">
                                        <h4 class="product__item-info-title">${itemDetail.name}</h4>
                                        <fmt:formatNumber var="price" value="${itemDetail.price}" pattern="###,###" />

                                        <span class="product__item-info-price">${price}đ</span>
                                        <div class="product__item-info-description">
                                            <p>${itemDetail.description}</p>
                                        </div>
                                        <div class="product__item-group-sell">
                                            <div class="product__item-info-quantity">
                                                <!--<input type="text" placeholder="Quantity">-->
                                                <!--<form action="" method="">-->
                                                <input id="product-id" type="hidden" name="txtProductID" value="${itemDetail.id}" />
                                                <button id="add-to-cart-btn" class="product__item-add-to-cart">Add to Cart</button>
                                                <!--</form>-->
                                            </div>
                                            <div class="product__item-buy">
                                                <button class="product__item-buy-now">Buy Now</button>
                                            </div>
                                        </div>

                                    </div>

                                    <hr>

                                    <div class="product__item-contact-admin">
                                        <p>
                                            If the product you are interested in shows out of stock on the website. 
                                            Please INBOX directly with Helios for fastest support.
                                            Sincerely thank!
                                        </p>
                                    </div>

                                    <hr>
                                    <c:set var="user" value="${sessionScope.USER}" />
                                    <c:set var="fbError" value="${requestScope.FEEDBACK_ERROR}"/>
                                    <div class="product__item-info-review">
                                        <div class="product__item-info-review-btn">
                                            <button class="product__item-info-review-btn-input"><i class="fa-solid fa-pen"></i> Write a review</button>
                                        </div>
                                        <c:if test="${not empty user}">
                                            <form class="product__item-info-review-content" action="addCommentController" method="POST">
                                                <div class="product__item-info-review-input">
                                                    <label for="stored-name" class="field-label">Name</label>
                                                    <input type="text" class="field-input" disabled id="stored-name" placeholder="Your name" value="${user.name}">
                                                    <input type="hidden" name="txtCustomerID" value="${user.customerID}" />
                                                    <input id="product-id" type="hidden" name="txtProductID" value="${itemDetail.id}" />

                                                </div>
                                                <div class="product__item-info-review-input">
                                                    <label for="stored-review" class="field-label">Write your review</label>
                                                    <textarea name="txtComment" type="text" class="field-input" id="stored-review" placeholder="Your review">
                                                    </textarea>
                                                </div>
                                                <c:if test="${not empty fbError.commentError}">
                                                    <p style="color: red; text-align: center; font-size: 15px;">${fbError.commentError}</p>
                                                </c:if>
                                                <div class="product__item-info-review-star">
                                                    <span class="star">&#9734;</span>
                                                    <span class="star">&#9734;</span>
                                                    <span class="star">&#9734;</span>
                                                    <span class="star">&#9734;</span>
                                                    <span class="star">&#9734;</span>
                                                    <p class="current-rating">0 of 5</p>
                                                    <input type="hidden" name="txtVoting" value="" />
                                                </div>
                                                <c:if test="${not empty fbError.votingError}">
                                                    <p style="color: red; text-align: center; font-size: 15px;"> ${fbError.votingError} </p>
                                                </c:if>
                                                <div class="product__item-info-review-btn">
                                                    <button class="product__item-info-review-btn-submit"><i class="fa-solid fa-pen"></i> SEND</button>
                                                </div>
                                            </form>
                                        </c:if>
                                        <c:if test="${empty user}">
                                            <div style="display: flex;
                                                 flex-direction: column;
                                                 align-items: center;" class="product__item-info-review-content">
                                                <p style="margin-bottom: 15px;">You must login before do this feature!</p>
                                                <form action="loginPage" method="GET">
                                                    <button class="menu-icon-tab-cart-content-function-method-btn">
                                                        <a style="font-size: 15px; text-decoration: none; font-weight: bold; color: inherit" href="loginPage">LOGIN</a>

                                                    </button>
                                                </form>
                                            </div>
                                        </c:if>
                                        <div class="product__item-info-review-list">
                                            <!-- ITEM COMMENT -->
                                            <div class="product__item-info-review-list-item">
                                                <div>
                                                    <img src="images/default-avatar_120.jpg" alt="picture" class="product__item-info-review-list-item-avatar">
                                                </div>
                                                <div class="product__item-info-review-list-item-content">
                                                    <p class="product__item-info-review-list-item-content-name">
                                                        Name
                                                    </p>
                                                    <div class="product__item-info-review-list-item-content-rating">
                                                        <div class="product__item-info-review-list-item-content-rating rating">
                                                            <span class="star-cmt">&#9733;</span> 5
                                                        </div>
                                                        <div class="product__item-info-review-list-item-content-rating date">
                                                            3/10/2023 
                                                        </div>
                                                    </div>
                                                    <div class="product__item-info-review-list-item-content-comment">
                                                        <p class="product__item-info-review-list-item-content-comment-txt">
                                                            Good product
                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- ITEM COMMENT -->
                                        </div>
                                    </div> 

                                    <!--                                    <div class="product__item-info-description">
                                                                            <span class="product__item-info-description-describe">Mô tả:</span></br>
                                                                            <p>Thông số đồng hồ</p>
                                                                            <p>Mặt đồng hồ : <span>size 40mm</span></p>
                                                                            <p>Size dây: <span>22mm</span></p>
                                                                            <p>Chất liệu vỏ là thép không gỉ 316L mạ màu vàng hồng và màu bạc đánh xước. ( chất liệu
                                                                                này là
                                                                                chất liệu đa số những hãng đồng hồ lớn sử dụng ) Không bị phai màu.</p>
                                    
                                                                            <p>Dây cơ bản theo sẵn dùng dây Genuine leather. Là một thuật ngữ nói đây là da thật. Da
                                                                                của
                                                                                mình là da bò thật làm giống vân cá sấu.</p>
                                    
                                                                            <p> Máy sử dụng : <span> Miyota 2115. Máy sản xuất tại NHẬT BẢN hãng Miyota</span></p>
                                    
                                                                            <p> Mặt kính : <span>Kính Minerals, dày 2mm</span></p>
                                    
                                                                            <p> Chống nước 3 ATM : <span> 3ATM thì đây là chiếc đồng hồ có khả năng chống nước trung
                                                                                    bình. Ví dụ
                                                                                    chống nước đối với các trường hợp đi mưa, rửa tay, rửa chén hay rửa xe… Không
                                                                                    bơi lội, tắm giặt.</span></p>
                                    
                                    
                                                                        </div>-->

                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>

            <!--Phần mới cập nhật từ đây  -->

            <!-- Swiper -->
            <div class="slide__show">
                <div class="grid">
                    <div class="grid__row">
                        <div class="grid__full-width">
                            <h1 class="slider__title">You may also like</h1>
                            <div class="slider__include">
                                <div class="swiper mySwiper">
                                    <div class="swiper-wrapper">
                                        <div class="swiper-slide">
                                            <a class="more__item">
                                                <div class="more__item-img">
                                                    <div class="card">
                                                        <img class="img-back" src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="Card Back">
                                                        <img src="assets/image/6.Vòng tay bạc nam, nữ HeliSilver Cuban Twinkle 2 hàng đá S950 (2).jpg" class="img-top" alt="Card Front">
                                                    </div>
                                                </div>
                                                <div class="more__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                                    0000C000582 </div>
                                                <div class="more__item-price">
                                                    Giá:<span>7.954.000đ</span>
                                                </div>
                                                <div class="more__item-info">

                                                    <button class="more__item-view">Xem Ngay</button>
                                                </div>
                                            </a>

                                        </div>

                                        <div class="swiper-slide">
                                            <a class="more__item">
                                                <div class="more__item-img">
                                                    <div class="card">
                                                        <img class="img-back" src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="Card Back">
                                                        <img src="assets/image/6.Vòng tay bạc nam, nữ HeliSilver Cuban Twinkle 2 hàng đá S950 (2).jpg" class="img-top" alt="Card Front">
                                                    </div>
                                                </div>
                                                <div class="more__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                                    0000C000582 </div>
                                                <div class="more__item-price">
                                                    Giá:<span>7.954.000đ</span>
                                                </div>
                                                <div class="more__item-info">

                                                    <button class="more__item-view">Xem Ngay</button>
                                                </div>
                                            </a>

                                        </div>

                                        <div class="swiper-slide">
                                            <a class="more__item">
                                                <div class="more__item-img">
                                                    <div class="card">
                                                        <img class="img-back" src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="Card Back">
                                                        <img src="assets/image/6.Vòng tay bạc nam, nữ HeliSilver Cuban Twinkle 2 hàng đá S950 (2).jpg" class="img-top" alt="Card Front">
                                                    </div>
                                                </div>
                                                <div class="more__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                                    0000C000582 </div>
                                                <div class="more__item-price">
                                                    Giá:<span>7.954.000đ</span>
                                                </div>
                                                <div class="more__item-info">

                                                    <button class="more__item-view">Xem Ngay</button>
                                                </div>
                                            </a>

                                        </div>

                                        <div class="swiper-slide">
                                            <a class="more__item">
                                                <div class="more__item-img">
                                                    <div class="card">
                                                        <img class="img-back" src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="Card Back">
                                                        <img src="assets/image/6.Vòng tay bạc nam, nữ HeliSilver Cuban Twinkle 2 hàng đá S950 (2).jpg" class="img-top" alt="Card Front">
                                                    </div>
                                                </div>
                                                <div class="more__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                                    0000C000582 </div>
                                                <div class="more__item-price">
                                                    Giá:<span>7.954.000đ</span>
                                                </div>
                                                <div class="more__item-info">

                                                    <button class="more__item-view">Xem Ngay</button>
                                                </div>
                                            </a>

                                        </div>

                                        <div class="swiper-slide">
                                            <a class="more__item">
                                                <div class="more__item-img">
                                                    <div class="card">
                                                        <img class="img-back" src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="Card Back">
                                                        <img src="assets/image/6.Vòng tay bạc nam, nữ HeliSilver Cuban Twinkle 2 hàng đá S950 (2).jpg" class="img-top" alt="Card Front">
                                                    </div>
                                                </div>
                                                <div class="more__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                                    0000C000582 </div>
                                                <div class="more__item-price">
                                                    Giá:<span>7.954.000đ</span>
                                                </div>
                                                <div class="more__item-info">

                                                    <button class="more__item-view">Xem Ngay</button>
                                                </div>
                                            </a>

                                        </div>

                                        <div class="swiper-slide">
                                            <a class="more__item">
                                                <div class="more__item-img">
                                                    <div class="card">
                                                        <img class="img-back" src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="Card Back">
                                                        <img src="assets/image/6.Vòng tay bạc nam, nữ HeliSilver Cuban Twinkle 2 hàng đá S950 (2).jpg" class="img-top" alt="Card Front">
                                                    </div>
                                                </div>
                                                <div class="more__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                                    0000C000582 </div>
                                                <div class="more__item-price">
                                                    Giá:<span>7.954.000đ</span>
                                                </div>
                                                <div class="more__item-info">

                                                    <button class="more__item-view">Xem Ngay</button>
                                                </div>
                                            </a>

                                        </div>

                                        <div class="swiper-slide">
                                            <a class="more__item">
                                                <div class="more__item-img">
                                                    <div class="card">
                                                        <img class="img-back" src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="Card Back">
                                                        <img src="assets/image/6.Vòng tay bạc nam, nữ HeliSilver Cuban Twinkle 2 hàng đá S950 (2).jpg" class="img-top" alt="Card Front">
                                                    </div>
                                                </div>
                                                <div class="more__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                                    0000C000582 </div>
                                                <div class="more__item-price">
                                                    Giá:<span>7.954.000đ</span>
                                                </div>
                                                <div class="more__item-info">

                                                    <button class="more__item-view">Xem Ngay</button>
                                                </div>
                                            </a>

                                        </div>

                                        <div class="swiper-slide">
                                            <a class="more__item">
                                                <div class="more__item-img">
                                                    <div class="card">
                                                        <img class="img-back" src="assets/image/4.Vòng tay bạc nam, nữ HeliSilver Chain Helios Gle x Lotus Helios Original S925 (5).jpg" alt="Card Back">
                                                        <img src="assets/image/6.Vòng tay bạc nam, nữ HeliSilver Cuban Twinkle 2 hàng đá S950 (2).jpg" class="img-top" alt="Card Front">
                                                    </div>
                                                </div>
                                                <div class="more__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                                    0000C000582 </div>
                                                <div class="more__item-price">
                                                    Giá:<span>7.954.000đ</span>
                                                </div>
                                                <div class="more__item-info">

                                                    <button class="more__item-view">Xem Ngay</button>
                                                </div>
                                            </a>

                                        </div>
                                    </div>

                                    <div class="swiper-scroll">
                                        <div class="swiper-pagination"></div>
                                    </div>

                                    <div class="swiper-button-next"></div>
                                    <div class="swiper-button-prev"></div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <!-- Swiper JS -->
            <script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>

            <!-- Initialize Swiper -->
            <script>
                                    var swiper = new Swiper(".mySwiper", {
                                        slidesPerView: 3,
                                        spaceBetween: 30,
                                        freeMode: true,
                                        cssMode: true,
                                        navigation: {
                                            nextEl: ".swiper-button-next",
                                            prevEl: ".swiper-button-prev",
                                        },
                                        pagination: {
                                            el: ".swiper-pagination",
                                            clickable: true,
                                        },
                                        mousewheel: true,
                                        keyboard: true,
                                    });
            </script>

            <!-- tới đây nha..... -->
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
        <!--<script src="js/productItem.js"></script>-->
        <script src="js/cart2.js"></script>
        <script src="js/app.js"></script>
        <script src="js/rating-star.js"></script>
    </body>
</html>
