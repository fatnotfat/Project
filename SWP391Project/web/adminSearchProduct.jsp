<%-- 
    Document   : adminUpdateProduct
    Created on : Feb 16, 2023, 4:16:33 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Product Page</title>
    </head> 
    <body>
        <h1>Update product</h1>
        <form action="adminSearchProductController">
            Search Value <input type="text" name="txtSearchValue" 
                                value="${param.txtSearchValue}" /><br/>
            <input type="submit" value="Search" />
        </form><br/>
        <c:set var="searchValue" value="${param.txtSearchValue}" />
        <c:if test="${not empty searchValue}">
            <c:set var="result" value="${requestScope.SEARCH_RESULT}"/>
            <c:if test="${not empty result}">
                <table border="1">
                    <thead>
                        <tr>
                            <th>No.</th>
                            <th>Product ID</th>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Quantity</th>
                            <th>Price</th>
                            <th>Status</th>
                            <th>Size</th>
                            <th>Update</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="dto" items="${result}" varStatus="counter">
                        <form action="adminUpdateProductController" method="POST">
                            <tr>
                                <td>
                                    ${counter.count}
                                    .</td>
                                <td>
                                    ${dto.productID}
                                    <input type="hidden" name="txtProductID" 
                                           value="${dto.productID}" />
                                </td>
                                <td>
                                    <input type="text" name="txtName" 
                                           value="${dto.name}" />
                                </td>
                                <td>
                                    <input type="text" name="txtDescription" 
                                           value="${dto.description}" />
                                </td>
                                <td>
                                    <input type="number" name="txtQuantity" 
                                           value="${dto.quantity}" />
                                </td>
                                <td>
                                    <input type="number" name="txtPrice" 
                                           value="${dto.price}" />
                                </td>
                                <td>
                                    <input type="checkbox" name="chkStatus" value="ON" 
                                           <c:if test="${dto.status}">
                                               checked="checked"
                                           </c:if>
                                           />
                                </td>
                                <td>
                                    <input type="number" name="txtSize" 
                                           value="${dto.size}" />
                                </td>
                                <td>
                                    <input type="submit" value="Update" />
                                    <input type="hidden" name="lastSearchValue" 
                                           value="${searchValue}" />
                                </td>
                            </tr>
                        </form>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <c:if test="${empty result}">
            <h2>No product is matched!!!!</h2>
        </c:if>
    </c:if>
</body>
</html>