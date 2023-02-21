<%-- 
    Document   : checkout
    Created on : Feb 21, 2023, 2:38:21 AM
    Author     : Duy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="swp391.product.ProductDAO" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Check out page</title>
    </head>
    <body>
        <h1>Information of customer</h1>
        <form action="thanhToan" method="post">
            <table>
                <tr>
                    <td>Name: </td>
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



            <h1>Information of product</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>Product</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total product money</th>
                        <th>Select to buy</th>
                    </tr>
                </thead>
                <tbody>
                    <c:choose>
                        <c:when test="${empty sessionScope.cart}">
                            <tr><td>Your cart is empty</td></tr>
                        </c:when>
                        <c:otherwise>
                            <c:set var="cart" value="${sessionScope.cart}"/>
                            <c:set var="totalCartMoney" value="0" />
                            <c:set var="selectedProducts" value="${param.selectedProducts}" />

                            <c:forEach var="productId" items="${cart.keySet()}">
                                <c:set var="quantity" value="${cart[productId]}" />
                                <c:set var="productDAO" value="${ProductDAO.getProductDTO(productId)}" />
                                <c:if test="${fn:contains(selectedProducts, productId)}">
                                    <c:set var="totalProductMoney" value="${quantity * productDAO.price}" />
                                    <c:set var="totalCartMoney" value="${totalCartMoney + totalProductMoney}" />
                                </c:if>
                                <tr>
                                    <td><c:out value="${productDAO.name}"/></td>   
                                    <td><c:out value="${quantity}"/></td>                                                      
                                    <td><c:out value="${productDAO.price}"/></td>  
                                    <td><c:out value="${quantity * productDAO.price}"/></td>
                                    <td><input type="checkbox" name="selectedProducts" value="${productId}" 
                                               <c:if test="${fn:contains(selectedProducts, productId)}">checked="checked"</c:if> /></td>
                                    </tr>
                            </c:forEach>

                        <tfoot>                  
                            <tr><td>Total cart: <c:out value="${totalCartMoney}"/></td></tr>                
                        </tfoot>
                    </c:otherwise>
                </c:choose>
                </tbody>
            </table>

            <script>
                function getSelectedProducts() {
                    var checkboxes = document.getElementsByName("selectedProducts");
                    var selectedProducts = [];
                    for (var i = 0; i < checkboxes.length; i++) {
                        if (checkboxes[i].checked) {
                            selectedProducts.push(checkboxes[i].value);
                        }
                    }
                    return selectedProducts.join(",") || "";
                }
            </script>

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
