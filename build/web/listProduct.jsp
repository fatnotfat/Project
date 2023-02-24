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
<!DOCTYPE html>
<html lang="en">

<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        <link href="style/paging.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="style/slideShow.css">
        <link rel="stylesheet" href="style/base.css">
        <link rel="stylesheet" href="style/listProduct.css">
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
                            if (i % 3 === 0) {
                                html += '<div class="product__row">';
                            }

                            html += '<div class="grid__column-3-4">'
                                    + '<div class="product__item">'
                                    + '<div class="product__item-img"><img/>'
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

                            if (i % 3 === 2 || i === data.length - 1) {
                                html += '</div>';
                            }
                        }
                        dataContainer.html(html);
                    }
                };
                $('#pagination-container').pagination(options);
            });
        </script>

    </head>

<body>
    <header>
        <div class="grid">
            <div class="grid__row">
                <div class="grid__column-10">
                    <nav>
                        <div class="nav_left">
                            <h2><a href="">LUXURY</a></h2>
                        </div>
                        <ul class="nav_center">
                            <li>

                                <div class="category__filter-include-type">
                                    <div class="filter-select">
                                        <p class="filter-select__label">
                                            Categories
                                        </p>

                                        <ul class="filter-select__list">
                                            <li class="filter-select__item">
                                                <a href="listProduct.html" class="filter-select__link">Dây chuyền</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="SearchByFilterServlet?txtProductCateID=1" class="filter-select__link">Vòng tay</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Nhẫn</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Khuyen tay</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Dong ho</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Mat kinh</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Nhẫn</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Nhẫn</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Nhẫn</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Nhẫn</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Nhẫn</a>
                                            </li>
                                            <li class="filter-select__item">
                                                <a href="" class="filter-select__link">Nhẫn</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>

                            </li>
                            <li>
                                <a href="#">
                                    About
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Shop
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Contact
                                </a>
                            </li>
                        </ul>

                        <ul class="nav_right">
                            <li>
                                <div class="search__bar-container">
                                    <div class="search__box">
                                        <svg width="24" height="25" viewBox="0 0 24 25" fill="none" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M11.5 21.5C16.7467 21.5 21 17.2467 21 12C21 6.75329 16.7467 2.5 11.5 2.5C6.25329 2.5 2 6.75329 2 12C2 17.2467 6.25329 21.5 11.5 21.5Z" stroke="#292D32" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
                                            <path d="M22 22.5L20 20.5" stroke="#292D32" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
                                        </svg>
                                        <form name="search" class="search__box-form">
                                            <input type="text" class="search__box-form-input" name="txt" onmouseout="this.value = ''; this.blur();">
                                            <button type="search">Seach</button>
                                        </form>
                                    </div>
                                </div>

                            </li>
                            <li>
                                <!-- cart shopping -->
                               <div class="cart__shopping"> 
                                <svg width="20" height="20" viewBox="0 0 20 20" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path
                                    d="M1.66663 1.66669H3.11663C4.01663 1.66669 4.72496 2.44169 4.64996 3.33335L3.95829 11.6333C3.84163 12.9917 4.91662 14.1583 6.28329 14.1583H15.1583C16.3583 14.1583 17.4083 13.175 17.5 11.9834L17.95 5.73336C18.05 4.35002 17 3.22502 15.6083 3.22502H4.84997"
                                    stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10"
                                    stroke-linecap="round" stroke-linejoin="round" />
                                <path
                                    d="M13.5417 18.3333C14.117 18.3333 14.5833 17.867 14.5833 17.2917C14.5833 16.7164 14.117 16.25 13.5417 16.25C12.9664 16.25 12.5 16.7164 12.5 17.2917C12.5 17.867 12.9664 18.3333 13.5417 18.3333Z"
                                    stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10"
                                    stroke-linecap="round" stroke-linejoin="round" />
                                <path
                                    d="M6.87504 18.3333C7.45034 18.3333 7.91671 17.867 7.91671 17.2917C7.91671 16.7164 7.45034 16.25 6.87504 16.25C6.29974 16.25 5.83337 16.7164 5.83337 17.2917C5.83337 17.867 6.29974 18.3333 6.87504 18.3333Z"
                                    stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10"
                                    stroke-linecap="round" stroke-linejoin="round" />
                                <path d="M7.5 6.66669H17.5" stroke="#292D32" stroke-width="1.5"
                                    stroke-miterlimit="10" stroke-linecap="round" stroke-linejoin="round" />
                                </svg>

                                <span class="cart__shopping-notice">
                                    1
                                </span>

                                <!-- No product in your's cart  bỏ class cart__shopping-list--no-cart nên nó ko hiện "Chưa có sản phẩm"  -->
                                <div class="cart__shopping-list">
                                    <img src="assets/image/no-cart.png" alt="" class="cart__shopping-list--no-cart-img">
                                    <span class="cart__shopping-list--no-cart-message">
                                        Chưa có sản phẩm trong giỏ hàng
                                    </span>

                                    <h4 class="cart__shopping-heading">Sản phẩm đã thêm vào giỏ hàng</h4>
                                    <!-- Product in your's cart  -->
                                    <ul class="cart__shopping-list-item">
                                        <li class="cart__shopping-item">
                                            <img src="assets/image/duck-light.jpg" alt="" class="cart__shopping-img">
                                            <div class="cart__shopping-item-info">
                                                <div class="cart__shopping-item-head">
                                                    <h5 class="cart__shopping-item-name">
                                                        Chú vịt vui vẻ hehehehehehe
                                                    </h5>

                                                    <div class="cart__shoping-item-price-wrap">
                                                        <span class="cart__shopping-item-price">1.000.000đ</span>
                                                        <span class="cart__shopping-item-multiply">x</span>
                                                        <span class="cart__shopping-item-quantity">10</span>
                                                    </div>

                                                </div>

                                                <div class="cart__shopping-item-body">
                                                    <span class="cart__shopping-item-description">
                                                        Loại sản phẩm: vàng
                                                    </span>

                                                    <span class="cart__shopping-item-remove">
                                                        Xóa
                                                    </span>
                                                </div>
                                            </div>
                                        </li>
                                       
                                        
                                    </ul>

                                    <button class="cart__shopping-view-cart btn__view-cart">
                                        Xem giỏ hàng
                                    </button>
                                </div>
                               </div>

                            </li>
                            <li>
                                <!-- User -->
                               <div class="user__shopping">
                                <!-- No account  -->
                                <!-- <div class="user__shopping user__shopping--no-account ">
                                    <div class="user__shopping-icon">
                                        <span class="material-symbols-outlined">
                                            Account_circle
                                        </span>
                                    </div>
                                    <ul class="user__shopping--no-account-list">
                                        <li class="user__shopping--no-account-list-item">
                                            <a href="" class="user__shopping--no-account-link">Đăng kí</a>
                                        </li>
                                        <li class="user__shopping--no-account-list-item">
                                            <a href="" class="user__shopping--no-account-link">Đăng nhập</a>
                                        </li>
                                    </ul>
                                </div> -->

                                <!-- Login success -->
                                <div class="user__shopping user__shopping--login-success ">
                                    <div class="user__shopping-icon">
                                        <span class="material-symbols-outlined">
                                            Account_circle
                                        </span>
                                    </div>
                                    <ul class="user__shopping--login-success-list">
                                        <li class="user__shopping--login-success-list-item">
                                            <a href="" class="user__shopping--login-success-link">Truong Dinh Dang Khoa</a>
                                        </li>
                                        <li class="user__shopping--login-success-list-item">
                                            <a href="" class="user__shopping--login-success-link">Log Out</a>
                                        </li>
                                    </ul>
                                </div>

                               </div>
                            </li>
                        </ul>

                        <!-- Nav responsive -->
                        <div class="nav_bars-cart">
                            <svg width="20" height="20" viewBox="0 0 20 20" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path
                                    d="M1.66663 1.66669H3.11663C4.01663 1.66669 4.72496 2.44169 4.64996 3.33335L3.95829 11.6333C3.84163 12.9917 4.91662 14.1583 6.28329 14.1583H15.1583C16.3583 14.1583 17.4083 13.175 17.5 11.9834L17.95 5.73336C18.05 4.35002 17 3.22502 15.6083 3.22502H4.84997"
                                    stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10"
                                    stroke-linecap="round" stroke-linejoin="round" />
                                <path
                                    d="M13.5417 18.3333C14.117 18.3333 14.5833 17.867 14.5833 17.2917C14.5833 16.7164 14.117 16.25 13.5417 16.25C12.9664 16.25 12.5 16.7164 12.5 17.2917C12.5 17.867 12.9664 18.3333 13.5417 18.3333Z"
                                    stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10"
                                    stroke-linecap="round" stroke-linejoin="round" />
                                <path
                                    d="M6.87504 18.3333C7.45034 18.3333 7.91671 17.867 7.91671 17.2917C7.91671 16.7164 7.45034 16.25 6.87504 16.25C6.29974 16.25 5.83337 16.7164 5.83337 17.2917C5.83337 17.867 6.29974 18.3333 6.87504 18.3333Z"
                                    stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10"
                                    stroke-linecap="round" stroke-linejoin="round" />
                                <path d="M7.5 6.66669H17.5" stroke="#292D32" stroke-width="1.5"
                                    stroke-miterlimit="10" stroke-linecap="round" stroke-linejoin="round" />
                            </svg>
                        </div>
                        <div class="nav_bars-brand">
                            <h2>LUXURY</h2>
                        </div>
                        <div class="nav_bars-btn">
                            <svg width="20" height="20" viewBox="0 0 20 20" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path d="M10 3.75H17.5" stroke="#292D32" stroke-width="1.5" stroke-linecap="round"
                                    stroke-linejoin="round" />
                                <path d="M10 7.91669H17.5" stroke="#292D32" stroke-width="1.5"
                                    stroke-linecap="round" stroke-linejoin="round" />
                                <path d="M2.5 12.0833H17.5" stroke="#292D32" stroke-width="1.5"
                                    stroke-linecap="round" stroke-linejoin="round" />
                                <path d="M2.5 16.25H17.5" stroke="#292D32" stroke-width="1.5" stroke-linecap="round"
                                    stroke-linejoin="round" />
                            </svg>

                        </div>

                    </nav>
                </div>

            </div>

        </div>
    </header>

    <div class="grid__full-width">
        <div class="image__include">
            <div class="image__include ima">
                <img class="image__include image__include-background" src="assets/image/div.png" alt="">
            </div>

            <div class="image__include image__include-title">
                <span>SLIVER Bracelet S925

                </span>
                <hr>
            </div>

        </div>


    </div>
    <div class="container">



        <div class="grid__full-width">
            <div class="grid__row">

