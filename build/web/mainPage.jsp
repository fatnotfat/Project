<%-- 
    Document   : mainPage
    Created on : Feb 8, 2023, 1:44:23 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Main Page</title>
        <link rel="stylesheet" href="style/style.css">
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
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
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
              integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
    </head>
    <body>
        <div class="main">
        <header>
            <nav>
                <div class="nav_left">
                    <h2>LUXURY</h2>
                </div>
                <ul class="nav_center">
                    <li>
                        <a href="#">
                            Categories
                        </a>
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
                        <!-- search -->
                        <svg width="24" height="25" viewBox="0 0 24 25" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <path
                                d="M11.5 21.5C16.7467 21.5 21 17.2467 21 12C21 6.75329 16.7467 2.5 11.5 2.5C6.25329 2.5 2 6.75329 2 12C2 17.2467 6.25329 21.5 11.5 21.5Z"
                                stroke="#292D32" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" />
                            <path d="M22 22.5L20 20.5" stroke="#292D32" stroke-width="1.5" stroke-linecap="round"
                                stroke-linejoin="round" />
                        </svg>


                    </li>
                    <li>
                        <!-- cart shopping -->
                        <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <path
                                d="M1.66663 1.66669H3.11663C4.01663 1.66669 4.72496 2.44169 4.64996 3.33335L3.95829 11.6333C3.84163 12.9917 4.91662 14.1583 6.28329 14.1583H15.1583C16.3583 14.1583 17.4083 13.175 17.5 11.9834L17.95 5.73336C18.05 4.35002 17 3.22502 15.6083 3.22502H4.84997"
                                stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10" stroke-linecap="round"
                                stroke-linejoin="round" />
                            <path
                                d="M13.5417 18.3333C14.117 18.3333 14.5833 17.867 14.5833 17.2917C14.5833 16.7164 14.117 16.25 13.5417 16.25C12.9664 16.25 12.5 16.7164 12.5 17.2917C12.5 17.867 12.9664 18.3333 13.5417 18.3333Z"
                                stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10" stroke-linecap="round"
                                stroke-linejoin="round" />
                            <path
                                d="M6.87504 18.3333C7.45034 18.3333 7.91671 17.867 7.91671 17.2917C7.91671 16.7164 7.45034 16.25 6.87504 16.25C6.29974 16.25 5.83337 16.7164 5.83337 17.2917C5.83337 17.867 6.29974 18.3333 6.87504 18.3333Z"
                                stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10" stroke-linecap="round"
                                stroke-linejoin="round" />
                            <path d="M7.5 6.66669H17.5" stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10"
                                stroke-linecap="round" stroke-linejoin="round" />
                        </svg>

                    </li>
                    <li>
                        <span class="material-symbols-outlined">
                            Account_circle
                        </span>
                    </li>
                </ul>

                <!-- Nav responsive -->
                <div class="nav_bars-cart">
                    <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path
                            d="M1.66663 1.66669H3.11663C4.01663 1.66669 4.72496 2.44169 4.64996 3.33335L3.95829 11.6333C3.84163 12.9917 4.91662 14.1583 6.28329 14.1583H15.1583C16.3583 14.1583 17.4083 13.175 17.5 11.9834L17.95 5.73336C18.05 4.35002 17 3.22502 15.6083 3.22502H4.84997"
                            stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10" stroke-linecap="round"
                            stroke-linejoin="round" />
                        <path
                            d="M13.5417 18.3333C14.117 18.3333 14.5833 17.867 14.5833 17.2917C14.5833 16.7164 14.117 16.25 13.5417 16.25C12.9664 16.25 12.5 16.7164 12.5 17.2917C12.5 17.867 12.9664 18.3333 13.5417 18.3333Z"
                            stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10" stroke-linecap="round"
                            stroke-linejoin="round" />
                        <path
                            d="M6.87504 18.3333C7.45034 18.3333 7.91671 17.867 7.91671 17.2917C7.91671 16.7164 7.45034 16.25 6.87504 16.25C6.29974 16.25 5.83337 16.7164 5.83337 17.2917C5.83337 17.867 6.29974 18.3333 6.87504 18.3333Z"
                            stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10" stroke-linecap="round"
                            stroke-linejoin="round" />
                        <path d="M7.5 6.66669H17.5" stroke="#292D32" stroke-width="1.5" stroke-miterlimit="10"
                            stroke-linecap="round" stroke-linejoin="round" />
                    </svg>
                </div>
                <div class="nav_bars-brand">
                    <h2>LUXURY</h2>
                </div>
                <div class="nav_bars-btn">
                    <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path d="M10 3.75H17.5" stroke="#292D32" stroke-width="1.5" stroke-linecap="round"
                            stroke-linejoin="round" />
                        <path d="M10 7.91669H17.5" stroke="#292D32" stroke-width="1.5" stroke-linecap="round"
                            stroke-linejoin="round" />
                        <path d="M2.5 12.0833H17.5" stroke="#292D32" stroke-width="1.5" stroke-linecap="round"
                            stroke-linejoin="round" />
                        <path d="M2.5 16.25H17.5" stroke="#292D32" stroke-width="1.5" stroke-linecap="round"
                            stroke-linejoin="round" />
                    </svg>

                </div>

            </nav>
        </header>

        <div class="main_page">
            <div class="product">
                <div class="product_firstline">
                    <div class="first-ring">
                        <img src="images/Group.jpg" alt="cat">
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
                            Lorem ipsum dolor sit amet consectetur. Sollicitudin morbi
                            molestie at amet praesent tortor. Maecenas non tempus at
                            consequat ac est varius. Tortor aliquet nulia consequat risus.
                        </p>
                        <img src="images/2 1.jpg" alt="humuhumu">
                    </div>
                </div>
    
                <div class="product_secondline">
                    <img src="images/Group (1).jpg" alt="">
    
                    <div class="product-info">
                        <div class="product-content">
                            <h4>Gold Woven Chain Bracelet In Black</h4>
                            <p>
                                Lorem ipsum dolor sit amet consectetur.
                                Sollicitudin morbi molestie at amet praesent tortor. Maecenas non tempus at consequat ac est
                                varius. Tortor aliquet nulla consequat risus.
                            </p>
                        </div>
    
                        <div class="product-size">
                            <h4>Size</h4>
                            <label for="">S</label>
                            <label for="">M</label>
                            <label for="">L</label>
                        </div>
    
                        <form class="product-buy" action="#">
                            <button>Add To Cart</button>
                            <p>26.339.000 đ</p>
                        </form>
                    </div>
    
                </div>
    
                <div class="product_thirdline">
    
                    <div class="product-info">
                        <div class="product-content">
                            <h4>Gold Black Coral Ring</h4>
                            <p>
                                Lorem ipsum dolor sit amet consectetur.
                                Sollicitudin morbi molestie at amet praesent tortor. Maecenas non tempus at consequat ac est
                                varius. Tortor aliquet nulla consequat risus.
                            </p>
                        </div>
    
                        <div class="product-size">
                            <h4>Size</h4>
                            <label for="">S</label>
                            <label for="">M</label>
                            <label for="">L</label>
                        </div>
    
                        <form class="product-buy" action="#">
                            <button>Add To Cart</button>
                            <p>13.339.000 đ</p>
                        </form>
                    </div>
                    <img src="images/Vector.jpg" alt="">
    
                </div>
            </div>


            <div class="outstanding">
                <div class="frame">
                    <img src="images/5 50.png" alt="">
                    <div class="content">
                        <h3>
                            Luxury-Shop’s Best
                            Collections
                        </h3>
                        <h4>Comfort</h4>
                        <p>Lorem ipsum dolor sit amet consectetur. 
                            Sollicitudin morbi molestie at amet praesent tortor. 
                            Maecenas non tempus at consequat ac est varius. Tortor aliquet nulla consequat risus.consequatconsequat
                        </p>
                    </div>
                </div>

                <div class="frame">
                    <div class="content">
                        <h3>100% Gold</h3>
                        <p>Lorem ipsum dolor sit amet consectetur. 
                            Sollicitudin morbi molestie at amet praesent tortor. 
                            Maecenas non tempus at consequat ac est varius. Tortor aliquet nulla consequat risus.consequatconsequat
                        </p>
                    </div>
                    <img src="images/6 1.png" alt="">
                </div>

                <div class="frame">
                    <img src="images/7 1.png" alt="">
                    <div class="content">
                        <h3>Trendy</h3>
                        <p>Lorem ipsum dolor sit amet consectetur. 
                            Sollicitudin morbi molestie at amet praesent tortor. 
                            Maecenas non tempus at consequat ac est varius. Tortor aliquet nulla consequat risus.consequatconsequat
                        </p>
                    </div>
                </div>
            </div>

            <div class="list_company">
                <p><span>Trusted</span> by leading companies</p>
                <img src="images/BRANDS 1.png" alt="">
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
                        <img src="images/8.png" alt="">
                        <h2>For Beauty</h2>
                        <p>Lorem ipsum dolor sit amet consectetur.Sollicitudin morbi molestie at amet praesent tortor.Maecenas non tempus at consequat ac
                        </p>
                    </div>

                    <div class="info">
                        <img src="images/9.png" alt="">
                        <h2>Product Quality</h2>
                        <p>Lorem ipsum dolor sit amet consectetur.Sollicitudin morbi molestie at amet praesent tortor.Maecenas non tempus at consequat ac
                        </p>
                    </div>

                    <div class="info">
                        <img src="images/10.png" alt="">
                        <h2>For Comfort</h2>
                        <p>Lorem ipsum dolor sit amet consectetur.Sollicitudin morbi molestie at amet praesent tortor.Maecenas non tempus at consequat ac
                         </p>
                    </div>
                </div>

            </div>


        </div>



        <footer>

            <div class="footer_img">

                <img src="images/085d08df32a3613b9ae7aa77b0671cf5.jpg" alt="">

                <img src="images/51928e06b34442f9b768f9ebef5a0b1d.jpg" alt="">

                <img src="images/6d070b8f2391f0aaa0e3f16d7819182e.jpg" alt="">

                <img src="images/d2e6c5dbb612c6f3ff5db767efe1cc37.jpg" alt="">
            </div>

            <div class="footer_content">
                <div class="footer_contact">
                    <h2>LUXURY</h2>
                    <p>+0801234567</p>
                    <p>Địa chỉ: Quận___Thành Phố HCM </p>
                    <ul>
                        <li>
                            <i class="fab fa-facebook-square"></i>
                        </li>
                        <li>
                            <i class="fab fa-instagram"></i>
                        </li>
                        <li>
                            <i class="fab fa-twitter-square"></i>
                        </li>
                        <li>
                            <i class="fab fa-linkedin"></i>
                        </li>
                    </ul>
                </div>

                <div class="footer_about">
                    <h3>About</h3>
                    <ul>
                        <li>Our company</li>
                        <li>Our products</li>
                        <li>Lastest Blogs</li>
                        <li>Why us</li>
                    </ul>
                </div>

                <div class="footer_support">
                    <h3>Support</h3>
                    <ul>
                        <li>Term & conditions</li>
                        <li>Privacy police</li>
                        <li>Call support</li>
                        <li>FAQ</li>
                    </ul>
                </div>

                <div class="footer_subscribe">
                    <h3>Subscribe Newsletter</h3>
                    <p>New Customer Get OFF 50%...</p>
                    <form class="footer_form" action="#">
                        <input type="email" placeholder="Enter your email">
                        <button>Send</button>
                        </form>  
                </div>
                <!-- Footer responsive -->
                <div class="footer_mobile">
                    <ul class="footer_list">
                        <li>Help</li>
                        <li>Hotline</li>
                        <li>Instagram</li>
                        <li>Shoppe</li>
                        <li>Lazada</li>
                        <li>Facebook</li>
                        <li>License</li>
                    </ul>
                </div>
            </div>

        </footer>
    </div>
        
    </body>
    
    <script src="js/main.js"></script>
</html>
