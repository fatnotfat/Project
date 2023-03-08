<%-- 
    Document   : adminNewAccount
    Created on : Mar 4, 2023, 8:39:59 AM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Register</title>

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="style/sb-admin-2.min.css" rel="stylesheet">
        <!-- Register css -->
        <link rel="stylesheet" href="style/register.css">
    </head>

    <body class="bg-gradient-primary">

        <div class="container">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                        <div class="col-lg-7">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                                </div>
                                <form class="user" id="user">
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control form-control-user" id="name" name=""
                                                   placeholder="Name">
                                            <span class="form__message"></span>
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control form-control-user" id="phone" name=""
                                                   placeholder="Phone Number">
                                            <span class="form__message"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control form-control-user" id="email" name=""
                                               placeholder="Email Address">
                                        <span class="form__message"></span>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="password" class="form-control form-control-user" name=""
                                                   id="password" placeholder="Password">
                                            <span class="form__message"></span>
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-user" name=""
                                                   id="password_comfirmation" placeholder="Repeat Password">
                                            <span class="form__message"></span>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-6">
                                            <select name="" id="" class="selection__roll">
                                                <option value="">Admin</option>
                                                <option value="">User</option>

                                            </select>
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-primary btn-user btn-block">
                                        Register Account
                                    </button>
                                    <hr>

                                </form>
                                <hr>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>



        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>


        <script src="js/demo/register.js"></script>
        <script>
            Validator({
                form: '#user',
                errorSelector: '.form__message',
                rules: [
                    Validator.isRequired('#name', 'Vui lòng nhập tên đầy đủ của bạn'),
                    Validator.isName('#name'),
                    Validator.isRequired('#phone', 'Vui lòng nhập số điện thoại'),
                    Validator.isPhone('#phone'),
                    Validator.isMinNumberPhone('#phone', 10),
                    Validator.isRequired('#email'),
                    Validator.isEmail('#email'),
                    Validator.minLength('#password', 6),
                    Validator.isComfirmed('#password_comfirmation', function () {
                        return document.querySelector('#user #password').value;
                    }, 'Mật khẩu nhập lại không chính xác')


                ],
                onsubmit: function (data) {
                    console.log(data)
                }
            });
        </script>
    </body>

</html>




<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin New Account Page</title>
    </head>
    <body>
        <h1>Create Account</h1>
        
    </body>
</html>-->
