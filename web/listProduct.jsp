<%-- 
    Document   : listProduct
    Created on : Feb 18, 2023, 1:40:12 AM
    Author     : nguye
--%>

<%@page import="org.json.JSONException"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONArray"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        <link href="style/paging.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="style/slideShow.css">
        <link rel="stylesheet" href="style/base.css">
        <link rel="stylesheet" href="style/listProduct.css">
        <link rel="stylesheet" href="style/reset.css">
        <!--<link rel="stylesheet" href="style/grid.css">-->
        <link
            href="https://fonts.googleapis.com/css2?family=Aboreto&family=Montserrat:ital,wght@0,400;1,500&family=Raleway:wght@700&family=Roboto+Condensed:wght@300;400&family=Rubik:wght@300&display=swap"
            rel="stylesheet">
        <link rel="stylesheet"
              href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Fredoka+One&family=Montserrat&family=Noto+Serif+JP:wght@600;700&family=Signika:wght@300&family=Ubuntu:wght@700&family=Unbounded:wght@600&family=Varela+Round&family=Work+Sans:ital,wght@1,600&display=swap"
            rel="stylesheet">
        <link rel="stylesheet" href="myProjects/webProject/icofont/css/icofont.min.css">
        <link href='https://css.gg/facebook.css' rel='stylesheet'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />

        <!-- animation library -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
        <!-- slideshow.scss -->
        <link rel="stylesheet" href="style/slideShow.css">

        <!-- nav -->
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap"
            rel="stylesheet"
            />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
            integrity="sha384-rfVu76QvwHTPBoTlWt22iL/szRJBUHpGnwvz8EKFPeX9ykV7OLOdNPSuys7N+h+N"
            crossorigin="anonymous"
            />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/paginationjs/2.1.4/pagination.min.js"></script>
        <script>
            $(document).ready(function () {
                var dataSource = [];
            <%
                try {
                    // Assuming that your servlet stores the JSON data as a string in a variable called jsonData
                    String jsonData = (String) session.getAttribute("products");
                    System.out.println(jsonData);
                    JSONArray jsonArray = new JSONArray(jsonData);
                    for (int i = 0; i < jsonArray.length(); i++) {
//                                    if (jsonArray.get(i) instanceof String) {
//                                        String item = jsonArray.getString(i);
//                                        out.print("dataSource.push('" + item + "');\n");
//                                    }
                        Object element = jsonArray.get(i);
                        if (element instanceof String) {
                            String item = (String) element;
                            out.print("dataSource.push('" + item + "');\n");
                        } else if (element instanceof Number) {
                            Number item = (Number) element;
                            out.print("dataSource.push(" + item.toString() + ");\n");
                        } else if (element instanceof JSONObject) {
                            JSONObject obj = (JSONObject) element;

                            out.print("dataSource.push(" + obj.toString(2) + ");\n");
                            // Handle object element
                            System.out.println(obj.toString());
                        }
                    }
                } catch (JSONException ex) {
                    out.println("Error: " + ex.getMessage());
                    System.out.println(ex.getMessage());
                }
            %>
                var dataContainer = $('#data-container');
                var options = {
                    dataSource: dataSource,
                    pageSize: 9,
                    callback: function (data, pagination) {
                        var html = '';
//                        for (var i = 0; i < data.length; i++) {
//                            html += '<div>' + JSON.stringify(data[i].name) + '</div>';
//                        }
                        for (var i = 0; i < data.length; i++) {
//                            if (i % 3 === 0) {
//                                html += '<div class="product__row">';
//                            }

                            html += '<div class="grid__column-3-4">'
                                    + '<div class="product__item">'
                                    + '<div class="product__item-img">'
                                    + '<div  class="card">'
                                    + '<img  class="img-back" src="assets/image/necklake.png" alt="Card Back">'
                                    + '<img class="img-top" src="assets/image/duck-light.jpg" alt="Card Front">'
                                    + '</div>'
                                    + '</div>'
                                    + '<div class="product__item-name">'
                                    + JSON.stringify(data[i].name).replace(/^"(.*)"$/, '$1')
                                    + '</div>'
                                    + '<div class="product__item-price">'
                                    + 'Price:' + '<span>' + JSON.stringify(data[i].price) + '</span>'
                                    + '</div>'
                                    + '<div class="product__item-info">'
                                    + '<button class="product__item-view">Xem Ngay</button>'
                                    + '</div>'
                                    + '</div>'
                                    + '</div>';

//                            if (i % 3 === 2 || i === data.length - 1) {
//                                html += '</div>';
//                            }
                        }
                        dataContainer.html(html);
                    }
                };
                $('#pagination-container').pagination(options);
            });
        </script>

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
                                            <p style="font-size: 15px; margin: 5px 0">YOU ARE NOT ALREADY LOGGED, PLEASE LOGIN FIRST!!</p><br/>
                                            <%--<c:set var="URL" value="userCart.jsp" scope="session"/>--%>
                                            <a style="font-size: 15px; text-decoration: none; font-weight: bold; color: black" href="loginPage">Login here </a>
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
            <div class="grid__full-width">
                <div class="image__include">
                    <div class="image__include-image">
                        <img class="image__include image__include-background" src="assets/image/div.png" alt="">
                    </div>

                    <div class="image__include image__include-title">
                        <span>
                            SILVER Bracelet S925
                        </span>
                        <hr>
                    </div>

                </div>


            </div>
            <div class="container-body">
                <div class="grid">
                    <div class="grid__row">
                        <!-- PC  -->

                        <div class="grid__full-width">
                            <div class="product">
                                <div id="data-container" class="grid__row"></div>                               
                                <div id="pagination-container"></div>
                            </div>
                        </div>


                        <!-- iphone x -->
                        <div class="iphone">
                            <div class="grid__full-width iphone__filter">
                                <div class="category__filter ">
