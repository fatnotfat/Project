<%-- 
    Document   : searchByFilter
    Created on : Feb 13, 2023, 8:29:38 PM
    Author     : Chau Nhat Truong
--%>

<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONException"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Filtered Results</title>
        <!--        <link href="style/paging.css" rel="stylesheet" type="text/css"/>
                <link rel="stylesheet" href="style/slideShow.css">
                <link rel="stylesheet" href="style/base.css">
                <link rel="stylesheet" href="style/listProduct.css">-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/paginationjs/2.1.4/pagination.min.js"></script>
        <script>
            $(document).ready(function () {
                var dataSource = [];
            <%
                try {
                    // Assuming that your servlet stores the JSON data as a string in a variable called jsonData
                    String jsonData = (String) session.getAttribute("products");
                    System.out.println(jsonData);
                    JSONArray jsonArray = new JSONArray(jsonData);
                    for (int i = 0; i < jsonArray.length(); i++) {
//                                    if (jsonArray.get(i) instanceof String) {
//                                        String item = jsonArray.getString(i);
//                                        out.print("dataSource.push('" + item + "');\n");
//                                    }
                        Object element = jsonArray.get(i);
                        if (element instanceof String) {
                            String item = (String) element;
                            out.print("dataSource.push('" + item + "');\n");
                        } else if (element instanceof Number) {
                            Number item = (Number) element;
                            out.print("dataSource.push(" + item.toString() + ");\n");
                        } else if (element instanceof JSONObject) {
                            JSONObject obj = (JSONObject) element;

                            out.print("dataSource.push(" + obj.toString(2) + ");\n");
                            // Handle object element
                            System.out.println(obj.toString());
                        }
                    }
                } catch (JSONException ex) {
                    out.println("Error: " + ex.getMessage());
                    System.out.println(ex.getMessage());
                }
            %>
                var dataContainer = $('#data-container');
                var options = {
                    dataSource: dataSource,
                    pageSize: 9,
                    callback: function (data, pagination) {
                        var html = '';
//                        for (var i = 0; i < data.length; i++) {
//                            html += '<div>' + JSON.stringify(data[i].name) + '</div>';
//                        }
                        for (var i = 0; i < data.length; i++) {
                            if (i % 3 === 0) {
                                html += '<div class="product__row">';
                            }

                            html += '<div class="grid__column-3-4">'
                                    + '<div class="product__item">'
                                    + '<div class="product__item-img"><img/>'
                                    + '</div>'
                                    + '<div class="product__item-name">'
                                    + JSON.stringify(data[i].name).replace(/^"(.*)"$/, '$1')
                                    + '</div>'
                                    + '<div class="product__item-price">'
                                    + 'Price:' + '<span>' + JSON.stringify(data[i].price) + '</span>'
                                    + '</div>'
                                    + '<div class="product__item-info">'
                                    + '<button class="product__item-view">Xem Ngay</button>'
                                    + '</div>'
                                    + '<a href="#" onclick="addToCart('
                                    + JSON.stringify(data[i].id)
                                    + ');">Add to Cart</a>'
                                    + '</div>'
                                    + '</div>';

                            if (i % 3 === 2 || i === data.length - 1) {
                                html += '</div>';
                            }
                        }
                        dataContainer.html(html);
                    }
                };
                $('#pagination-container').pagination(options);
            });
        </script>

        <script>
            function addToCart(itemId) {
                event.preventDefault();
                $.ajax({
                    type: "POST",
                    url: "addToCartController",
                    data: {txtID: itemId},
                    success: function (response) {
                        // handle success response from servlet
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        // handle error response from servlet
                    }
                });
            }
        </script>

    </head>
    <body>
        <h1>Filtered Results</h1>
        <form action="searchByFilterController" method="POST">
            Category <select name="txtProductCateID" >
                <option value="1" ${param.txtProductCateID == '1' ? 'selected' : ''}>1</option>
                <option value="2" ${param.txtProductCateID == '2' ? 'selected' : ''}>2</option>
                <option value="3" ${param.txtProductCateID == '3' ? 'selected' : ''}>3</option>

            </select><br/>
            Price From <input type="number" name="txtPriceFrom" value="${param.txtPriceFrom}" min="0" /><br/>
            Price To <input type="number" name="txtPriceTo" value="${param.txtPriceTo}" min="0" /><br/>
            Size <select name="cboSize">
                <option value="6" ${param.cboSize == '6' ? 'selected' : ''}>6</option>
                <option value="7" ${param.cboSize == '7' ? 'selected' : ''}>7</option>
                <option value="8" ${param.cboSize == '8' ? 'selected' : ''}>8</option>
                <option value="17" ${param.cboSize == '17' ? 'selected' : ''}>17</option>
                <option value="18" ${param.cboSize == '18' ? 'selected' : ''}>18</option>
                <option value="19" ${param.cboSize == '19' ? 'selected' : ''}>19</option>
                <option value="20" ${param.cboSize == '20' ? 'selected' : ''}>20</option>
                <option value="21" ${param.cboSize == '21' ? 'selected' : ''}>21</option>
                <option value="22" ${param.cboSize == '22' ? 'selected' : ''}>22</option>
            </select><br/>
            <input type="submit" value="Search" name="btAction" /><br/>
        </form><br/>
        <%--<c:set var="result" value="${requestScope.SEARCHBYFILTER_RESULT}"/>--%>
        <%--<c:if test="${not empty result}">
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
        </c:if>--%>
        <div id="data-container"></div>                               
        <div id="pagination-container"></div>
        <a href="addToCartPage">
            <button>View cart</button>
        </a>
    </body>
</html>
