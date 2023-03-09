package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shipping_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"js/app.js\"></script>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Payment-2</title>\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600;700&display=swap\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/reset.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/payment-2.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- HEADER -->\n");
      out.write("            <header class=\"header\">\n");
      out.write("\n");
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
      out.write("                        <a href=\"#!\" class=\"menu-logo\"> LOGO </a>\n");
      out.write("                        <ul class=\"menu\">\n");
      out.write("                            <li class=\"menu-item\">\n");
      out.write("                                <a href=\"#!\" class=\"menu-link menu-link-category\">Categories</a>\n");
      out.write("                                <ul class=\"menu-link-category-tab\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <li class=\"menu-link-category-tab-title\">\n");
      out.write("                                            <a href=\"#!\" class=\"menu-link menu-link-bracelet\"\n");
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
      out.write("                                                    srcset=\"images/shopping-icon-tab.png 2x\"\n");
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
      out.write("                                     srcset=\"./../../images/shopping-cart.png 2x\"\n");
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
      out.write("            <section class=\"shipping-info\">\n");
      out.write("                ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"shipping-info-left\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"shipping-info-left-breadcrumb\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <ul class=\"shipping-info-left-breadcrumb-menu\">\n");
      out.write("                                        <li><a href=\"userCart.jsp\">Cart</a></li>\n");
      out.write("                                        <li><a href=\"shipping.jsp\">Shipping information</a></li>\n");
      out.write("                                        <li><a href=\"payment.jsp\">Payment methods</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shipping-info-left-avatar\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"shipping-info-left-avatar-icon\">\n");
      out.write("                                        <i class=\"fa-solid fa-user\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"shipping-info-left-avatar-content\">\n");
      out.write("                                        <p class=\"shipping-info-left-avatar-content-name\">\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customerInfomation.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <form action=\"shippingController\" method=\"POST\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <button class=\"shipping-info-left-btn\" type=\"submit\">\n");
      out.write("                                    Continue to payment method\n");
      out.write("                                </button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <img\n");
      out.write("                        srcset=\"images/Login-line.png 2x\"\n");
      out.write("                        alt=\"\"\n");
      out.write("                        class=\"shipping-info-space\"\n");
      out.write("                        />\n");
      out.write("                    <!-- RIGHT -->\n");
      out.write("                    <div class=\"shipping-info-right\">\n");
      out.write("                        ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_set_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_set_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            ");
      if (_jspx_meth_c_if_16(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"shipping-info-right-product-fee\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"shipping-info-right-product-fee-name\">\n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                            <p\n");
      out.write("                                                class=\"shipping-info-right-product-fee-name-provisional\"\n");
      out.write("                                                >\n");
      out.write("                                                Provisional\n");
      out.write("                                            </p>\n");
      out.write("                                            <!--                                            <p\n");
      out.write("                                                                                            class=\"shipping-info-right-product-fee-name-ship\"\n");
      out.write("                                                                                            >\n");
      out.write("                                                                                            Shipping fee\n");
      out.write("                                                                                        </p>-->\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"shipping-info-right-product-fee-price\">\n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                            <p class=\"shipping-info-right-product-fee-price-provisional\">\n");
      out.write("                                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("₫\n");
      out.write("                                            </p>\n");
      out.write("                                            <!--                                            <p class=\"shipping-info-right-product-fee-price-ship\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_set_7(_jspx_page_context))
        return;
      out.write("10\n");
      out.write("                                        </p>-->\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shipping-info-right-product-total\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"shipping-info-right-product-total-name\">\n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                            <p\n");
      out.write("                                                class=\"shipping-info-right-product-total-name-title\"\n");
      out.write("                                                >\n");
      out.write("                                                Total\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"shipping-info-right-product-total-price\">\n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                            <p class=\"shipping-info-right-product-total-price-country\">\n");
      out.write("                                                VND\n");
      out.write("                                            </p>\n");
      out.write("                                            <p class=\"shipping-info-right-product-total-price-number\">\n");
      out.write("                                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total + fee-price-ship}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("₫\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- RIGHT -->\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- FOOTER -->\n");
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
      out.write("\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("customerInfomation");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("errors");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.SIGNUPFORSHIPPING_ERROR}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                                                   \n");
        out.write("                                    <input type=\"hidden\" name=\"txtCustomerID\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customerInfomation.customerID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("\n");
        out.write("\n");
        out.write("                                    <div class=\"shipping-info-left-form-delivery\">\n");
        out.write("                                        <div class=\"container\">                                                                                                                                                  \n");
        out.write("                                            <div class=\"shipping-info-left-form-delivery-home\">\n");
        out.write("                                                <label class=\"radio-label\">\n");
        out.write("                                                    <div class=\"radio-input\">\n");
        out.write("                                                        <input\n");
        out.write("                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                            type=\"radio\"\n");
        out.write("                                                            id=\"location\"\n");
        out.write("                                                            name=\"defaultOrNewShippingInfor\"\n");
        out.write("                                                            class=\"input-radio\"\n");
        out.write("                                                            />\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <span class=\"radio-label-primary\">Thông tin giao hàng mặc định</span>\n");
        out.write("                                                </label>\n");
        out.write("                                            </div>\n");
        out.write("\n");
        out.write("                                            <div class=\"shipping-info-left-form-delivery-address\">\n");
        out.write("                                                <div class=\"container\">\n");
        out.write("                                                    <label class=\"field-label\" for=\"stored-address\">Choose your Information here...</label>\n");
        out.write("                                                    <select class=\"field-input\" id=\"stored-addresses\" name=\"stored-infoCus-by-orDetID\">\n");
        out.write("                                                        <option class=\"field-input-item\" value=\"\">Choose your Information here</option>\n");
        out.write("                                                        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    </select>\n");
        out.write("                                                </div>\n");
        out.write("                                                ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            </div>\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            <div class=\"shipping-info-left-form-delivery-store\">\n");
        out.write("                                                <label class=\"radio-label\">\n");
        out.write("                                                    <div class=\"radio-input\">\n");
        out.write("                                                        <input\n");
        out.write("                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                            type=\"radio\"\n");
        out.write("                                                            id=\"location\"\n");
        out.write("                                                            name=\"defaultOrNewShippingInfor\"\n");
        out.write("                                                            class=\"input-radio\"\n");
        out.write("                                                            />\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <span class=\"radio-label-primary\"\n");
        out.write("                                                          >Thêm thông tin giao hàng mới</span\n");
        out.write("                                                    >\n");
        out.write("                                                </label>\n");
        out.write("                                                <div class=\"shipping-info-left-form-name\">\n");
        out.write("                                                    <div class=\"container\">\n");
        out.write("                                                        <label class=\"field-label\" for=\"stored-name\"\n");
        out.write("                                                               >Enter First Name...</label\n");
        out.write("                                                        >\n");
        out.write("                                                        <input\n");
        out.write("                                                            type=\"text\"\n");
        out.write("                                                            name=\"txtFirstName\"\n");
        out.write("                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFirstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                            class=\"field-input\"\n");
        out.write("                                                            id=\"stored-name\"\n");
        out.write("                                                            placeholder=\"First Name\"\n");
        out.write("                                                            />\n");
        out.write("                                                    </div>\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"shipping-info-left-form-name\">\n");
        out.write("                                                    <div class=\"container\">\n");
        out.write("                                                        <label class=\"field-label\" for=\"stored-name\"\n");
        out.write("                                                               >Enter Last Name...</label\n");
        out.write("                                                        >                                           \n");
        out.write("                                                        <input\n");
        out.write("                                                            type=\"text\"\n");
        out.write("                                                            name=\"txtLastName\"\n");
        out.write("                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtLastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                            class=\"field-input\"\n");
        out.write("                                                            id=\"stored-name\"\n");
        out.write("                                                            placeholder=\"Last Name\"\n");
        out.write("                                                            />\n");
        out.write("                                                        <!-- Ở ĐÂY CŨNG CÓ THỂ TRUYỀN ID NAME VÀ VALUE ĐÊ TỰ ĐIỀN -->\n");
        out.write("                                                    </div>\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"shipping-info-left-form-phone\">                                                                                           \n");
        out.write("                                                    <div class=\"container\">\n");
        out.write("                                                        <label class=\"field-label\" for=\"stored-phone\"\n");
        out.write("                                                               >Enter phone number...</label\n");
        out.write("                                                        >\n");
        out.write("                                                        <input\n");
        out.write("                                                            type=\"tel\"\n");
        out.write("                                                            name=\"txtPhone\"\n");
        out.write("                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                            class=\"field-input\"\n");
        out.write("                                                            id=\"stored-phone\"\n");
        out.write("                                                            placeholder=\"Enter phone number\"\n");
        out.write("                                                            />\n");
        out.write("                                                        <!-- Ở ĐÂY CŨNG CÓ THỂ TRUYỀN ID NAME VÀ VALUE ĐÊ TỰ ĐIỀN -->\n");
        out.write("                                                    </div>\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"shipping-info-left-form-delivery-address\">\n");
        out.write("                                                    <div class=\"container\">\n");
        out.write("                                                        <label class=\"field-label\" for=\"stored-address\"\n");
        out.write("                                                               >Enter your address...</label\n");
        out.write("                                                        >\n");
        out.write("                                                        <input\n");
        out.write("                                                            name=\"txtAddress\"\n");
        out.write("                                                            type=\"text\"\n");
        out.write("                                                            class=\"field-input\"\n");
        out.write("                                                            id=\"stored-phone\"\n");
        out.write("                                                            placeholder=\"Enter Address\"\n");
        out.write("                                                            />                                                   \n");
        out.write("                                                        <!-- Ở ĐÂY CŨNG CÓ THỂ TRUYỀN ID NAME VÀ VALUE ĐÊ TỰ ĐIỀN -->\n");
        out.write("                                                    </div>\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("\n");
        out.write("                                                <div\n");
        out.write("                                                    class=\"shipping-info-left-form-delivery-address-select\"\n");
        out.write("                                                    >\n");
        out.write("                                                    <!-- CITY -->\n");
        out.write("                                                    <div class=\"shipping-info-left-form-city\">\n");
        out.write("                                                        <div class=\"container\">\n");
        out.write("                                                            <label class=\"field-label\" for=\"stored-city\"\n");
        out.write("                                                                   >Province / City</label\n");
        out.write("                                                            >\n");
        out.write("                                                            <select class=\"field-input\" id=\"stored-city\">\n");
        out.write("                                                                <option\n");
        out.write("                                                                    class=\"field-input-item\"\n");
        out.write("                                                                    data-code=\"\"\n");
        out.write("                                                                    value=\"\"\n");
        out.write("                                                                    >\n");
        out.write("                                                                    Choose Province / city\n");
        out.write("                                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={\"nội dung\"} và value ={} -->\n");
        out.write("                                                                </option>\n");
        out.write("\n");
        out.write("                                                            </select>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <!-- DISTRICT -->\n");
        out.write("                                                    <div class=\"shipping-info-left-form-district\">\n");
        out.write("                                                        <div class=\"container\">\n");
        out.write("                                                            <label class=\"field-label\" for=\"stored-district\"\n");
        out.write("                                                                   >District</label\n");
        out.write("                                                            >\n");
        out.write("                                                            <select class=\"field-input\" id=\"stored-district\">\n");
        out.write("                                                                <option\n");
        out.write("                                                                    class=\"field-input-item\"\n");
        out.write("                                                                    data-code=\"\"\n");
        out.write("                                                                    value=\"\"\n");
        out.write("                                                                    >\n");
        out.write("                                                                    Choose District\n");
        out.write("                                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={\"nội dung\"} và value ={} -->\n");
        out.write("                                                                </option>\n");
        out.write("                                                            </select>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <!-- WARD -->\n");
        out.write("                                                    <div class=\"shipping-info-left-form-ward\">\n");
        out.write("                                                        <div class=\"container\">\n");
        out.write("                                                            <label class=\"field-label\" for=\"stored-ward\"\n");
        out.write("                                                                   >Wards</label\n");
        out.write("                                                            >\n");
        out.write("                                                            <select class=\"field-input\" id=\"stored-ward\">\n");
        out.write("                                                                <option\n");
        out.write("                                                                    class=\"field-input-item\"\n");
        out.write("                                                                    data-code=\"\"\n");
        out.write("                                                                    value=\"\"\n");
        out.write("                                                                    >\n");
        out.write("                                                                    Choose Wards\n");
        out.write("                                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={\"nội dung\"} và value ={} -->\n");
        out.write("                                                                </option>\n");
        out.write("                                                            </select>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("\n");
        out.write("                                    <div class=\"shipping-info-left-form-delivery\">\n");
        out.write("                                        <div class=\"container\">                                                                                                                                                  \n");
        out.write("                                            <div class=\"shipping-info-left-form-delivery-home\">\n");
        out.write("                                                <label class=\"radio-label\">\n");
        out.write("                                                    <div class=\"radio-input\">\n");
        out.write("                                                        <input\n");
        out.write("                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                            type=\"radio\"\n");
        out.write("                                                            id=\"location\"\n");
        out.write("                                                            name=\"location\"\n");
        out.write("                                                            class=\"input-radio\"\n");
        out.write("                                                            />\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <span class=\"radio-label-primary\">Cash On Delivery (COD)</span>\n");
        out.write("                                                </label>\n");
        out.write("                                            </div>\n");
        out.write("                                            <div class=\"shipping-info-left-form-delivery-store\">\n");
        out.write("                                                <label class=\"radio-label\">\n");
        out.write("                                                    <div class=\"radio-input\">\n");
        out.write("                                                        <input\n");
        out.write("                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                            type=\"radio\"\n");
        out.write("                                                            id=\"location\"\n");
        out.write("                                                            name=\"location\"\n");
        out.write("                                                            class=\"input-radio\"\n");
        out.write("                                                            />\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <span class=\"radio-label-primary\"\n");
        out.write("                                                          >Pick up at the store</span\n");
        out.write("                                                    >\n");
        out.write("                                                </label>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                        ");
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${USER_SHIPPINGINFO}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("customer");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option class=\"field-input-item\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.ordersDetailID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\n");
          out.write("                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.cusName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.cusPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.cusAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                            </option>\n");
          out.write("                                                        ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.cusInfoLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <font color=\"red\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.cusInfoLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</font><br/>\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.defaultOrNewShippingInforLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <font color=\"red\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.defaultOrNewShippingInforLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</font><br/>\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.firstNameLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <font color=\"red\">\n");
        out.write("                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.firstNameLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                        </font><br/>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.lastNameLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <font color=\"red\">\n");
        out.write("                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.lastNameLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                        </font><br/>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.phoneLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <font color=\"red\">\n");
        out.write("                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.phoneLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                        </font><br/>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.addressLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <font color=\"red\">\n");
        out.write("                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.addressLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                        </font><br/>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.shippingIDLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <font color=\"red\">\n");
        out.write("                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.shippingIDLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                            </font><br/>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                    <p style=\"font-size: 15px; margin: 5px 0\">YOU ARE NOT ALREADY LOGGED, PLEASE LOGIN FIRST!! <a href=\"loginPage\">Login here </a></p>\n");
        out.write("                                    ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                    <div class=\"shipping-info-left-form\">\n");
        out.write("\n");
        out.write("                                        <div class=\"shipping-info-left-form-name\">\n");
        out.write("                                            <div class=\"container\">\n");
        out.write("                                                <label class=\"field-label\" for=\"stored-name\"\n");
        out.write("                                                       >Enter First Name...</label\n");
        out.write("                                                >\n");
        out.write("                                                <input\n");
        out.write("                                                    type=\"text\"\n");
        out.write("                                                    name=\"txtFirstName\"\n");
        out.write("                                                    value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFirstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                    class=\"field-input\"\n");
        out.write("                                                    id=\"stored-name\"\n");
        out.write("                                                    placeholder=\"First Name\"\n");
        out.write("                                                    />\n");
        out.write("                                            </div>\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"shipping-info-left-form-name\">\n");
        out.write("                                            <div class=\"container\">\n");
        out.write("                                                <label class=\"field-label\" for=\"stored-name\"\n");
        out.write("                                                       >Enter Last Name...</label\n");
        out.write("                                                >                                           \n");
        out.write("                                                <input\n");
        out.write("                                                    type=\"text\"\n");
        out.write("                                                    name=\"txtLastName\"\n");
        out.write("                                                    value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtLastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                    class=\"field-input\"\n");
        out.write("                                                    id=\"stored-name\"\n");
        out.write("                                                    placeholder=\"Last Name\"\n");
        out.write("                                                    />\n");
        out.write("                                                <!-- Ở ĐÂY CŨNG CÓ THỂ TRUYỀN ID NAME VÀ VALUE ĐÊ TỰ ĐIỀN -->\n");
        out.write("                                            </div>\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"shipping-info-left-form-phone\">                                                                                           \n");
        out.write("                                            <div class=\"container\">\n");
        out.write("                                                <label class=\"field-label\" for=\"stored-phone\"\n");
        out.write("                                                       >Enter phone number...</label\n");
        out.write("                                                >\n");
        out.write("                                                <input\n");
        out.write("                                                    type=\"tel\"\n");
        out.write("                                                    name=\"txtPhone\"\n");
        out.write("                                                    value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                    class=\"field-input\"\n");
        out.write("                                                    id=\"stored-phone\"\n");
        out.write("                                                    placeholder=\"Enter phone number\"\n");
        out.write("                                                    />\n");
        out.write("                                                <!-- Ở ĐÂY CŨNG CÓ THỂ TRUYỀN ID NAME VÀ VALUE ĐÊ TỰ ĐIỀN -->\n");
        out.write("                                            </div>\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"shipping-info-left-form-email\">\n");
        out.write("                                            <div class=\"container\">\n");
        out.write("                                                <label class=\"field-label\" for=\"stored-email\"\n");
        out.write("                                                       >Enter Email Address...</label\n");
        out.write("                                                >\n");
        out.write("                                                <input\n");
        out.write("                                                    type=\"tel\"\n");
        out.write("                                                    name=\"txtEmail\"\n");
        out.write("                                                    value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                    class=\"field-input\"\n");
        out.write("                                                    id=\"stored-email\"\n");
        out.write("                                                    placeholder=\"Enter email\"\n");
        out.write("                                                    />\n");
        out.write("                                                <!-- Ở ĐÂY CŨNG CÓ THỂ TRUYỀN ID NAME VÀ VALUE ĐÊ TỰ ĐIỀN -->\n");
        out.write("                                            </div>\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"shipping-info-left-form-delivery\">\n");
        out.write("                                            <div class=\"container\">                                                                                                                                                  \n");
        out.write("                                                <div class=\"shipping-info-left-form-delivery-home\">\n");
        out.write("                                                    <label class=\"radio-label\">\n");
        out.write("                                                        <div class=\"radio-input\">\n");
        out.write("                                                            <input\n");
        out.write("                                                                value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                                type=\"radio\"\n");
        out.write("                                                                id=\"location\"\n");
        out.write("                                                                name=\"location\"\n");
        out.write("                                                                class=\"input-radio\"\n");
        out.write("                                                                />\n");
        out.write("                                                        </div>\n");
        out.write("                                                        <span class=\"radio-label-primary\">Cash On Delivery (COD)</span>\n");
        out.write("                                                    </label>\n");
        out.write("                                                </div>\n");
        out.write("                                                ");
        if (_jspx_meth_c_if_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                <div class=\"shipping-info-left-form-delivery-address\">\n");
        out.write("                                                    <div class=\"container\">\n");
        out.write("                                                        <label class=\"field-label\" for=\"stored-address\"\n");
        out.write("                                                               >Enter your address...</label\n");
        out.write("                                                        >\n");
        out.write("                                                        <input\n");
        out.write("                                                            name=\"txtAddress\"\n");
        out.write("                                                            type=\"text\"\n");
        out.write("                                                            class=\"field-input\"\n");
        out.write("                                                            id=\"stored-phone\"\n");
        out.write("                                                            placeholder=\"Enter Address\"\n");
        out.write("                                                            />\n");
        out.write("                                                        <!-- Ở ĐÂY CŨNG CÓ THỂ TRUYỀN ID NAME VÀ VALUE ĐÊ TỰ ĐIỀN -->\n");
        out.write("                                                    </div>\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("                                                <div\n");
        out.write("                                                    class=\"shipping-info-left-form-delivery-address-select\"\n");
        out.write("                                                    >\n");
        out.write("                                                    <!-- CITY -->\n");
        out.write("                                                    <div class=\"shipping-info-left-form-city\">\n");
        out.write("                                                        <div class=\"container\">\n");
        out.write("                                                            <label class=\"field-label\" for=\"stored-city\"\n");
        out.write("                                                                   >Province / City</label\n");
        out.write("                                                            >\n");
        out.write("                                                            <select class=\"field-input\" id=\"stored-city\">\n");
        out.write("                                                                <option\n");
        out.write("                                                                    class=\"field-input-item\"\n");
        out.write("                                                                    data-code=\"\"\n");
        out.write("                                                                    value=\"\"\n");
        out.write("                                                                    >\n");
        out.write("                                                                    Choose Province / city\n");
        out.write("                                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={\"nội dung\"} và value ={} -->\n");
        out.write("                                                                </option>\n");
        out.write("\n");
        out.write("                                                            </select>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <!-- DISTRICT -->\n");
        out.write("                                                    <div class=\"shipping-info-left-form-district\">\n");
        out.write("                                                        <div class=\"container\">\n");
        out.write("                                                            <label class=\"field-label\" for=\"stored-district\"\n");
        out.write("                                                                   >District</label\n");
        out.write("                                                            >\n");
        out.write("                                                            <select class=\"field-input\" id=\"stored-district\">\n");
        out.write("                                                                <option\n");
        out.write("                                                                    class=\"field-input-item\"\n");
        out.write("                                                                    data-code=\"\"\n");
        out.write("                                                                    value=\"\"\n");
        out.write("                                                                    >\n");
        out.write("                                                                    Choose District\n");
        out.write("                                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={\"nội dung\"} và value ={} -->\n");
        out.write("                                                                </option>\n");
        out.write("                                                            </select>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <!-- WARD -->\n");
        out.write("                                                    <div class=\"shipping-info-left-form-ward\">\n");
        out.write("                                                        <div class=\"container\">\n");
        out.write("                                                            <label class=\"field-label\" for=\"stored-ward\"\n");
        out.write("                                                                   >Wards</label\n");
        out.write("                                                            >\n");
        out.write("                                                            <select class=\"field-input\" id=\"stored-ward\">\n");
        out.write("                                                                <option\n");
        out.write("                                                                    class=\"field-input-item\"\n");
        out.write("                                                                    data-code=\"\"\n");
        out.write("                                                                    value=\"\"\n");
        out.write("                                                                    >\n");
        out.write("                                                                    Choose Wards\n");
        out.write("                                                                    <!-- Ở ĐÂY OPTION MÌNH CÓ THỂ TRUYỀN ĐƯỢC data-properties={\"nội dung\"} và value ={} -->\n");
        out.write("                                                                </option>\n");
        out.write("                                                            </select>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"shipping-info-left-form-delivery-store\">\n");
        out.write("                                                    <label class=\"radio-label\">\n");
        out.write("                                                        <div class=\"radio-input\">\n");
        out.write("                                                            <input\n");
        out.write("                                                                type=\"radio\"\n");
        out.write("                                                                id=\"location\"\n");
        out.write("                                                                name=\"location\"\n");
        out.write("                                                                class=\"input-radio\"\n");
        out.write("                                                                />\n");
        out.write("                                                        </div>\n");
        out.write("                                                        <span class=\"radio-label-primary\"\n");
        out.write("                                                              >Pick up at the store</span\n");
        out.write("                                                        >\n");
        out.write("                                                    </label>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_set_2.setVar("shippingPage");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_2.setScope("session");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.firstNameLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <font color=\"red\">\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.firstNameLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                </font><br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.lastNameLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <font color=\"red\">\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.lastNameLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                </font><br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.phoneLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <font color=\"red\">\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.phoneLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                </font><br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.emailLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <font color=\"red\">\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.emailLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                </font><br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.emailIsExisted}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <font color=\"red\">\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.emailIsExisted}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                </font><br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.shippingIDLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <font color=\"red\">\n");
        out.write("                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.shippingIDLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                    </font><br/>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_c_if_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.addressLengthError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <font color=\"red\">\n");
        out.write("                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.addressLengthError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                        </font><br/>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("cartList");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent(null);
    _jspx_th_c_set_4.setVar("cartListDetail");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.itemDetail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_set_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent(null);
    _jspx_th_c_set_5.setVar("total");
    _jspx_th_c_set_5.setValue(new String("0"));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_if_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent(null);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ empty cartList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <font color=\"red\">\n");
        out.write("                                your cart is empty\n");
        out.write("                                </font><br/>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("item");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVarStatus("counter");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                            ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_forEach_2.setVar("detail");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartListDetail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.key eq detail.key}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"shipping-info-right-product\">\n");
        out.write("                                            <div class=\"container\">\n");
        out.write("                                                <div class=\"shipping-info-right-product-logo\">\n");
        out.write("                                                    <div class=\"container\">\n");
        out.write("                                                        <div class=\"shipping-info-right-product-logo-img\">\n");
        out.write("                                                            <img\n");
        out.write("                                                                src=\"images/product-demo.png\"\n");
        out.write("                                                                alt=\"\"\n");
        out.write("                                                                class=\"shipping-info-right-product-logo-img-pic\"\n");
        out.write("                                                                />\n");
        out.write("                                                        </div>\n");
        out.write("                                                        <span class=\"shipping-info-right-product-logo-quantity\">\n");
        out.write("                                                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                        </span>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"shipping-info-right-product-content\">\n");
        out.write("                                                    <div class=\"container\">\n");
        out.write("                                                        <div class=\"shipping-info-right-product-content-name\">\n");
        out.write("                                                            <div class=\"container\">\n");
        out.write("                                                                <p\n");
        out.write("                                                                    class=\"shipping-info-right-product-content-name-title\"\n");
        out.write("                                                                    >\n");
        out.write("                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.value.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                </p>\n");
        out.write("                                                                <p\n");
        out.write("                                                                    class=\"shipping-info-right-product-content-name-size\"\n");
        out.write("                                                                    >\n");
        out.write("                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.value.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                </p>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                        <div class=\"shipping-info-right-product-content-price\">                                                            \n");
        out.write("                                                            <div class=\"container\">\n");
        out.write("                                                                <p class=\"shipping-info-right-product-content-price-number\">\n");
        out.write("                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.value.price * item.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("₫\n");
        out.write("                                                                </p>\n");
        out.write("                                                            </div>\n");
        out.write("                                                            ");
        if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_c_set_6.setVar("total");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total + detail.value.price * item.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_set_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent(null);
    _jspx_th_c_set_7.setVar("fee-price-ship");
    _jspx_th_c_set_7.setValue(new String("10"));
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }
}