<!--                                    <form class="category__filter-form" action="#">
                                        <ul class="category__filter-include">
                                            <li>
                                                <span class="category__filter-include-title">Price</span>
                                                <div class="category__filter-include-button">
                                                    <input class="category__filter-include-input" type="text" name="" id=""
                                                           placeholder="0đ">
                                                    <input class="category__filter-include-input" type="text" name="" id=""
                                                           placeholder="9999999đ">
                                                </div>
                                            </li>

                                            <hr class="category__filter-line">

                                            <li class="category__filter-list-size-ring">


                                                <span class="category__filter-include-title">Size</span>
                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">10</label>
                                                </form>


                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">12</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">7</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">8</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">9</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">5</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">L</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">S</label>
                                                </form>



                                            </li>

                                            <hr class="category__filter-line">


                                            <li class="category__filter-list-size-clock">
                                                <span class="category__filter-include-title">Size</span>
                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">38</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">40</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">42</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">44</label>
                                                </form>

                                            </li>

                                            <hr class="category__filter-line">


                                            <li class="category__filter-list-size-bracelet">
                                                <span class="category__filter-include-title">Size</span>
                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">17</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">18</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">19</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">20</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">21</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">22</label>
                                                </form>

                                            </li>

                                            <hr class="category__filter-line">


                                            <li class="category__filter-list-size-necklace">
                                                <span class="category__filter-include-title">Size</span>
                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">50</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">55</label>
                                                </form>

                                                <form class="category__filter-include-type">
                                                    <input class="category__filter-include-checkbox" type="checkbox" name="" id="">
                                                    <label class="category__filter-include-size-label" for="">60</label>
                                                </form>

                                                <div class="category__filter-search">
                                                    <button>
                                                        Search
                                                    </button>
                                                </div>

                                            </li>

                                        </ul>
                                    </form>-->
                                </div>
                            </div>
                            <div class="show__filter">
                                <button class="show__filter-button" onclick="showCategory()">Show Filter</button>
                            </div>
                        </div>

                    </div>
                </div>




                <div class="grid__full-width">
                    <div class="grid__row">
                        <div class="slide__show-container">
                            <div class="content-width">
                                <div class="slideshow">
                                    <!-- Slideshow Items -->
                                    <div class="slideshow-items">
                                        <div class="grid item">
                                            <div class="item-image-container">
                                                <img class="item-image" src="assets/image/slide1.jpg" />
                                            </div>
                                            <!-- Staggered Header Elements -->
                                            <div class="item-header">
                                                <span class="vertical-part"><b>L</b></span>
                                                <span class="vertical-part"><b>u</b></span>
                                                <span class="vertical-part"><b>x</b></span>
                                                <span class="vertical-part"><b>u</b></span>
                                                <span class="vertical-part"><b>r</b></span>
                                                <span class="vertical-part"><b>y</b></span>
                                            </div>
                                            <!-- Staggered Description Elements -->
                                            <div class="item-description">
                                                <span class="vertical-part">
                                                    <b>Luôn mang lại giá trị tốt nhất trong từng sản phẩm cho mỗi khách hàng
                                                        đồng hành cùng </b>
                                                </span>

                                            </div>
                                        </div>
                                        <div class="item">
                                            <div class="item-image-container">
                                                <img class="item-image" src="assets/image/silde2.jpg" />
                                            </div>
                                            <!-- Staggered Header Elements -->
                                            <div class="item-header">
                                                <span class="vertical-part"><b>E</b></span>
                                                <span class="vertical-part"><b>l</b></span>
                                                <span class="vertical-part"><b>e</b></span>
                                                <span class="vertical-part"><b>g</b></span>
                                                <span class="vertical-part"><b>a</b></span>
                                                <span class="vertical-part"><b>n</b></span>
                                                <span class="vertical-part"><b>t</b></span>
                                            </div>
                                            <!-- Staggered Description Elements -->
                                            <div class="item-description">
                                                <span class="vertical-part">
                                                    <b>Chất lượng đi kèm uy tín của chúng tôi, đảm bảo chất lượng luôn được ưu
                                                        tiên hàng đầu</b>
                                                </span>

                                            </div>
                                        </div>
                                        <div class="item">
                                            <div class="item-image-container">
                                                <img class="item-image" src="assets/image/slide3.jpg" />
                                            </div>
                                            <!-- Staggered Header Elements -->
                                            <div class="item-header">
                                                <span class="vertical-part"><b>G</b></span>
                                                <span class="vertical-part"><b>o</b></span>
                                                <span class="vertical-part"><b>r</b></span>
                                                <span class="vertical-part"><b>g</b></span>
                                                <span class="vertical-part"><b>e</b></span>
                                                <span class="vertical-part"><b>o</b></span>
                                                <span class="vertical-part"><b>u</b></span>
                                                <span class="vertical-part"><b>s</b></span>

                                            </div>
                                            <!-- Staggered Description Elements -->
                                            <div class="item-description">
                                                <span class="vertical-part">
                                                    <b>Sự hài lòng của mỗi khách hàng là một niềm vinh hạnh cho chúng tôi </b>
                                                </span>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="controls">
                                        <ul>
                                            <li class="control" data-index="0"></li>
                                            <li class="control" data-index="1"></li>
                                            <li class="control" data-index="2"></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
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


        <script src="js/listProduct.js"></script>
        <script src="js/slideShow.js"></script>
        <script src="js/app.js"></script>
    </body>

</html>


<!--<div id="data-container"></div>                               
                        <div id="pagination-container"></div>-->