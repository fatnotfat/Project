<%-- 
    Document   : searchByFilter
    Created on : Feb 13, 2023, 8:29:38 PM
    Author     : Chau Nhat Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Filtered Results</title>
    </head>
    <body>
        <h1>Filtered Results</h1>
        <form action="searchByFilterController" method="POST">
            Price From <input type="number" name="txtPriceFrom" value="0" /><br/>
            Price To <input type="number" name="txtPriceTo" value="100000000" /><br/>
            Size <select name="cboSize">
                <option>17</option>
                <option>18</option>
                <option>19</option>
                <option>20</option>
                <option>21</option>
                <option>22</option>
            </select><br/>
            <input type="submit" value="Search" name="btAction" /><br/>
        </form><br/>
        <c:set var="result" value="${requestScope.SEARCHBYFILTER_RESULT}"/>
        <c:if test="${not empty result}">
            <table border="1">
                <thead>
                    <tr>
                        <th>Number</th>
                        <th>Description</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Size</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dto" items="${result}" varStatus="counter">
                        <tr>
                            <td>${counter.count}</td>
                            <td>${dto.description}</td>
                            <td>${dto.quantity}</td>
                            <td>${dto.price}</td>
                            <td>${dto.size}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <c:if test="${empty result}">
            <h2>Sorry, We could not find anything</h2>
        </c:if>
    </body>
</html>
