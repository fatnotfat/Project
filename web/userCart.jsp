<%-- 
    Document   : userCart
    Created on : Feb 20, 2023, 3:48:23 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            document.getElementById("removeSelectedItemsBtn").addEventListener("click", function () {
                var selectedItems = [];
                var checkboxes = document.getElementsByName("selectedItems");
                for (var i = 0; i < checkboxes.length; i++) {
                    if (checkboxes[i].checked) {
                        selectedItems.push(checkboxes[i].value);
                    }
                }
                if (selectedItems.length === 0) {
                    alert("Please select at least one item to remove.");
                    return;
                }
                var xhr = new XMLHttpRequest();
                xhr.open("POST", "RemoveItemFromCartServlet");
                xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                xhr.onreadystatechange = function () {
                    if (xhr.readyState === 4 && xhr.status === 200) {
                        if (xhr.responseText === "success") {
                            location.reload(); // or update the cart list using AJAX
                        } else {
                            alert("An error occurred while removing the selected items.");
                        }
                    }
                };
                xhr.send("selectedItems=" + selectedItems.join(","));
            });

        </script>
    </head>
    <body>

        <c:if test="${not empty sessionScope}">
            <c:set var="cart" value="${sessionScope.CART}"/>
            <c:if test="${not empty CART}">
                <c:set var="items" value="${cart.items}"/>
                <c:set var="itemDetail" value = "${cart.itemDetail}" />
                <c:if test="${not empty items}">
                    <h2>Your Cart include:</h2>
                    <%--
                        //4.show items
                    --%>

                    <!--<form id="removeItemForm" method="post" action="RemoveItemFromCartServlet">-->
                        <table border="1">
                            <thead>
                                <tr>
                                    <th>No</th>
                                    <th>Product ID</th>
                                    <th>Product Name</th>
                                    <th>Quantity</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%--  int count = 0;
                                    for (String key : items.keySet()) {
                                --%>

                                <c:set var="cartList" value="${sessionScope.CART.items}" />
                                <c:set var="cartListDetail" value="${sessionScope.CART.itemDetail}" />

                                <c:forEach var="item" items="${cartList}" varStatus="counter">
                                    <c:forEach var="detail" items="${cartListDetail}">
                                        <tr>
                                            <c:if test="${item.key eq detail.key}">
                                                <td>
                                                    ${counter.count}
                                                </td>
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

                                                <td>
                                                    <input type="checkbox" name="ckItem" value="${item.key}" />
                                                </td>
                                            </c:if>
                                        </tr>
                                    </c:forEach>
                                </c:forEach>
                            </tbody>
                        </table>
                        <input type="hidden" name="action" value="removeSelectedItems" />
                        <button type="button" id="removeSelectedItemsBtn">Remove Selected Item</button>
                    <!--</form>-->

                    <form action="checkOutController">
                        <input type="submit" value="Check out" name="btAction" />
                    </form>
                    <%--
                                    return;
                                }//items have value
                            }//cart has existed
                        }//session has existed
                    --%>
                </c:if>
            </c:if>
        </c:if>
        <c:if test="${empty sessionScope.CART.items}">
            <h2>Cart is empty!!! You should buy something first!</h2>
        </c:if>
    </body>
</html>
