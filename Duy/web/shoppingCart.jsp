<%-- 
    Document   : shoppingCart
    Created on : Feb 16, 2023, 1:39:19 AM
    Author     : Duy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="swp391.product.ProductDTO" %>
<%@page import="swp391.product.ProductDAO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.Date"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<!DOCTYPE html>
<html>
    <c:if test="${not empty sessionScope.name}">
        <h3>Welcome ${sessionScope.name} come back</h3>
    </c:if>

    <font style="color: red;">
    <c:out value="${not empty requestScope.WARNING ? requestScope.WARNING : ''}"/>
    </font>

    <table  border="1">
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Quantity</th>
                <th>Discount</th>
                <th>Price</th>  
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${empty sessionScope.cart}">
                    <tr><td>Your cart is empty</td></tr>
                </c:when>
                <c:otherwise>
                    <c:set var="cart" value="${sessionScope.cart}"/>
                    <c:set var="totalMoney" value="0" />
                    <c:forEach var="productID" items="${cart.keySet()}">
                        <c:set var="quantity" value="${cart[productID]}" />
                        <c:set var="productDAO" value="${ProductDAO.getProductDTO(productID)}" />
                        <c:set var="totalMoney" value="${totalMoney + quantity * productDAO.price}" />
                    <form action="mainController" method="post">
                        <tr>
                            <td><c:out value="${productID}"/></td>   
                            <td><input type="number" min="0" value="${quantity}" onchange="updateTotal()"></td>
                            <td><c:out value="${discount}"/></td> 
                            <td><c:out value="${productDAO.price}"/></td>                                          
                            <td>
                                <input type="submit" value="update" name="action">
                                <input type="submit" value="delete" name="action">
                            </td>
                        </tr>
                    </form>
                </c:forEach>
                <tr>
                    <td>Total money: <span id="totalMoney"></span></td>
                </tr>
            </c:otherwise>
        </c:choose>

        <script>
            function updateTotal() {
                var totalMoney = 0;
                var quantities = document.querySelectorAll("input[type=number]");
                for (var i = 0; i < quantities.length; i++) {
                    var quantity = quantities[i].value;
                    if (quantity < 0)
                        quantity = 0; // không được nhập số lượng âm
                    quantities[i].value = quantity;
                    var price = quantities[i].parentNode.nextElementSibling.nextElementSibling.textContent;
                    totalMoney += quantity * price;
                }
                document.getElementById("totalMoney").textContent = totalMoney >= 0 ? "+$" + totalMoney : "-$" + Math.abs(totalMoney);
            }
            updateTotal(); // cập nhật tổng tiền khi trang được tải
        </script>

    </table>
</html>
