<%-- 
    Document   : inforUpdate
    Created on : Mar 8, 2023, 12:48:18 AM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Info Update(SWP391)</title>
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
        <link rel="stylesheet" href="style/info-update2.css" />
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
                                            <a href="SearchByFilterServlet?txtProductCateID=2" class="menu-link menu-link-ring">
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
                                                    srcset="images/shopping-icon-tab.png 2x"
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
                                                <p
                                                    class="menu-icon-tab-cart-content-function-total-price"
                                                    >
                                                    <fmt:formatNumber var="price" value="${totalPrice}" pattern="#,###"/>
                                                    ${price}₫
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
                              srcset="./assets/image/shopping-cart.png 2x"
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
                                                    <fmt:formatNumber var="price" value="${totalPrice}" pattern="#,###"/>
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
                                srcset="images/textalign-justifycenter.png 2x"
                                alt=""
                                />
                        </div>
                    </div>
                </div>
                <!--  -->
                <img src="images/Nav-line.png" alt="" class="nav-line-bot" />
            </header>
            <img src="images/Nav-line.png" alt="" />
            <div class="update">
                <div class="container">

                    <div class="update-heading">
                        <h1>
                            Update <br />
                            Account
                        </h1>
                    </div>
                    <img
                        class="update-space"
                        srcset="images/Login-line.png 2x"
                        alt=""
                        />
                    <img
                        class="update-space-mobile"
                        srcset="images/update-line-mobile.png 2x"
                        alt=""
                        />
                    <c:set var="updateError" value="${requestScope.UPDATE_ERROR}" />
                    <form action="updateAccountController">
                        <div class="update-form-container">
                            <div class="update-form">
                                <c:set var="firstName" value="${sessionScope.USER.name}"/>
                                <div class="update-form-control">
                                    <input
                                        type="text"
                                        id="first-name"
                                        class="update-input-first-name"
                                        placeholder="First name"
                                        name="txtFirstName"
                                        value="${fn:substringBefore(firstName, ' ')}"
                                        />
                                    <c:if test="${not empty updateError.firstNameLengthError}">
                                        <small>${updateError.firstNameLengthError}</small>
                                    </c:if>
                                </div>
                                <!--  -->
                                <c:set var="lastName" value="${sessionScope.USER.name}"/>
                                <div class="update-form-control">
                                    <input
                                        type="text"
                                        id="last-name"
                                        class="update-input-last-name"
                                        placeholder="Last name"
                                        name="txtLastName"
                                        value="${fn:substringAfter(lastName, ' ')}"
                                        />
                                    <c:if test="${not empty updateError.lastNameLengthError}">
                                        <small>${updateError.lastNameLengthError}</small>
                                    </c:if>
                                </div>
                                <!--  -->
                                <div class="update-form-gender">


                                    <div class="update-form-radio">

                                        <input
                                            type="radio"
                                            class="update-form-input-radio"
                                            id="gender-male"
                                            name="txtSex"
                                            value="Male"
                                            <c:if test="${sessionScope.USER.sex eq true}">
                                                checked
                                            </c:if>
                                            />
                                        <span class="update-form-input-check-logo"></span>
                                        <label for="gender-male" class="update-form-input-male"
                                               >Male</label
                                        >
                                        <c:if test="${not empty updateError.sexLengthError}">
                                            <small>${updateError.sexLengthError}</small>
                                        </c:if>
                                    </div>

                                    <!--  -->



                                    <div class="update-form-radio">

                                        <input
                                            type="radio"
                                            class="update-form-input-radio"
                                            id="gender-female"
                                            name="txtSex"
                                            value="Female"
                                            <c:if test="${sessionScope.USER.sex eq false}">
                                                checked
                                            </c:if>
                                            />

                                        <span class="update-form-input-check-logo"></span>
                                        <label for="gender-female" class="update-form-input-female"
                                               >Female</label
                                        >
                                        <c:if test="${not empty updateError.sexLengthError}">
                                            <small>${updateError.sexLengthError}</small>
                                        </c:if>
                                    </div>


                                    <!--  -->
                                </div>
                                <div class="update-form-control">

                                    <input
                                        type="date"
                                        id="date"
                                        class="update-input-date"
                                        placeholder="mm-dd-yyyy"
                                        name="txtBirthDate"
                                        <c:if test="${ not empty sessionScope.USER.birthDate}">
                                            value="${sessionScope.USER.birthDate}"
                                        </c:if>
                                        />

                                    <c:if test="${not empty updateError.birthDateLengthError}">
                                        <small>${updateError.birthDateLengthError}</small>
                                    </c:if>
                                </div>
                                <!--  -->
                                <div class="update-form-control">
                                    <input
                                        type="text"
                                        id="phone"
                                        class="update-input-phone"
                                        placeholder="Phone number"
                                        name="txtPhoneNumber"
                                        <c:if test="${not empty sessionScope.USER.phone}">
                                            value="${sessionScope.USER.phone}"
                                        </c:if>
                                        />
                                    <c:if test="${not empty updateError.phoneLengthError}">
                                        <small>${updateError.phoneLengthError}</small>
                                    </c:if>
                                </div>
                                <!--  -->
                                <!--  -->
                                <div class="update-form-control">
                                    <input
                                        type="text"
                                        id="address"
                                        class="update-input-address"
                                        placeholder="Address detail..."
                                        name="txtAddressDetail"
                                        <c:if test="${not empty sessionScope.USER.address}">
                                            value="${sessionScope.USER.address}"
                                        </c:if>
                                        />
                                    <c:if test="${not empty updateError.addressLengthError}">
                                        <small>${updateError.addressLengthError}</small>
                                    </c:if>

                                </div>
                                <!--  -->
                                <!-- ADDRESS CHOOSE -->
                                <div class="shipping-info-left-form-delivery-address-select">
                                    <!-- CITY -->
                                    <div class="shipping-info-left-form-city">
                                        <div class="container">
                                            <label class="field-label" for="stored-city"
                                                   >Province / City</label
                                            >
                                            <select class="field-input" id="stored-city" name="txtCity">
                                                <option
                                                    class="field-input-item"
                                                    data-name=""
                                                    value=""
                                                    >
                                                    Choose Province / city
                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={"nội dung"} và value ={} -->
                                                </option>
                                            </select>
                                        </div>
                                        <input type="hidden" id="txtCityDataName" name="txtCityDataName" value="">
                                    </div>
                                    <!-- DISTRICT -->
                                    <div class="shipping-info-left-form-district">
                                        <div class="container">
                                            <label class="field-label" for="stored-district"
                                                   >District</label
                                            >
                                            <select class="field-input" id="stored-district" name="txtDistrict">
                                                <option
                                                    class="field-input-item"
                                                    data-name=""
                                                    value=""
                                                    >
                                                    Choose District
                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={"nội dung"} và value ={} -->
                                                </option>
                                            </select>
                                        </div>
                                        <input type="hidden" id="txtDistrictDataName" name="txtDistrictDataName" value="">
                                    </div>
                                    <!-- WARD -->
                                    <div class="shipping-info-left-form-ward">
                                        <div class="container">
                                            <label class="field-label" for="stored-ward"
                                                   >Ward</label
                                            >
                                            <select class="field-input" id="stored-ward" name="txtWard">
                                                <option
                                                    class="field-input-item"
                                                    data-name=""
                                                    value=""
                                                    >
                                                    Choose Wards
                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={"nội dung"} và value ={} -->
                                                </option>
                                            </select>
                                        </div>
                                    </div>
                                    <input type="hidden" id="txtWardDataName" name="txtWardDataName" value="">
                                </div>
                                <c:if test="${not empty updateError.addressLengthError}">
                                    <small style="color: red;">${updateError.addressLengthError}</small>
                                </c:if>
                                <!--  -->
                                <!--  -->
                                <c:set var="typeOfLogin" value="${USER.typeOfLogin}" />
                                <c:if test="${typeOfLogin eq 0}">
                                    <div class="update-form-control">
                                        <input
                                            type="password"
                                            id="password"
                                            class="update-input-password"
                                            name="txtPassword"
                                            placeholder="Password"
                                            value=""
                                            />
                                        <c:if test="${not empty updateError.passwordLengthError}">
                                            <small color="red">
                                                ${updateError.passwordLengthError}
                                            </small><br/>
                                        </c:if>
                                    </div>
                                    <!--  -->
                                    <div class="update-form-control">
                                        <input
                                            type="password"
                                            id="confirm-password"
                                            class="update-input-confirm-password"
                                            name="txtConfirm"
                                            placeholder="Confirm Password"
                                            value=""
                                            />
                                        <c:if test="${not empty updateError.confirmNotMatched}">
                                            <small color="red">
                                                ${updateError.confirmNotMatched}
                                            </small><br/>
                                        </c:if>
                                    </div>
                                </c:if>
                                <!--  -->
                            </div>
                            <div class="update-function">
                                <p class="update-function-security">
                                    This site is protected by reCAPTCHA and the Google
                                    <a href="https://policies.google.com/terms">Privacy Policy</a>
                                    and
                                    <a href="https://policies.google.com/privacy"
                                       >Terms of Service</a
                                    >
                                    apply.
                                </p>
                                <button class="update-function-btn">CONFIRM</button>
                                <p class="update-function-update">
                                    <a href="userInforPage" class="update-function-update-hightlight"
                                       ><i class="fa-solid fa-arrow-left-long"></i> Back to Account
                                        Infomation Page</a
                                    >
                                </p>
                            </div>
                        </div>
                    </form>
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
