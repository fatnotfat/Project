<%-- 
    Document   : checkOut
    Created on : Feb 26, 2023, 3:29:13 AM
    Author     : Duy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="swp391.product.ProductDAO" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check out page</title>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/paginationjs/2.1.4/pagination.min.js"></script>


        <script>
            function updateQuantity(itemId, operation) {
                var quantity = document.getElementById('quantity' + itemId).innerHTML;
                if (operation === 'minus') {
                    quantity--;
                } else {
                    quantity++;
                }
                if (quantity < 1) {
                    quantity = 1;
                }
                document.getElementById('quantity' + itemId).innerHTML = quantity;
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

    </head>
    <body>
        <h1>Information for payment</h1>
        <form action="payments" method="post">
            <c:if test="${not empty sessionScope.USER}">
                <c:set var="cusInfo" value="${sessionScope.USER}"/>                                         
                <table border="1">
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Address</th>
                    </tr>                       
                    <tr>
                        <td>${cusInfo.name}</td>
                        <td>${cusInfo.email}</td>
                        <td>${cusInfo.phone}</td>
                        <td>${cusInfo.address}</td>
                    </tr>

                </table>                
            </c:if>
            <c:if test="${ empty sessionScope.USER}">
                <h1>Do you already have an account?</h1>
                <a href="login.jsp">Login Here</a>
                <a href="ShowCustomerInforForCheckOutServlet">debug Here</a>
                <table border="1">
                    <tr>
                        <td>Name : </td>
                        <td><input type="text" name="name" required/></td>
                    </tr>
                    <tr>
                        <td>Address: </td>
                        <td><input type="text" name="address:" required/></td>
                    </tr>
                    <tr>
                        <td>Phone Number: </td>
                        <td><input type="text" name="phoneNumber" required/></td>
                    </tr>
                    <tr>
                        <td>Email Address: </td>
                        <td><input type="email" name="emailAddress" required/></td>
                    </tr>
                </table>
            </c:if>






            <h1>Information of product</h1>
            <table border="1">
                <tbody>
                    <c:if test="${not empty sessionScope}">
                        <c:set var="cart" value="${sessionScope.CART}"/>
                        <c:if test="${not empty CART}">
                            <c:set var="items" value="${cart.items}"/>
                            <c:set var="itemDetail" value = "${cart.itemDetail}" />
                            <c:if test="${not empty items}">
                            <h2>Your Cart include:</h2>

                            <table id="cartTable" border="1">
                                <thead>
                                    <tr>

                                        <th>Product ID</th>
                                        <th>Product Name</th>
                                        <th>Quantity</th>
                                        <th>Price</th>
                                        <th>Remove</th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <c:set var="cartList" value="${sessionScope.CART.items}" />
                                    <c:set var="cartListDetail" value="${sessionScope.CART.itemDetail}" />

                                    <c:forEach var="item" items="${cartList}" varStatus="counter">
                                        <c:forEach var="detail" items="${cartListDetail}">
                                            <tr id="row-${item.key}-${counter.index}">
                                                <c:if test="${item.key eq detail.key}">
                                                    <td>
                                                        ${item.key}
                                                        <input type="hidden" name="txtId" value="${item.key}" />
                                                    </td>
                                                    <td>
                                                        ${detail.value.name}
                                                        <input type="hidden" name="txtName" value="${detail.value.name}" />
                                                    </td>

                                                    <td>
                                                        <button onclick="updateQuantity('${item.key}', 'minus')" id="minus_${item.key}">-</button>                             
                                                        <span id="quantity${item.key}">${item.value}</span>
                                                        <button onclick="updateQuantity('${item.key}', 'plus')" id="plus_${item.key}">+</button>
                                                        <input type="hidden" name="txtQuantity" value="${item.value}" />
                                                    </td>     
                                                    <td>${detail.value.price * item.value}
                                                        <input type="hidden" name="txtPrice" value="${detail.value.price * item.value}" />
                                                    </td>
                                                    <td>                                             
                                                        <button onclick="removeSelectedItem('${item.key}', '${counter.index}', function (itemId, rowIndex) {
                                                                    var row = document.getElementById('row-' + itemId + '-' + rowIndex);
                                                                    row.parentNode.removeChild(row);
                                                                });">X</button>
                                                    </td>
                                                </c:if>
                                            </tr>
                                        </c:forEach>
                                    </c:forEach>

                                </tbody>

                            </table>  
                        </c:if>
                    </c:if>
                </c:if>

                <h1>Payment method</h1>
                <form action="processPayment" method="post">
                    <input type="hidden" name="selectedProducts" value="${fn:join(selectedProducts, ',')}" />
                    <label><input type="radio" name="payment" value="online"/>Online payment</label><br/>
                    <label><input type="radio" name="payment" value="cash"/>Cash on delivery</label><br/>

                    <input type="submit" value="Confirm payment"/>
                    <tr><td><button onclick="location.href = 'checkout?selectedProducts=' + getSelectedProducts()">Checkout</button></td></tr>
                </form>




        </form>
    </body>
</html>
