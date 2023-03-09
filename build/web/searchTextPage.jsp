<%-- 
    Document   : searchPage
    Created on : Feb 6, 2023, 9:52:01 PM
    Author     : nguye
--%>

<%@page import="org.json.JSONException"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        <link href="style/paging.css" rel="stylesheet" type="text/css"/>

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
                    pageSize: 5,
                    callback: function (data, pagination) {
                        var html = '';
                        for (var i = 0; i < data.length; i++) {
                            html += '<div>' + JSON.stringify(data[i]) + '</div>';
                        }
                        dataContainer.html(html);
                    }
                };
                $('#pagination-container').pagination(options);
            });
        </script>

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
                <c:if test="${CURRENT_PAGE > 1}">
                    <li class="page-item disabled"><a href="SearchTextServlet?txtSearch=${param.txtSearch}&index=${CURRENT_PAGE-1}">Previous</a></li>
                    </c:if>

                <c:forEach begin="1" end="${END_PAGE}" var="i">
                    <a class="${CURRENT_PAGE == i?"active":""}" href="SearchTextServlet?txtSearch=${param.txtSearch}&index=${i}">${i}</a>
                </c:forEach>

                <c:if test="${CURRENT_PAGE < END_PAGE}">
                    <li class="page-item"><a href="SearchTextServlet?txtSearch=${param.txtSearch}&index=${CURRENT_PAGE+1}">Next</a></li>
                    </c:if>
            </div>

            <div id="data-container"></div>
            <div id="pagination-container"></div>

        </c:if>
    </body>
</html>
