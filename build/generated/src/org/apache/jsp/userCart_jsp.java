package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/paginationjs/2.1.4/pagination.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Payment-1</title>\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function formatNumberWithCommas(number) {\n");
      out.write("                var parts = number.toString().split(\".\");\n");
      out.write("                parts[0] = parts[0].replace(/\\B(?=(\\d{3})+(?!\\d))/g, \",\");\n");
      out.write("//                if (parts.length > 1) {\n");
      out.write("//                    parts[1] = parts[1].substring(0, 2); // limit decimal places to 2\n");
      out.write("//                }\n");
      out.write("                return parts.join(\".\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("//            function calculateTotalPrice() {\n");
      out.write("//                var total = 0;\n");
      out.write("//                $('.your-cart-body-left-product-detail-right-sum').each(function () {\n");
      out.write("//                    var price = parseFloat($(this).find('span').text().replace(',', ''));\n");
      out.write("//                    total += price;\n");
      out.write("//                });\n");
      out.write("//                return total;\n");
      out.write("//            }\n");
      out.write("\n");
      out.write("            function updateQuantity(itemId, operation) {\n");
      out.write("//                var quantityElement = document.getElementById('quantity' + itemId).innerHTML;\n");
      out.write("                var quantityElement = document.getElementById('quantity' + itemId);\n");
      out.write("                var quantity = parseInt(quantityElement.innerHTML);\n");
      out.write("                var priceElement = document.getElementById(\"price-\" + itemId);\n");
      out.write("                var price = priceElement.innerHTML.replace(/[^0-9\\.]+/g, \"\");\n");
      out.write("\n");
      out.write("\n");
      out.write("                if (operation === 'minus') {\n");
      out.write("                    quantity--;\n");
      out.write("                    if (quantity < 1) {\n");
      out.write("                        quantity = 1;\n");
      out.write("                        price = price / (quantity + 1) * 2;\n");
      out.write("                    } else {\n");
      out.write("                        price = price / (quantity + 1) * quantity;\n");
      out.write("                    }\n");
      out.write("                } else {\n");
      out.write("                    quantity++;\n");
      out.write("                    price = price / (quantity - 1) * quantity;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                document.getElementById('quantity' + itemId).innerHTML = quantity;\n");
      out.write("//                priceElement.innerHTML = price.toLocaleString();\n");
      out.write("                priceElement.innerHTML = formatNumberWithCommas(price.toFixed());\n");
      out.write("                // update the total price\n");
      out.write("                var totalPrice = calculateTotalPrice();\n");
      out.write("//                alert(totalPrice);\n");
      out.write("                $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');\n");
      out.write("                var xhr = new XMLHttpRequest();\n");
      out.write("                xhr.open('POST', 'UpdateCartServlet', true);\n");
      out.write("                xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');\n");
      out.write("                xhr.onreadystatechange = function () {\n");
      out.write("                    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {\n");
      out.write("                        var response = JSON.parse(xhr.responseText);\n");
      out.write("                        var quantityElement = document.querySelector(\"#quantity\" + itemId);\n");
      out.write("                        if (quantityElement) {\n");
      out.write("                            quantityElement.textContent = response.quantity;\n");
      out.write("                        }\n");
      out.write("//                        var totalPriceAllProduct = document.getElementById(\"total-price\");\n");
      out.write("//                        totalPriceAllProduct.innerHTML = totalPrice.text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xhr.send('txtID=' + itemId + '&txtQuantity=' + quantity);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function removeSelectedItem(itemId, rowIndex, callback) {\n");
      out.write("\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url: \"RemoveItemFromCartServlet\",\n");
      out.write("                    data: {txtId: itemId},\n");
      out.write("                    success: function (response) {\n");
      out.write("                        if (response.success) {\n");
      out.write("                            // call the callback function with the ID of the removed item\n");
      out.write("                            callback(itemId, rowIndex);\n");
      out.write("                            // update the cart UI with the updated cart data\n");
      out.write("                            var cartData = response.cart;\n");
      out.write("                            console.log(\"removeSelectedItem called with itemId = \" + itemId);\n");
      out.write("\n");
      out.write("                            $(\"#cartTable tr\").each(function () {\n");
      out.write("                                var rowItemId = $(this).find(\"input[name='txtId']\").val();\n");
      out.write("                                if (rowItemId === itemId) {\n");
      out.write("                                    $(this).remove();\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("//                            $(\"#cartTable tr:gt(0)\").each(function (index) {\n");
      out.write("//                                $(this).find(\"#count-\" + itemId).text(index + 1);\n");
      out.write("//                            });\n");
      out.write("                        } else {\n");
      out.write("                            // handle error response from servlet\n");
      out.write("                            console.log(response.message);\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                        // handle network error\n");
      out.write("                        console.log(errorThrown);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/reset.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/payment-1.css\" />\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function calculateTotalPrice() {\n");
      out.write("                var total = 0;\n");
      out.write("                $('.your-cart-body-left-product-detail-right-sum').each(function () {\n");
      out.write("                    var price = parseFloat($(this).find('span').text().replace(/,/g, ''));\n");
      out.write("//                    var price = parseFloat(priceString);\n");
      out.write("//                    alert($(this).find('span').text().replace(/,/g, ''));\n");
      out.write("                    total += price;\n");
      out.write("//                    alert(total);\n");
      out.write("                });\n");
      out.write("                return total;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("//            function calculateTotalPrice() {\n");
      out.write("//                var total = 0;\n");
      out.write("//                $('.your-cart-body-left-product-detail-right-sum').each(function () {\n");
      out.write("//                    var priceString = $(this).find('span').text().replace(',', '');\n");
      out.write("//                    var price = parseFloat(priceString.replace('₫', '').trim());\n");
      out.write("//                    total += price;\n");
      out.write("//                });\n");
      out.write("//                var formattedTotal = total.toLocaleString('en-US', {minimumFractionDigits: 0, maximumFractionDigits: 0});\n");
      out.write("//                $('#total-price').text(formattedTotal + '₫');\n");
      out.write("//                return total;\n");
      out.write("//            }\n");
      out.write("\n");
      out.write("            function removeProduct(itemId) {\n");
      out.write("                if (confirm(\"Are you sure you want to remove this item from your cart?\")) {\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        url: \"RemoveItemFromCartServlet\",\n");
      out.write("                        data: {txtId: itemId},\n");
      out.write("                        success: function (response) {\n");
      out.write("                            if (response.success) {\n");
      out.write("                                // update the cart UI with the updated cart data\n");
      out.write("                                var cartData = response.cart;\n");
      out.write("                                console.log(\"removeProduct called with itemId = \" + itemId);\n");
      out.write("\n");
      out.write("                                // remove the div tag with the corresponding item id\n");
      out.write("                                $(\"#product-\" + itemId).remove();\n");
      out.write("                                // update the cart size in the UI\n");
      out.write("                                updateCartSize();\n");
      out.write("\n");
      out.write("                                // update the total price\n");
      out.write("                                var totalPrice = calculateTotalPrice();\n");
      out.write("                                $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');\n");
      out.write("                            } else {\n");
      out.write("                                // handle error response from servlet\n");
      out.write("                                console.log(response.message);\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                            // handle network error\n");
      out.write("                            console.log(errorThrown);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function updateCartSize() {\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"GET\",\n");
      out.write("                    url: \"GetCartSizeServlet\",\n");
      out.write("                    success: function (response) {\n");
      out.write("                        $(\"#cart-size\").text(response.cartSize);\n");
      out.write("                    },\n");
      out.write("                    error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                        // handle error\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var totalPrice = calculateTotalPrice();\n");
      out.write("                $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <header class=\"header\">\n");
      out.write("                <div class=\"nav-top\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"shipping\">\n");
      out.write("                            <p class=\"shipping-text\">Free shipping with recept from 200$</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"images/Nav-line.png\" alt=\"\" class=\"nav-line\" />\n");
      out.write("                <!-- NAV DESKTOP - TABLET -->\n");
      out.write("                <div class=\"nav-bot\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <a href=\"mainPage\" class=\"menu-logo\"> LOGO </a>\n");
      out.write("                        <ul class=\"menu\">\n");
      out.write("                            <li class=\"menu-item\">\n");
      out.write("                                <a href=\"#!\" class=\"menu-link menu-link-category\">Categories</a>\n");
      out.write("                                <ul class=\"menu-link-category-tab\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <li class=\"menu-link-category-tab-title\">\n");
      out.write("                                            <a href=\"SearchByFilterServlet?txtProductCateID=1\" class=\"menu-link menu-link-bracelet\"\n");
      out.write("                                               >BRACELET</a\n");
      out.write("                                            >\n");
      out.write("                                            <ul class=\"menu-link-category-tab-list\">\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-bracelet\">\n");
      out.write("                                                        1\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-bracelet\">\n");
      out.write("                                                        2\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-bracelet\">\n");
      out.write("                                                        3\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"menu-link-category-tab-title\">\n");
      out.write("                                            <a href=\"#!\" class=\"menu-link menu-link-ring\"> RING </a>\n");
      out.write("                                            <ul class=\"menu-link-category-tab-list\">\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-ring\"> 1 </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-ring\"> 2 </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-ring\"> 3 </a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"menu-link-category-tab-title\">\n");
      out.write("                                            <a href=\"#!\" class=\"menu-link menu-link-necklace\">\n");
      out.write("                                                NECKLACE\n");
      out.write("                                            </a>\n");
      out.write("                                            <ul class=\"menu-link-category-tab-list\">\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-necklace\">\n");
      out.write("                                                        1\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-necklace\">\n");
      out.write("                                                        2\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-necklace\">\n");
      out.write("                                                        3\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"menu-link-category-tab-title\">\n");
      out.write("                                            <a href=\"#!\" class=\"menu-link menu-link-earring\">\n");
      out.write("                                                EARRINGS\n");
      out.write("                                            </a>\n");
      out.write("                                            <ul class=\"menu-link-category-tab-list\">\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-earring\">\n");
      out.write("                                                        1\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-earring\">\n");
      out.write("                                                        2\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"menu-link-category-tab-list-item\">\n");
      out.write("                                                    <a href=\"#!\" class=\"menu-link menu-link-earring\">\n");
      out.write("                                                        3\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                    </div>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"menu-item\">\n");
      out.write("                                <a href=\"#!\" class=\"menu-link\">About</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"menu-item\">\n");
      out.write("                                <a href=\"#!\" class=\"menu-link\">Shop</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"menu-item\">\n");
      out.write("                                <a href=\"#!\" class=\"menu-link\">Contact</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"menu-icon\">\n");
      out.write("                            <!-- SEARCH -->\n");
      out.write("                            <div class=\"menu-icon-tab\">\n");
      out.write("                                <button class=\"menu-icon-tab-search\" href=\"#!\">\n");
      out.write("                                    <img\n");
      out.write("                                        class=\"menu-icon-img\"\n");
      out.write("                                        srcset=\"images/search-normal.png 2x\"\n");
      out.write("                                        alt=\"\"\n");
      out.write("                                        />\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"menu-icon-tab-search-content\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"menu-icon-tab-search-content-title\">\n");
      out.write("                                            <p class=\"menu-icon-tab-search-content-title-desc\">\n");
      out.write("                                                SEARCH\n");
      out.write("                                            </p>\n");
      out.write("                                            <img srcset=\"images/Footer-line.png 2x\" alt=\"\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"menu-icon-tab-search-form\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"text\"\n");
      out.write("                                                class=\"menu-icon-tab-search-input\"\n");
      out.write("                                                placeholder=\"Search Product...\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- PROFILE -->\n");
      out.write("                            <div class=\"menu-icon-tab\">\n");
      out.write("                                <button class=\"menu-icon-tab-profile\" href=\"#!\">\n");
      out.write("                                    <img\n");
      out.write("                                        class=\"menu-icon-img\"\n");
      out.write("                                        srcset=\"images/profile-circle.png 2x\"\n");
      out.write("                                        alt=\"\"\n");
      out.write("                                        />\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"menu-icon-tab-profile-content\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"menu-icon-tab-profile-content-title\">\n");
      out.write("                                            <p class=\"menu-icon-tab-profile-content-title-desc\">\n");
      out.write("                                                ACCOUNT INFORMATION\n");
      out.write("                                            </p>\n");
      out.write("                                            <img srcset=\"images/Footer-line.png 2x\" alt=\"\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"menu-icon-tab-profile-form\">\n");
      out.write("                                            <p class=\"menu-icon-tab-profile-form-name\">NAME</p>\n");
      out.write("                                            <a href=\"#!\" class=\"menu-icon-tab-profile-form-link\"\n");
      out.write("                                               >My account</a\n");
      out.write("                                            >\n");
      out.write("                                            <a href=\"#!\" class=\"menu-icon-tab-profile-form-link\"\n");
      out.write("                                               >Address List</a\n");
      out.write("                                            >\n");
      out.write("                                            <a href=\"#!\" class=\"menu-icon-tab-profile-form-link\"\n");
      out.write("                                               >Log out</a\n");
      out.write("                                            >\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- CART -->\n");
      out.write("                            <div class=\"menu-icon-tab\">\n");
      out.write("                                <button class=\"menu-icon-tab-cart\" href=\"#!\">\n");
      out.write("                                    <img\n");
      out.write("                                        class=\"menu-icon-img\"\n");
      out.write("                                        srcset=\"images/shopping-cart.png 2x\"\n");
      out.write("                                        alt=\"\"\n");
      out.write("                                        />\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"menu-icon-tab-cart-content\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"menu-icon-tab-cart-content-title\">\n");
      out.write("                                            <div class=\"menu-icon-tab-cart-content-title-container\">\n");
      out.write("                                                <p class=\"menu-icon-tab-cart-content-title-desc\">\n");
      out.write("                                                    Cart\n");
      out.write("                                                </p>\n");
      out.write("                                                <img\n");
      out.write("                                                    srcset=\"images/Footer-line.png 2x\"\n");
      out.write("                                                    alt=\"\"\n");
      out.write("                                                    class=\"menu-icon-tab-cart-space\"\n");
      out.write("                                                    />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"menu-icon-tab-cart-content-show\">\n");
      out.write("                                            <div class=\"menu-icon-tab-cart-content-show-icon\">\n");
      out.write("                                                <img\n");
      out.write("                                                    src=\"images/shopping-icon-tab.png\"\n");
      out.write("                                                    alt=\"\"\n");
      out.write("                                                    />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"menu-icon-tab-cart-content-show-txt\">\n");
      out.write("                                                <p class=\"menu-icon-tab-cart-content-show-txt-desc\">\n");
      out.write("                                                    There are currently no products\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <img srcset=\"images/Footer-line.png 2x\" alt=\"\" />\n");
      out.write("                                        <div class=\"menu-icon-tab-cart-content-function\">\n");
      out.write("                                            <div class=\"menu-icon-tab-cart-content-function-total\">\n");
      out.write("                                                <p\n");
      out.write("                                                    class=\"menu-icon-tab-cart-content-function-total-txt\"\n");
      out.write("                                                    >\n");
      out.write("                                                    TOTAL AMOUNT\n");
      out.write("                                                </p>\n");
      out.write("                                                <p\n");
      out.write("                                                    class=\"menu-icon-tab-cart-content-function-total-price\"\n");
      out.write("                                                    >\n");
      out.write("                                                    0₫\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"menu-icon-tab-cart-content-function-method\">\n");
      out.write("                                                <button\n");
      out.write("                                                    class=\"menu-icon-tab-cart-content-function-method-btn\"\n");
      out.write("                                                    >\n");
      out.write("                                                    VIEW CART\n");
      out.write("                                                </button>\n");
      out.write("                                                <button\n");
      out.write("                                                    class=\"menu-icon-tab-cart-content-function-method-btn\"\n");
      out.write("                                                    >\n");
      out.write("                                                    PAY\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- NAV MOBILE -->\n");
      out.write("                <div class=\"nav-bot-responsive\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"menu-responsive-icon\">\n");
      out.write("                            <!-- <img\n");
      out.write("                                     class=\"menu-responsive-icon-img\"\n");
      out.write("                                     srcset=\"./../images/shopping-cart.png 2x\"\n");
      out.write("                                     alt=\"\"\n");
      out.write("                                   /> -->\n");
      out.write("                            <div class=\"menu-responsive-icon-tab\">\n");
      out.write("                                <button class=\"menu-responsive-icon-tab-cart\" href=\"#!\">\n");
      out.write("                                    <img\n");
      out.write("                                        class=\"menu-responsive-icon-img menu-responsive-icon-img-cart\"\n");
      out.write("                                        srcset=\"images/shopping-cart.png 2x\"\n");
      out.write("                                        alt=\"\"\n");
      out.write("                                        />\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"menu-responsive-icon-tab-cart-content\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"menu-responsive-icon-tab-cart-content-title\">\n");
      out.write("                                            <div\n");
      out.write("                                                class=\"menu-responsive-icon-tab-cart-content-title-container\"\n");
      out.write("                                                >\n");
      out.write("                                                <p\n");
      out.write("                                                    class=\"menu-responsive-icon-tab-cart-content-title-desc\"\n");
      out.write("                                                    >\n");
      out.write("                                                    Cart\n");
      out.write("                                                </p>\n");
      out.write("                                                <img\n");
      out.write("                                                    srcset=\"images/Footer-line.png 2x\"\n");
      out.write("                                                    alt=\"\"\n");
      out.write("                                                    class=\"menu-responsive-icon-tab-cart-space\"\n");
      out.write("                                                    />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"menu-responsive-icon-tab-cart-content-show\">\n");
      out.write("                                            <div\n");
      out.write("                                                class=\"menu-responsive-icon-tab-cart-content-show-icon\"\n");
      out.write("                                                >\n");
      out.write("                                                <img\n");
      out.write("                                                    srcset=\"images/shopping-icon-tab.png 2x\"\n");
      out.write("                                                    alt=\"\"\n");
      out.write("                                                    />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div\n");
      out.write("                                                class=\"menu-responsive-icon-tab-cart-content-show-txt\"\n");
      out.write("                                                >\n");
      out.write("                                                <p\n");
      out.write("                                                    class=\"menu-responsive-icon-tab-cart-content-show-txt-desc\"\n");
      out.write("                                                    >\n");
      out.write("                                                    There are currently no products\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <img srcset=\"images/Footer-line.png 2x\" alt=\"\" />\n");
      out.write("                                        <div class=\"menu-responsive-icon-tab-cart-content-function\">\n");
      out.write("                                            <div\n");
      out.write("                                                class=\"menu-responsive-icon-tab-cart-content-function-total\"\n");
      out.write("                                                >\n");
      out.write("                                                <p\n");
      out.write("                                                    class=\"menu-responsive-icon-tab-cart-content-function-total-txt\"\n");
      out.write("                                                    >\n");
      out.write("                                                    TOTAL AMOUNT\n");
      out.write("                                                </p>\n");
      out.write("                                                <p\n");
      out.write("                                                    class=\"menu-responsive-icon-tab-cart-content-function-total-price\"\n");
      out.write("                                                    >\n");
      out.write("                                                    0₫\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div\n");
      out.write("                                                class=\"menu-responsive-icon-tab-cart-content-function-method\"\n");
      out.write("                                                >\n");
      out.write("                                                <button\n");
      out.write("                                                    class=\"menu-responsive-icon-tab-cart-content-function-method-btn\"\n");
      out.write("                                                    >\n");
      out.write("                                                    VIEW CART\n");
      out.write("                                                </button>\n");
      out.write("                                                <button\n");
      out.write("                                                    class=\"menu-responsive-icon-tab-cart-content-function-method-btn\"\n");
      out.write("                                                    >\n");
      out.write("                                                    PAY\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#!\" class=\"menu-responsive-logo\"> LOGO </a>\n");
      out.write("                        <div class=\"menu-responsive-icon\">\n");
      out.write("                            <img\n");
      out.write("                                class=\"menu-responsive-icon-img menu-responsive-icon-img-bar\"\n");
      out.write("                                srcset=\"images/textalign-justifycenter.png 2x\"\n");
      out.write("                                alt=\"\"\n");
      out.write("                                />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--  -->\n");
      out.write("                <img src=\"images/Nav-line.png\" alt=\"\" class=\"nav-line-bot\" />\n");
      out.write("            </header>\n");
      out.write("            <!-- YOUR CART TITLE-->\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <img src=\"images/Footer-line.png\" alt=\"\" />\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <div class=\"footer-menu-connect\">\n");
      out.write("                            <h3 class=\"footer-menu-connect-title\">CONNECT WITH US</h3>\n");
      out.write("                            <div class=\"footer-menu-connect-desc\">\n");
      out.write("                                <p class=\"footer-menu-connect-desc-txt\">\n");
      out.write("                                    PTDK is an accessory brand founded by people who are\n");
      out.write("                                    passionate about jewelry, love the crafts created by pure\n");
      out.write("                                    Vietnamese hands, and want to bring the works to the world.\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"footer-menu-connect-desc-txt\">\n");
      out.write("                                    PTDK Company (Phat-Truong-Dung-Duy-Khoa)\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"footer-menu-connect-desc-txt\">\n");
      out.write("                                    Email: cubiiwork@gmail.com\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"footer-menu-connect-desc-txt\">Zip code: 70000</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"footer-menu-connect-icon\">\n");
      out.write("                                <span class=\"footer-menu-connect-icon-facebook\"\n");
      out.write("                                      ><i class=\"fa-brands fa-facebook-f\"></i\n");
      out.write("                                    ></span>\n");
      out.write("                                <span class=\"footer-menu-connect-icon-instagram\"\n");
      out.write("                                      ><i class=\"fa-brands fa-instagram\"></i\n");
      out.write("                                    ></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"footer-menu-cus-service\">\n");
      out.write("                            <h3 class=\"footer-menu-cus-service-title\">CUSTOMER SERVICE</h3>\n");
      out.write("                            <div class=\"footer-menu-cus-service-desc\">\n");
      out.write("                                <p class=\"footer-menu-cus-service-desc-txt\">TERMS OF SERVICE</p>\n");
      out.write("                                <p class=\"footer-menu-cus-service-desc-txt\">REFUND POLICY</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"footer-menu-about\">\n");
      out.write("                            <h3 class=\"footer-menu-about-title\">ABOUT US</h3>\n");
      out.write("                            <div class=\"footer-menu-about-desc\">\n");
      out.write("                                <p class=\"footer-menu-about-desc-txt\">STORY OF PDTK</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"footer-menu-care\">\n");
      out.write("                            <h3 class=\"footer-menu-care-title\">FOR CUSTOMERS</h3>\n");
      out.write("                            <div class=\"footer-menu-care-desc\">\n");
      out.write("                                <p class=\"footer-menu-care-desc-txt\">\n");
      out.write("                                    INSTRUCTIONS FOR STORAGE OF US PRODUCTS\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"footer-menu-care-desc-txt\">FASHION KNOWLEDGE</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-copyright\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <p class=\"footer-copyright-txt\">© 2023 PTDK All Rights Reserved.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        out.write("\n");
        out.write("                <div class=\"your-cart\">\n");
        out.write("                    <div class=\"container\">\n");
        out.write("                        <h1 class=\"your-cart-title\">Your Cart</h1>\n");
        out.write("                        <p class=\"your-cart-desc\">\n");
        out.write("                            There is\n");
        out.write("                            ");
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <span id=\"cart-size\" class=\"your-cart-desc-number\" style=\"font-weight: 700\"\n");
        out.write("                                  >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartSize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span\n");
        out.write("                            >\n");
        out.write("                            <span style=\"font-weight: 700\">product</span> in your cart\n");
        out.write("                        </p>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                <div class=\"your-cart-body\">\n");
        out.write("                    <div class=\"container\">\n");
        out.write("                        <!-- LEFT________________________________ -->\n");
        out.write("                        <div class=\"your-cart-body-left-all\">\n");
        out.write("                            <div class=\"container\">\n");
        out.write("                                <div class=\"your-cart-body-left\">\n");
        out.write("                                    <div class=\"container\">\n");
        out.write("                                        <div class=\"your-cart-body-left-product\">\n");
        out.write("                                            ");
        if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"your-cart-body-left-bot\">\n");
        out.write("                                    <div class=\"container\">\n");
        out.write("                                        <div class=\"your-cart-body-left-bot-note\">\n");
        out.write("                                            <h1 class=\"your-cart-body-left-bot-note-title\">\n");
        out.write("                                                Order Notes\n");
        out.write("                                            </h1>\n");
        out.write("                                            <textarea\n");
        out.write("                                                name=\"note\"\n");
        out.write("                                                id=\"note\"\n");
        out.write("                                                rows=\"4\"\n");
        out.write("                                                placeholder=\"Notes\"\n");
        out.write("                                                class=\"your-cart-body-left-bot-note-area\"\n");
        out.write("                                                >\n");
        out.write("                                            </textarea>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"your-cart-body-left-bot-policy\">\n");
        out.write("                                            <div class=\"container\">\n");
        out.write("                                                <h1 class=\"your-cart-body-left-bot-policy-title\">\n");
        out.write("                                                    Purchase Policy\n");
        out.write("                                                </h1>\n");
        out.write("                                                <ul class=\"your-cart-body-left-bot-policy-detail\">\n");
        out.write("                                                    <li class=\"your-cart-body-left-bot-policy-item\">\n");
        out.write("                                                        <span class=\"your-cart-body-left-bot-policy-item-icon\"\n");
        out.write("                                                              ><i class=\"fa-solid fa-arrow-right\"></i\n");
        out.write("                                                            ></span>\n");
        out.write("                                                        Products are not exchangeable\n");
        out.write("                                                    </li>\n");
        out.write("                                                    <li class=\"your-cart-body-left-bot-policy-item\">\n");
        out.write("                                                        <span class=\"your-cart-body-left-bot-policy-item-icon\"\n");
        out.write("                                                              ><i class=\"fa-solid fa-arrow-right\"></i\n");
        out.write("                                                            ></span>\n");
        out.write("                                                        Each invoice can be exchanged only once, no payment\n");
        out.write("                                                        support.\n");
        out.write("                                                    </li>\n");
        out.write("                                                    <li class=\"your-cart-body-left-bot-policy-item\">\n");
        out.write("                                                        <span class=\"your-cart-body-left-bot-policy-item-icon\"\n");
        out.write("                                                              ><i class=\"fa-solid fa-arrow-right\"></i\n");
        out.write("                                                            ></span>\n");
        out.write("                                                        Only products of equal or higher value are accepted.\n");
        out.write("                                                    </li>\n");
        out.write("                                                    <li class=\"your-cart-body-left-bot-policy-item\">\n");
        out.write("                                                        <span class=\"your-cart-body-left-bot-policy-item-icon\"\n");
        out.write("                                                              ><i class=\"fa-solid fa-arrow-right\"></i\n");
        out.write("                                                            ></span>\n");
        out.write("                                                        The product has all the tags and is unused.\n");
        out.write("                                                    </li>\n");
        out.write("                                                </ul>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <!-- LEFT________________________________ -->\n");
        out.write("                        <!-- RIGHT_______________________________ -->\n");
        out.write("                        <div class=\"your-cart-body-right\">\n");
        out.write("                            <div class=\"container\">\n");
        out.write("                                <div class=\"your-cart-body-right-all\">\n");
        out.write("                                    <div class=\"container\">\n");
        out.write("                                        <div class=\"your-cart-body-right-order\">\n");
        out.write("                                            <div class=\"container\">\n");
        out.write("                                                <div class=\"your-cart-body-right-order-border\">\n");
        out.write("                                                    <h1 class=\"your-cart-body-right-order-title\">\n");
        out.write("                                                        Order Information\n");
        out.write("                                                    </h1>\n");
        out.write("                                                    <div class=\"your-cart-body-right-order-total\">\n");
        out.write("                                                        <div class=\"container\">\n");
        out.write("                                                            <h2 class=\"your-cart-body-right-order-total-title\">\n");
        out.write("                                                                Total:\n");
        out.write("                                                            </h2>\n");
        out.write("                                                            <h1 id=\"total-price\" class=\"your-cart-body-right-order-total-price\">\n");
        out.write("                                                                0₫\n");
        out.write("                                                            </h1>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <p class=\"your-cart-body-right-order-desc\">\n");
        out.write("                                                        Shipping fee will be calculated at the checkout page.\n");
        out.write("                                                        You can also enter the discount code at the checkout\n");
        out.write("                                                        page.\n");
        out.write("                                                    </p>\n");
        out.write("                                                    <a href=\"shippingPage\">\n");
        out.write("                                                        <button class=\"your-cart-body-right-order-btn\">\n");
        out.write("                                                            PAY\n");
        out.write("                                                        </button>\n");
        out.write("                                                    </a>\n");
        out.write("                                                    <a href=\"SearchByFilterServlet?txtProductCateID=1\" class=\"your-cart-body-right-order-continue\">\n");
        out.write("                                                        Continue shopping\n");
        out.write("                                                    </a>\n");
        out.write("                                                </div>\n");
        out.write("                                                <!--  -->\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <!-- RIGHT_______________________________ -->\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("                ");
        out.write("\n");
        out.write("                ");
        out.write("\n");
        out.write("                ");
        out.write("  \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_0.setVar("cart");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_1.setVar("items");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_2.setVar("itemDetail");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.itemDetail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_3.setVar("cartSize");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.items.size()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.CART.items.size()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_4.setVar("cartSize");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_5.setVar("cartList");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_6.setVar("cartListDetail");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.itemDetail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("counter");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setVar("detail");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartListDetail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key eq detail.key}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                                        <div class=\"container\" id=\"product-");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                            <div class=\"your-cart-body-left-product-detail-left\">\n");
        out.write("                                                                <img\n");
        out.write("                                                                    srcset=\"images/product-demo.png 2x\"\n");
        out.write("                                                                    alt=\"\"\n");
        out.write("                                                                    class=\"your-cart-body-left-product-img\"\n");
        out.write("                                                                    />\n");
        out.write("                                                                <div class=\"container\">\n");
        out.write("                                                                    <h1\n");
        out.write("                                                                        class=\"your-cart-body-left-product-detail-left-name\"\n");
        out.write("                                                                        >\n");
        out.write("                                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.value.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                    </h1>\n");
        out.write("                                                                    <p\n");
        out.write("                                                                        class=\"your-cart-body-left-product-detail-left-price\"\n");
        out.write("                                                                        >\n");
        out.write("\n");
        out.write("                                                                        ");
        if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("₫\n");
        out.write("                                                                    </p>\n");
        out.write("                                                                    <p\n");
        out.write("                                                                        class=\"your-cart-body-left-product-detail-left-size\"\n");
        out.write("                                                                        >\n");
        out.write("                                                                        Size:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.value.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                    </p>\n");
        out.write("                                                                    <div\n");
        out.write("                                                                        class=\"your-cart-body-left-product-detail-left-count\"\n");
        out.write("                                                                        >\n");
        out.write("                                                                        <button\n");
        out.write("                                                                            class=\"your-cart-body-left-product-detail-left-minus\"\n");
        out.write("                                                                            onclick=\"updateQuantity('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("', 'minus')\" id=\"minus_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                                            >\n");
        out.write("                                                                            -\n");
        out.write("                                                                        </button>\n");
        out.write("                                                                        <span\n");
        out.write("                                                                            class=\"your-cart-body-left-product-detail-left-count-update\"\n");
        out.write("                                                                            id=\"quantity");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                                            >\n");
        out.write("                                                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                        </span>\n");
        out.write("                                                                        <button\n");
        out.write("                                                                            class=\"your-cart-body-left-product-detail-left-plus\"\n");
        out.write("                                                                            onclick=\"updateQuantity('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("', 'plus')\" id=\"plus_");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                                            >\n");
        out.write("                                                                            +\n");
        out.write("                                                                        </button>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                </div>\n");
        out.write("                                                            </div>\n");
        out.write("                                                            <div class=\"your-cart-body-left-product-detail-right\">\n");
        out.write("                                                                <div class=\"container\">\n");
        out.write("                                                                    <span\n");
        out.write("                                                                        class=\"your-cart-body-left-product-detail-right-icon \"\n");
        out.write("                                                                        onclick=\"removeProduct('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("')\"\n");
        out.write("                                                                        >\n");
        out.write("                                                                        <i class=\"fa-solid fa-xmark\"></i>\n");
        out.write("                                                                    </span>\n");
        out.write("                                                                    <p\n");
        out.write("                                                                        class=\"your-cart-body-left-product-detail-right-sum\"\n");
        out.write("                                                                        >\n");
        out.write("\n");
        out.write("                                                                        ");
        if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                                        <span id=\"price-");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>₫\n");
        out.write("                                                                    </p>\n");
        out.write("                                                                </div>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_fmt_formatNumber_0.setVar("price");
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.value.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setPattern("#,###");
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_fmt_formatNumber_1.setVar("price");
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.value.price * item.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_1.setPattern("#,###");
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }
}
