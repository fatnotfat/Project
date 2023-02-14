<%-- 
    Document   : searchPage
    Created on : Feb 6, 2023, 9:52:01 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        <link href="style/paging.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form action="searchTextController" method="GET">       
            Search Value:<input type="text" name="txtSearch" value="${param.txtSearch}" />
            <input type="submit" value="Search" />
        </form>
            
        <c:set var="searchValue" value="${param.txtSearch}"/>
        <c:if test="${not empty searchValue}">
            <c:set var="result" value="${requestScope.PRODUCT_RESULT}" />
            <c:if test="${not empty result}">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Quantity</th>
                            <th>Price</th>
                            <th>Status</th>
                            <th>Size</th>
                        </tr>
                    </thead>
                    <tbody>

                        <%-- <c:forEach var="dto" items="${result}" varStatus="counter">

                            <!--<form action="updateAccountController">-->
                            <tr>
                                <td>
                                    ${counter.count} 
                                    .</td>
                                <td>
                                    ${dto.name}
                                    
                                </td>
                                <td>
                                    ${dto.description}
                                    
                                </td>
                                <td>
                                    ${dto.quantity}
                                </td>
                                <td>

                                    ${dto.price}
                                </td>
                                <td>
                                    ${dto.status}
                                </td>
                                <td>
                                    ${dto.size}
                                </td>
                            </tr>
                            <!--</form>-->
                        </c:forEach>
                        --%>
                            
                            <c:forEach items="${PAGING_RESULT}" var="dto">
                                <tr> 
                                    <td>${dto.name}</td>
                                    <td>${dto.description}</td>
                                    <td>${dto.quantity}</td>
                                    <td>${dto.price}</td>
                                    <td>${dto.status}</td>
                                    <td>${dto.size}</td>
                                    
                                </tr>
                            </c:forEach>
                    </tbody>
                </table>
            </c:if>
            
            <c:if test="${empty result}">
                <h2>
                    No record is matched!!!
                </h2>
            </c:if>
            
            <div class="paging">
                    <c:forEach begin="1" end="${END_PAGE}" var="i">
                        <a class="${CURRENT_PAGE == i?"active":""}" href="SearchTextServlet?txtSearch=${param.txtSearch}&index=${i}">${i}</a>
                    </c:forEach>
            </div>
            
            <%--<c:forEach items="${PAGING_RESULT}" var="dto">--%>                
            <%--</c:forEach>--%>
        </c:if>
    </body>
</html>
