/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.utils;

/**
 *
 * @author Chau Nhat Truong
 */
public class MyApplicationConstants {

    public class CreateAccountServlet {

        public static final String ERROR_PAGE = "signUpPage";
        public static final String LOGIN_PAGE = "loginPage";
        public static final String SEND_EMAIL = "verifyCodePage";
    }

    public class DeleteAccountServlet {

        public static final String ERROR_PAGE = "errorPage";
    }

    public class DispatchController {

        public static final String LOGIN_PAGE = "loginPage";
        public static final String LOGIN_CONTROLLER = "loginController";
        public static final String LOGOUT_CONTROLLER = "logoutController";
        public static final String DELETE_ACCOUNT_CONTROLLER = "deleteAccountController";
        public static final String UPDATE_ACCOUNT_CONTROLLER = "updateAccountController";
        public static final String SIGN_UP_CONTROLLER = "signUpController";
    }

    public class FirstTimeRequestServlet {

        public static final String LOGIN_PAGE = "loginPage";
        public static final String MAIN_PAGE = "mainPage";
    }

    public class LoginServlet {

        public static final String LOGIN_PAGE = "loginPage";
        public static final String FORGOT_PASSWORD_PAGE = "ForgotPasswordPage";
        public static final String MAIN_PAGE = "mainPage";
    }

    public class ForgotPasswordServlet {

        public static final String FORGOTPASSWORD_CONTROLLER = "forgotPasswordController";
        public static final String FORGOTPASSWORD_PAGE = "forgotPasswordPage";
    }

    public class LogoutServlet {

        public static final String LOGIN_PAGE = "loginPage";
        public static final String MAIN_PAGE = "mainPage";
    }

    public class UpdateAccountServlet {

        public static final String ERROR_PAGE = "errorPage";
    }

    public class CustomerVerifyServlet {

        public static final String CUSTOMERVERIFY_PAGE = "customerVerifyPage";
        public static final String VERIFYCODE_PAGE = "verifyCodePage";
    }

    public class VerifyCodeServlet {

        public static final String VERIFYCODE_PAGE = "verifyCodePage";
        public static final String RESETPASSWORD_PAGE = "resetPasswordPage";
    }

    public class ResetPasswordServlet {

        public static final String RESETPASSWORD_PAGE = "resetPasswordPage";
        public static final String LOGIN_PAGE = "loginPage";
    }
    
    public class ShowMainPageServlet {
        public static final String MAIN_PAGE = "mainPage";
    }
    
    public class SearchServlet{
        public static final String SEARCH_TEXT_PAGE = "searchTextPage";
        public static final String SEARCH_FILTER_PAGE = "searchFilterPage";
        public static final String SEARCH_FILTER_SERVLET="searchByFilterController";
    }
    
    public class CartFeature{
        public static final String CART_SERVLET = "addToCartController";
        public static final String CART_PAGE = "addToCartPage";
    }
    
    
    public class ProductFeature{
        public static final String PRODUCT_SERVLET = "viewProductController";
        public static final String PRODUCT_PAGE = "viewProductPage";
    }
    
    
    public class AccountFeature{
        public static final String ACCOUNT_SERVLET = "updateAccountController";
        public static final String ACCOUNT_UPDATE_PAGE = "updateInforPage";
        public static final String ACCOUNT_INFOR_PAGE = "userInforPage";
    }

}
