<%-- 
    Document   : chart
    Created on : Mar 5, 2023, 7:04:02 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Monthly Sales Chart</title>
    </head>
    <body>


        <form method="post" action="ChartDetail">
            <label for="month">Month:</label>
            <input type="text" name="month" id="month" />
            <br />
            <label for="year">Year:</label>
            <input type="text" name="year" id="year" />
            <br />
            <input type="submit" value="Submit" />
        </form>
        
        <h1>Monthly Sales Chart</h1>
        <img src="data:image/png;base64,${base64EncodedChart}" alt="Monthly Sales Chart">

        <h1>Monthly Sales Chart</h1>
        <img src="data:image/png;base64,${base64EncodedChart1}" alt="Monthly Sales Chart">
    </body>
</html>
