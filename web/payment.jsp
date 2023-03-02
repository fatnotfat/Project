<%-- 
    Document   : payment
    Created on : Feb 26, 2023, 3:12:18 PM
    Author     : Duy
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Page</title>
    </head>
    <body>
        <h1>Payment</h1>
        <h2>Information</h2>
        <form action="paymentController" method="POST">
            <c:set var="customerInfomation" value="${sessionScope.USER}"/>
            <input type="hidden" name="txtCustomerID" value="${customerInfomation.customerID}" />
            Name: ${customerInfomation.name}<br/>
            Address: ${customerInfomation.address}<br/>
            Phone Number: ${customerInfomation.phone}<br/>
            Email Address: ${customerInfomation.email}<br/>

            <c:if test="${not empty sessionScope}">
                <c:set var="cart" value="${sessionScope.CART}"/>
                <%--<c:if test="${not empty CART}">--%>
                <c:if test="${not empty cart}">
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
                                            </c:if>
                                        </tr>
                                    </c:forEach>
                                </c:forEach>
                            </tbody>
                        </table>  
                    </c:if>
                </c:if>
            </c:if>
            <c:set var = "errors" value="${requestScope.PAYMENT_ERROR}"/>
            <c:set var = "shippingID" value="${requestScope.SHIPPING_ID}"/>
            
            <input type="hidden" name="txtShippingID" value="${shippingID}" />
            <h2>Payment methods</h2>
            <input type="radio" name="chkPaymentID" 
                   value="${1}" />COD (Cash On Delivery)<br/>
            <input type="radio" name="chkPaymentID" 
                   value="${2}" />Pay Pal<br/>
            <c:if test="${not empty errors.paymentIDLengthError}">
                <font color="red">
                ${errors.paymentIDLengthError}
                </font><br/>
            </c:if>
            <input type="submit" value="Pay" />
        </form>
    </body>
</html>
