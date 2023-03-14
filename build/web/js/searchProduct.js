

$(document).ready(function () {
//    alert('hihi');
    var searchValue = $("#search-input").val();
    $.ajax({
        url: "SearchTextServlet", // Change this to the URL of your servlet
        type: "GET",
        data: {txtSearch: searchValue}, // Change this to your search query parameter
        success: function (response) {
//            alert(response);
            var jsonData = JSON.stringify(response);
            var dataSource = [];
//            var jsonData = sessionStorage.getItem("products");
//            alert(sessionStorage.getItem("products"));
            var jsonArray = JSON.parse(jsonData);
            for (var i = 0; i < jsonArray.length; i++) {
                var element = jsonArray[i];

                if (typeof element === "string") {
                    dataSource.push("'" + element + "'");
                } else if (typeof element === "number") {
                    dataSource.push(element.toString());
                } else if (typeof element === "object" && element !== null) {
                    dataSource.push(JSON.stringify(element));
                }
            }

            var dataContainer = $('#data-container');

            var options = {
                dataSource: dataSource,
                pageSize: 9,
                callback: function (data, pagination) {
                    var html = '';

                    for (var i = 0; i < data.length; i++) {

                        var name = JSON.parse(data[i]).name;
                        var price = JSON.parse(data[i]).price;

                        html += '<div class="grid__column-3-4">'
                                + '<div class="product__item">'
                                + '<div class="product__item-img"><img/>'
                                + '</div>'
                                + '<div class="product__item-name">'
                                + name
                                + '</div>'
                                + '<div class="product__item-price">'
                                + 'Price:' + '<span>' + price + '</span>'
                                + '</div>'
                                + '<div class="product__item-info">'
                                + '<button class="product__item-view">Xem Ngay</button>'
                                + '</div>'
                                + '</div>'
                                + '</div>';

                    }

                    dataContainer.html(html);
                }
            };

            $('#pagination-container').pagination(options);
        },
        error: function (xhr, status, error) {
            console.log("Error: " + error);
        }
    });
});

//$(document).ready(function() {
//  $.ajax({
//    url: "SearchServlet", // Change this to the URL of your servlet
//    type: "GET",
//    data: {txtSearch: "your_search_query"}, // Change this to your search query parameter
//    success: function(response) {
//      var jsonData = JSON.stringify(response); // Convert the response to a JSON string
//      sessionStorage.setItem("products", jsonData); // Set the JSON data in the session storage
//      // Your pagination code goes here...
//    },
//    error: function(xhr, status, error) {
//      console.log("Error: " + error);
//    }
//  });
//});

//$(document).ready(function() {
//  $("#product-category").change(function() {
//    var selectedCategory = $(this).val();
//    if (selectedCategory === '1') {
//      $("#size-container").html(`
//        <select name="cboSize" id='product-size'>
//          <option value="18" >18</option>
//          <option value="19" >19</option>
//          <option value="20" >20</option>
//          <option value="21" >21</option>
//          <option value="22" >22</option>
//        </select>
//      `);
//    } else if (selectedCategory === '2') {
//      $("#size-container").html(`
//        <select name="cboSize" id='product-size'>
//          <option value="6">6</option>
//          <option value="7">7</option>
//          <option value="8">8</option>
//        </select>
//      `);
//    } else if (selectedCategory === '3') {
//      $("#size-container").html(`
//        <select name="cboSize" id='product-size'>
//          <option value="12">12</option>
//          <option value="13">13</option>
//          <option value="14">14</option>
//        </select>
//      `);
//    } else if (selectedCategory === '4') {
//      $("#size-container").html(`
//        <select name="cboSize" id='product-size'>
//          <option value="10">10</option>
//          <option value="11">11</option>
//          <option value="12">12</option>
//        </select>
//      `);
//    } else {
//      $("#size-container").empty();
//    }
//  });
//});

//$(document).ready(function() {
//  $("#product-category").change(function() {
//    var selectedCategory = $(this).val();
//    if (selectedCategory === '1') {
//      $("#size-container").html(`
//        <select name="cboSize" id='product-size'>
//          <option value="18" ${localStorage.cboSize == '18' ? 'selected' : ''}>18</option>
//          <option value="19" ${localStorage.cboSize == '19' ? 'selected' : ''}>19</option>
//          <option value="20" ${localStorage.cboSize == '20' ? 'selected' : ''}>20</option>
//          <option value="21" ${localStorage.cboSize == '21' ? 'selected' : ''}>21</option>
//          <option value="22" ${localStorage.cboSize == '22' ? 'selected' : ''}>22</option>
//        </select>
//      `);
//    } else if (selectedCategory === '2') {
//      $("#size-container").html(`
//        <select name="cboSize" id='product-size'>
//          <option value="6" ${localStorage.cboSize == '6' ? 'selected' : ''}>6</option>
//          <option value="7" ${localStorage.cboSize == '7' ? 'selected' : ''}>7</option>
//          <option value="8" ${localStorage.cboSize == '8' ? 'selected' : ''}>8</option>
//        </select>
//      `);
//    } else if (selectedCategory === '3') {
//      $("#size-container").html(`
//        <select name="cboSize" id='product-size'>
//          <option value="12" ${localStorage.cboSize == '12' ? 'selected' : ''}>12</option>
//          <option value="13" ${localStorage.cboSize == '13' ? 'selected' : ''}>13</option>
//          <option value="14" ${localStorage.cboSize == '14' ? 'selected' : ''}>14</option>
//        </select>
//      `);
//    } else if (selectedCategory === '4') {
//      $("#size-container").html(`
//        <select name="cboSize" id='product-size'>
//          <option value="10" ${localStorage.cboSize == '10' ? 'selected' : ''}>10</option>
//          <option value="11" ${localStorage.cboSize == '11' ? 'selected' : ''}>11</option>
//          <option value="12" ${localStorage.cboSize == '12' ? 'selected' : ''}>12</option>
//        </select>
//      `);
//    } else {
//      $("#size-container").empty();
//    }
//  });
//
//  // Save selected value to localStorage when the combo box changes
//  $(document).on('change', '#product-size', function() {
//    localStorage.cboSize = $(this).val();
//  });
//
//  // Restore selected value from localStorage on page load
//  if (localStorage.cboSize) {
//    $('#product-size').val(localStorage.cboSize);
//  }
//});