<!--                <div class="grid__column-3">
                    <div class="category__filter">
                        <form class="category__filter-form" action="#">
                            <ul class="category__filter-include">
                                <li>
                                    <span class="category__filter-include-title">Price</span>
                                    <div class="category__filter-include-type">
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



                                </li>

                            </ul>
                        </form>
                    </div>
                </div>-->




                <div class="grid__column-9">


                    <div class="product">
<!--                        <div class="grid__row">
                             Product item 
                            <div class="grid__column-3-4">
                                <a class="product__item">
                                    <div class="product__item-img">
                                        <img/>
                                    </div>
                                    <div class="product__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                        0000C000582 </div>
                                    <div class="product__item-price">
                                        Giá:<span>7.954.000đ</span>
                                    </div>
                                    <div class="product__item-info">

                                        <button class="product__item-view">Xem Ngay</button>
                                    </div>
                                </a>

                            </div>
                            <div class="grid__column-3-4">
                                <a class="product__item">
                                    <div class="product__item-img">
                                        <img id="my-img" src="assets/image/" alt="" onmouseover="hover(this)">
                                    </div>
                                    <div class="product__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                        0000C000582 </div>
                                    <div class="product__item-price">
                                        Giá:<span>7.954.000đ</span>
                                    </div>
                                    <div class="product__item-info">

                                        <button class="product__item-view">Xem Ngay</button>
                                    </div>
                                </a>

                            </div>
                            <div class="grid__column-3-4">
                                <a class="product__item">
                                    <div class="product__item-img">
                                        <img id="my-img" src="assets/image/" alt="" onmouseover="hover(this)">
                                    </div>
                                    <div class="product__item-name">Nhẫn cưới nam Vàng 18K Disney|PNJ Sleeping Beauty
                                        0000C000582 </div>
                                    <div class="product__item-price">
                                        Giá:<span>7.954.000đ</span>
                                    </div>
                                    <div class="product__item-info">

                                        <button class="product__item-view">Xem Ngay</button>
                                    </div>
                                </a>

                            </div>

                            


                        </div>-->
                        <div id="data-container"></div>                               
                        <div id="pagination-container"></div>

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
                            <div class="item">
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
                                  <b>Luôn mang lại giá trị tốt nhất trong từng sản phẩm cho mỗi khách hàng đồng hành cùng  </b>
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
                                  <b>Chất lượng đi kèm uy tín của chúng tôi, đảm bảo chất lượng luôn được ưu tiên hàng đầu</b>
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

    <div class="footer">
    </div>


    <script src="js/listProduct.js"></script>
    <script src="js/slideShow.js"></script>
</body>

</html>