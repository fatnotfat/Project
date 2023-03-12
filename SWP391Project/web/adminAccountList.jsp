<%-- 
    Document   : adminAccountList
    Created on : Mar 4, 2023, 9:00:48 AM
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

        <title>PDTK Admin 2 - Danh sách Account</title>

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="style/sb-admin-2.min.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
              integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />

        <!-- lIST ACCOUNT CSS -->
        <link rel="stylesheet" href="style/listAccount.css">

        <!-- Link register css 8/3/2023  -->

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

    <body id="page-top">
        <c:set var="adminName" value="${sessionScope.USER}"/>

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="adminOrdersRevenueController">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh-wink"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">PDTK <sup>Store</sup></div>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->
                <li class="nav-item">
                    <a class="nav-link" href="adminOrdersRevenueController">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Dashboard</span></a>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">




                <!-- Heading -->
                <div class="sidebar-heading">
                    Addons
                </div>





                <!-- Nav Item - Tables -->
                <li class="nav-item active">
                    <a class="nav-link" href="adminAccountListController">
                        <i class="fas fa-fw fa-table"></i>
                        <span>List Account</span></a>
                </li>

                <!-- Nav Item - Tables -->
                <li class="nav-item active">
                    <a class="nav-link" href="adminProductListController">
                        <i class="fas fa-fw fa-table"></i>
                        <span>List Product</span></a>
                </li>

                <!-- Nav Item - Tables -->
                <li class="nav-item active">
                    <a class="nav-link" href="adminBrandListController">
                        <i class="fas fa-fw fa-table"></i>
                        <span>List Brand</span></a>
                </li>

                <!-- Nav Item - Tables -->
                <li class="nav-item active">
                    <a class="nav-link" href="adminCategoryListController">
                        <i class="fas fa-fw fa-table"></i>
                        <span>List Category</span></a>
                </li>


                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">

                <!-- Sidebar Toggler (Sidebar) -->
                <div class="text-center d-none d-md-inline">
                    <button class="rounded-circle border-0" id="sidebarToggle"></button>
                </div>

            </ul>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <form class="form-inline">
                            <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                                <i class="fa fa-bars"></i>
                            </button>
                        </form>



                        <!-- Topbar Navbar -->
                        <ul class="navbar-nav ml-auto">

                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                            <li class="nav-item dropdown no-arrow d-sm-none">
                                <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fas fa-search fa-fw"></i>
                                </a>
                                <!-- Dropdown - Messages -->
                                <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                                     aria-labelledby="searchDropdown">
                                    <form class="form-inline mr-auto w-100 navbar-search">
                                        <div class="input-group">
                                            <input type="text" class="form-control bg-light border-0 small"
                                                   placeholder="Search for..." aria-label="Search"
                                                   aria-describedby="basic-addon2">
                                            <div class="input-group-append">
                                                <button class="btn btn-primary" type="button">
                                                    <i class="fas fa-search fa-sm"></i>
                                                </button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </li>
                            <!-- Nav Item - User Information -->
                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small">${adminName.name}</span>
                                </a>
                                <!-- Dropdown - User Information -->
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                     aria-labelledby="userDropdown">
                                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Logout
                                    </a>
                                </div>
                            </li>
                        </ul>

                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <h1 class="h3 mb-2 text-gray-800">List Account</h1>
                        <p class="mb-4">Danh sách các account được tạo trên Store PDDTK <a target="_blank"
                                                                                           href="https://datatables.net">Link edit danh sách</a>.</p>
                        <button class="button__form-create-account" onclick="showCreateAccount()">Add a new Account</button>
                        <c:set var="error" value="${requestScope.EMAIL_EXISTED}"/>
                        <c:if test="${not empty error.emailIsExisted}">
                            <font color="red">
                            <h5>${error.emailIsExisted}</h5>
                            </font>
                        </c:if>
                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <h6 class="m-0 font-weight-bold text-primary">DataTables Account</h6>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <form action="adminAccountListController" method="POST">
                                        <c:set var="result" value="${requestScope.CUSTOMER_RESULT}"/>
                                        <c:if test="${not empty result}">
                                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                                <thead>
                                                    <tr>
                                                        <th>ID</th>
                                                        <th>Name</th>
                                                        <th>Email</th>
                                                        <th>Phone number</th>
                                                        <th>Address</th>
                                                        <th>Ban</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="dto" items="${result}">
                                                        <tr>
                                                            <td>${dto.customerID}</td>
                                                            <td>${dto.name}</td>
                                                            <td>${dto.email}</td>
                                                            <td>${dto.phone}</td>
                                                            <td>${dto.address} </td>
                                                            <td class="icon-ban" onclick="showBan()">
                                                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                                                                <path
                                                                    d="M367.2 412.5L99.5 144.8C77.1 176.1 64 214.5 64 256c0 106 86 192 192 192c41.5 0 79.9-13.1 111.2-35.5zm45.3-45.3C434.9 335.9 448 297.5 448 256c0-106-86-192-192-192c-41.5 0-79.9 13.1-111.2 35.5L412.5 367.2zM0 256a256 256 0 1 1 512 0A256 256 0 1 1 0 256z" />
                                                                </svg>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                        </c:if>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /.container-fluid -->

                </div>

                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; PDTK 2023</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="logoutController">Logout</a>
                    </div>
                </div>
            </div>
        </div>


        <!-- Chỗ này hiện ra khi mà click Ban (Update) -->

        <div class="form__include">
            <form action="" class="form-ban">
                <div class="close-tab" onclick="showBan()">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                    <path d="M64 32C28.7 32 0 60.7 0 96V416c0 35.3 28.7 64 64 64H448c35.3 0 64-28.7 64-64V96c0-35.3-28.7-64-64-64H64zM175 175c9.4-9.4 24.6-9.4 33.9 0l47 47 47-47c9.4-9.4 24.6-9.4 33.9 0s9.4 24.6 0 33.9l-47 47 47 47c9.4 9.4 9.4 24.6 0 33.9s-24.6 9.4-33.9 0l-47-47-47 47c-9.4 9.4-24.6 9.4-33.9 0s-9.4-24.6 0-33.9l47-47-47-47c-9.4-9.4-9.4-24.6 0-33.9z"/></svg>
                </div>
                <div class="ban__content">
                    <div class="ban-title">
                        <p>Are you sure? This account will be banned</p>
                    </div>

                    <div class="button__ban-include">
                        <button class="button__ban-yes">Yes</button>
                        <button class="button__ban-no">No</button>
                    </div>
                </div>
            </form>
        </div>

        <!-- Chỗ này hiện ra khi mà mình create Account 8/3/2023 -->

        <div class="form__create">
            <div class="container ">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->

                        <div class="row">

                            <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                            <div class="col-lg-7">
                                <div class="close-tab-register" onclick="showCreateAccount()">
                                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                                    <path d="M64 32C28.7 32 0 60.7 0 96V416c0 35.3 28.7 64 64 64H448c35.3 0 64-28.7 64-64V96c0-35.3-28.7-64-64-64H64zM175 175c9.4-9.4 24.6-9.4 33.9 0l47 47 47-47c9.4-9.4 24.6-9.4 33.9 0s9.4 24.6 0 33.9l-47 47 47 47c9.4 9.4 9.4 24.6 0 33.9s-24.6 9.4-33.9 0l-47-47-47 47c-9.4 9.4-24.6 9.4-33.9 0s-9.4-24.6 0-33.9l47-47-47-47c-9.4-9.4-9.4-24.6 0-33.9z"/></svg>
                                </div>
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                                    </div>
                                    <form action="adminNewAccountController" class="user" id="user" method="POST">
                                        <div class="form-group row">
                                            <div class="col-sm-6 mb-3 mb-sm-0">
                                                <input type="text" class="form-control form-control-user" id="name" name="txtName"
                                                       placeholder="Name">
                                                <span class="form__message"></span>
                                            </div>
                                            <div class="col-sm-6">
                                                <input type="number" class="form-control form-control-user" id="phone" name="txtPhone"
                                                       placeholder="Phone Number">
                                                <span class="form__message"></span>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <input type="email" class="form-control form-control-user" id="email" name="txtEmail"
                                                   placeholder="Email Address">
                                            <span class="form__message"></span>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-sm-6 mb-3 mb-sm-0">
                                                <input type="password" class="form-control form-control-user" name="txtPassword"
                                                       id="password" placeholder="Password">
                                                <span class="form__message"></span>
                                            </div>
                                            <div class="col-sm-6">
                                                <input type="password" class="form-control form-control-user" name="txtConfirmPassword"
                                                       id="password_comfirmation" placeholder="Repeat Password">
                                                <span class="form__message"></span>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-sm-6">
                                                <select name="cboRole" id="" class="selection__roll">
                                                    <option value="1">Admin</option>
                                                    <option value="0">User</option>
                                                </select>
                                            </div>
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-user btn-block">
                                            Register Account
                                        </button>
                                        <hr>
                                        <a href="index.html" class="btn btn-google btn-user btn-block">
                                            <i class="fab fa-google fa-fw"></i> Register with Google
                                        </a>

                                    </form>
                                    <hr>
                                    <div class="text-center">
                                        <a class="small" href="forgot-password.html">Forgot Password?</a>
                                    </div>
                                    <div class="text-center">
                                        <a class="small" href="login.html">Already have an account? Login!</a>
                                    </div>
                                </div>
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

        <!-- Page level plugins -->
        <script src="vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="js/demo/datatables-demo.js"></script>
        <!-- list Account -->
        <script src="js/demo/listAccount.js"></script>
        <!-- Link js register 8/3/2023 -->
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
