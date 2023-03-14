/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



$(document).ready(function () {
    alert('hi');
    document.getElementById("add-to-cart-btn").addEventListener("click", function (event) {
        event.preventDefault();
        var itemId = document.querySelector("input[name='txtProductID']").value;
        // make the AJAX call with the itemId
        $.ajax({
            type: "POST",
            url: "addToCartController",
            data: {txtID: itemId},
            success: function (response) {
                // handle success response from servlet
                alert('Add successfully !!');
            },
            error: function (jqXHR, textStatus, errorThrown) {
                // handle error response from servlet
            }
        });
    });
});