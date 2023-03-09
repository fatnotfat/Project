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

        <script>
            function formatNumberWithCommas(number) {
                var parts = number.toString().split(".");
                parts[0] = parts[0].replace(/\B(?=(\d{3})+(?!\d))/g, ",");
//                if (parts.length > 1) {
//                    parts[1] = parts[1].substring(0, 2); // limit decimal places to 2
//                }
                return parts.join(".");
            }

//            function calculateTotalPrice() {
//                var total = 0;
//                $('.your-cart-body-left-product-detail-right-sum').each(function () {
//                    var price = parseFloat($(this).find('span').text().replace(',', ''));
//                    total += price;
//                });
//                return total;
//            }

            function updateQuantity(itemId, operation) {
//                var quantityElement = document.getElementById('quantity' + itemId).innerHTML;
                var quantityElement = document.getElementById('quantity' + itemId);
                var quantity = parseInt(quantityElement.innerHTML);
                var priceElement = document.getElementById("price-" + itemId);
                var price = priceElement.innerHTML.replace(/[^0-9\.]+/g, "");


                if (operation === 'minus') {
                    quantity--;
                    if (quantity < 1) {
                        quantity = 1;
                        price = price / (quantity + 1) * 2;
                    } else {
                        price = price / (quantity + 1) * quantity;
                    }
                } else {
                    quantity++;
                    price = price / (quantity - 1) * quantity;
                }

                document.getElementById('quantity' + itemId).innerHTML = quantity;
//                priceElement.innerHTML = price.toLocaleString();
                priceElement.innerHTML = formatNumberWithCommas(price.toFixed());
                // update the total price
                var totalPrice = calculateTotalPrice();
//                alert(totalPrice);
                $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
                var xhr = new XMLHttpRequest();
                xhr.open('POST', 'UpdateCartServlet', true);
                xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                xhr.onreadystatechange = function () {
                    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
                        var response = JSON.parse(xhr.responseText);
                        var quantityElement = document.querySelector("#quantity" + itemId);
                        if (quantityElement) {
                            quantityElement.textContent = response.quantity;
                        }
//                        var totalPriceAllProduct = document.getElementById("total-price");
//                        totalPriceAllProduct.innerHTML = totalPrice.text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
                    }
                };
                xhr.send('txtID=' + itemId + '&txtQuantity=' + quantity);
            }
        </script>



        <script>
            function removeSelectedItem(itemId, rowIndex, callback) {

                $.ajax({
                    type: "POST",
                    url: "RemoveItemFromCartServlet",
                    data: {txtId: itemId},
                    success: function (response) {
                        if (response.success) {
                            // call the callback function with the ID of the removed item
                            callback(itemId, rowIndex);
                            // update the cart UI with the updated cart data
                            var cartData = response.cart;
                            console.log("removeSelectedItem called with itemId = " + itemId);

                            $("#cartTable tr").each(function () {
                                var rowItemId = $(this).find("input[name='txtId']").val();
                                if (rowItemId === itemId) {
                                    $(this).remove();
                                }
                            });
//                            $("#cartTable tr:gt(0)").each(function (index) {
//                                $(this).find("#count-" + itemId).text(index + 1);
//                            });
                        } else {
                            // handle error response from servlet
                            console.log(response.message);
                        }
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        // handle network error
                        console.log(errorThrown);
                    }
                });
            }

        </script>   




        <link rel="stylesheet" href="style/reset.css" />
        <link rel="stylesheet" href="style/payment-1.css" />
        <script>

            function calculateTotalPrice() {
                var total = 0;
                $('.your-cart-body-left-product-detail-right-sum').each(function () {
                    var price = parseFloat($(this).find('span').text().replace(/,/g, ''));
//                    var price = parseFloat(priceString);
//                    alert($(this).find('span').text().replace(/,/g, ''));
                    total += price;
//                    alert(total);
                });
                return total;
            }

//            function calculateTotalPrice() {
//                var total = 0;
//                $('.your-cart-body-left-product-detail-right-sum').each(function () {
//                    var priceString = $(this).find('span').text().replace(',', '');
//                    var price = parseFloat(priceString.replace('₫', '').trim());
//                    total += price;
//                });
//                var formattedTotal = total.toLocaleString('en-US', {minimumFractionDigits: 0, maximumFractionDigits: 0});
//                $('#total-price').text(formattedTotal + '₫');
//                return total;
//            }

            function removeProduct(itemId) {
                if (confirm("Are you sure you want to remove this item from your cart?")) {
                    $.ajax({
                        type: "POST",
                        url: "RemoveItemFromCartServlet",
                        data: {txtId: itemId},
                        success: function (response) {
                            if (response.success) {
                                // update the cart UI with the updated cart data
                                var cartData = response.cart;
                                console.log("removeProduct called with itemId = " + itemId);

                                // remove the div tag with the corresponding item id
                                $("#product-" + itemId).remove();
                                // update the cart size in the UI
                                updateCartSize();

                                // update the total price
                                var totalPrice = calculateTotalPrice();
                                $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
                            } else {
                                // handle error response from servlet
                                console.log(response.message);
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            // handle network error
                            console.log(errorThrown);
                        }
                    });
                }
            }


            function updateCartSize() {
                $.ajax({
                    type: "GET",
                    url: "GetCartSizeServlet",
                    success: function (response) {
                        $("#cart-size").text(response.cartSize);
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        // handle error
                    }
                });
            }

            $(document).ready(function () {
                var totalPrice = calculateTotalPrice();
                $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
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
                                                    src="images/shopping-icon-tab.png"
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
                            <span id="cart-size" class="your-cart-desc-number" style="font-weight: 700"
                                  >${cartSize}</span
                            >
                            <span style="font-weight: 700">product</span> in your cart
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
                                                                            onclick="updateQuantity('${item.key}', 'minus')" id="minus_${item.key}"
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
                                                                            onclick="updateQuantity('${item.key}', 'plus')" id="plus_${item.key}"
                                                                            >
                                                                            +
                                                                        </button>


                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="your-cart-body-left-product-detail-right">
                                                                <div class="container">
                                                                    <span
                                                                        class="your-cart-body-left-product-detail-right-icon "
                                                                        onclick="removeProduct('${item.key}')"
                                                                        >
                                                                        <i class="fa-solid fa-xmark"></i>
                                                                    </span>
                                                                    <p
                                                                        class="your-cart-body-left-product-detail-right-sum"
                                                                        >

                                                                        <fmt:formatNumber var="price" value="${detail.value.price * item.value}" pattern="#,###"/>
                                                                        <span id="price-${item.key}">${price}</span>₫
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
                                                    <a href="shippingPage">
                                                        <button class="your-cart-body-right-order-btn">
                                                            PAY
                                                        </button>
                                                    </a>
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
