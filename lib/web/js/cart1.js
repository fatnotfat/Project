/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function formatNumberWithCommas(number) {
    var parts = number.toString().split(".");
    parts[0] = parts[0].replace(/\B(?=(\d{3})+(?!\d))/g, ",");
//                if (parts.length > 1) {
//                    parts[1] = parts[1].substring(0, 2); // limit decimal places to 2
//                }
    return parts.join(".");
}
function updateQuantity(itemId, operation) {
//                var quantityElement = document.getElementById('quantity' + itemId).innerHTML;
    var quantityElement = document.getElementById('quantity' + itemId);
    var quantity = parseInt(quantityElement.innerHTML);
    var priceElement = document.getElementById("price-" + itemId);
    var price = priceElement.innerHTML.replace(/[^0-9\.]+/g, "");


    if (operation === 'minus') {
        quantity--;
        if (quantity < 1) {
            quantity = 1;
            price = price / (quantity + 1) * 2;
        } else {
            price = price / (quantity + 1) * quantity;
        }
    } else {
        quantity++;
        price = price / (quantity - 1) * quantity;
    }
    

    document.getElementById('quantity' + itemId).innerHTML = quantity;
//                priceElement.innerHTML = price.toLocaleString();
    priceElement.innerHTML = formatNumberWithCommas(price.toFixed());
    // update the total price
    var totalPrice = calculateTotalPrice();
//                alert(totalPrice);
    $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
    $('#total-price-header').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
    $('#total-price-mobile').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
    
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
//                        var totalPriceAllProduct = document.getElementById("total-price");
//                        totalPriceAllProduct.innerHTML = totalPrice.text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
        }
    };
    xhr.send('txtID=' + itemId + '&txtQuantity=' + quantity);
//    updateCartSize();
};


$(document).ready(function () {
    const buttons = document.querySelectorAll('.your-cart-body-left-product-detail-left-plus');

    buttons.forEach(button => {
        button.addEventListener('click', function () {
            const itemKey = this.id.substring(5); // remove 'plus_' from the button ID to get item key
            updateQuantity(itemKey, 'plus');
            updateCartSize();
        });
    });
});


$(document).ready(function () {
    const minusButtons = document.querySelectorAll('.your-cart-body-left-product-detail-left-minus');

    minusButtons.forEach(button => {
        button.addEventListener('click', function () {
            const itemKey = this.id.substring(6); // remove 'minus_' from the button ID to get item key
            updateQuantity(itemKey, 'minus');
            updateCartSize();
        });
    });
});

$(document).ready(function () {
    var removeIcons = document.querySelectorAll('.your-cart-body-left-product-detail-right-icon');
    removeIcons.forEach(function (icon) {
        icon.addEventListener('click', function (event) {
            // Get the product ID from the data attribute

            var productId = event.currentTarget.id;

            // Call the removeProduct function with the product ID
            removeProduct(productId);
        });
    });
});

// Add event listener to all elements with class "remove-product"
//$(document).ready(function () {
//// Get the button element
//    const addToCartButton = document.getElementById('product__add-button');
//
//// Add a click event listener to the button
//    addToCartButton.addEventListener('click', function (event) {
//        event.preventDefault();
//
//        // Get the product ID from the server-side data
//        const productId = 123; // Replace with your own product ID
//
//        // Send an AJAX request to the server-side script
//        $.ajax({
//            type: "POST",
//            url: "addToCartController",
//            data: {txtProductID: productId},
//            success: function (response) {
//                // handle success response from servlet
//                alert('Added to cart successfully!');
//            },
//            error: function (jqXHR, textStatus, errorThrown) {
//                // handle error response from servlet
//                alert('Error adding to cart.');
//            }
//        });
//    });
//});


// Add event listener to each remove icon



function calculateTotalPrice() {
    var total = 0;
    $('.your-cart-body-left-product-detail-right-sum').each(function () {
        var price = parseFloat($(this).find('span').text().replace(/,/g, ''));
        total += price;
    });
    return total;
}

function removeProduct(itemId) {
    // Code for removing product from the cart
    var confirmPopup = document.createElement('div');
    confirmPopup.className = 'confirm-popup';
    var confirmPopupContent = document.createElement('div');
    confirmPopupContent.className = 'confirm-popup__content';
    confirmPopupContent.innerHTML = '<p>Are you sure you want to remove this item from your cart?</p>';
    var confirmButtons = document.createElement('div');
    confirmButtons.className = 'confirm-popup__buttons';
    var confirmButtonYes = document.createElement('button');
    confirmButtonYes.className = 'confirm-popup__button';
    confirmButtonYes.textContent = 'Yes';
    confirmButtonYes.addEventListener('click', function () {
        $.ajax({
            type: "POST",
            url: "RemoveItemFromCartServlet",
            data: {txtId: itemId},
            success: function (response) {
                if (response.success) {
                    // update the cart UI with the updated cart data
                    var cartData = response.cart;
                    console.log("removeProduct called with itemId = " + itemId);

                    // remove the div tag with the corresponding item id
                    $("#product-" + itemId).remove();
                    // update the cart size in the UI
                    updateCartSize();

                    // update the total price
                    var totalPrice = calculateTotalPrice();
                    $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
                    $('#total-price-header').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
                    $('#total-price-mobile').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
                } else {
                    // handle error response from servlet
                    console.log(response.message);
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                // handle network error
                console.log(errorThrown);
            }
        });
        confirmPopup.remove();
    });
    var confirmButtonNo = document.createElement('button');
    confirmButtonNo.className = 'confirm-popup__button';
    confirmButtonNo.textContent = 'No';
    confirmButtonNo.addEventListener('click', function () {
        confirmPopup.remove();
    });
    confirmButtons.appendChild(confirmButtonYes);
    confirmButtons.appendChild(document.createTextNode('\u00A0')); // Adds a non-breaking space between the buttons
    confirmButtons.appendChild(confirmButtonNo);
    confirmPopupContent.appendChild(confirmButtons);
    confirmPopup.appendChild(confirmPopupContent);
    document.body.appendChild(confirmPopup);
}

function updateCartSize() {
    // Code for updating the cart size in the UI
    $.ajax({
        type: "GET",
        url: "GetCartSizeServlet",
        success: function (response) {
//            alert(response.cartSize);
            $("#cart-size").text(response.cartSize);
            $("#cart-size-header").text(response.cartSize);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            // handle error
        }
    });
};

$(document).ready(function () {
    // Code that runs on page load
    var totalPrice = calculateTotalPrice();
    $('#total-price').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
    $('#total-price-header').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
    $('#total-price-mobile').text(formatNumberWithCommas(totalPrice.toFixed()) + '₫');
});


$(document).ready(function () {
// Get the "Add To Cart" button
    const checkboxes = document.querySelectorAll(".product-size-list input[type='checkbox']");
    const totalPriceElement = document.getElementById("totalPrice");
    const addToCartButton = document.getElementById("addToCartButton");
    const addToCartButton2 = document.getElementById("addToCartButton2");
//    alert(addToCartButton);
// Add an event listener to the "Add To Cart" button

    function formatPrice(price) {
        return price.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",") + "đ";
    }

    function updateTotalPrice() {
//        const totalPriceElement = document.getElementById("totalPrice");
        let totalPrice = parseFloat(totalPriceElement.textContent.replaceAll(",", "").replaceAll("đ", ""));
//        alert(totalPrice);
        checkboxes.forEach(function (checkbox) {
            if (checkbox.checked) {
                const price = parseFloat(checkbox.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.value);
                totalPrice += price;
//                alert(totalPrice);
            }
        });
//        totalPriceElement.innerHTML = formatPrice(totalPrice);
        return totalPrice;
    }

//    checkboxes.forEach(function (checkbox) {
//        checkbox.addEventListener("change", updateTotalPrice);
//    });


    addToCartButton.addEventListener("click", function () {
        // Get all the selected checkboxes
        const checkboxes = document.querySelectorAll(".product-size-list input[type='checkbox']:checked");
//        alert(checkboxes);
        // Loop through the selected checkboxes
        checkboxes.forEach(function (checkbox) {
            // Get the value of the "txtProductID" hidden input field for the current checkbox
            const productId = checkbox.nextElementSibling.nextElementSibling.value;
//            alert(productId);
            // Get the value of the "txtProductSize" hidden input field for the current checkbox
            const productSize = checkbox.nextElementSibling.nextElementSibling.nextElementSibling.value;
//            alert(productSize);
            // Send an AJAX request to the server to add the product to the cart
            $.ajax({
                type: "POST",
                url: "addToCartController",
                data: {txtProductID: productId, txtProductSize: productSize},
                success: function (response) {
                    // Handle success response from servlet
                    alert("Add successfully!!");
                    updateTotalPrice();
                    var totalPrice = updateTotalPrice();
                    $('#totalPrice').text(formatPrice(totalPrice.toFixed()) + '₫');
                    totalPriceElement.textContent = formatPrice(totalPrice.toFixed()) + '₫';
                    updateCartSize();
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    // Handle error response from servlet
                }
            });
        });
    });

    addToCartButton2.addEventListener("click", function () {
        // Get all the selected checkboxes
        const checkboxes = document.querySelectorAll(".product-size-list input[type='checkbox']:checked");
//        alert(checkboxes);
        // Loop through the selected checkboxes
        checkboxes.forEach(function (checkbox) {
            // Get the value of the "txtProductID" hidden input field for the current checkbox
            const productId = checkbox.nextElementSibling.nextElementSibling.value;
//            alert(productId);
            // Get the value of the "txtProductSize" hidden input field for the current checkbox
            const productSize = checkbox.nextElementSibling.nextElementSibling.nextElementSibling.value;
//            alert(productSize);
            // Send an AJAX request to the server to add the product to the cart
            $.ajax({
                type: "POST",
                url: "addToCartController",
                data: {txtProductID: productId, txtProductSize: productSize},
                success: function (response) {
                    // Handle success response from servlet
                    alert("Add successfully!!");
                    updateTotalPrice();
                    var totalPrice = updateTotalPrice();
                    $('#totalPrice').text(formatPrice(totalPrice.toFixed()) + '₫');
                    totalPriceElement.textContent = formatPrice(totalPrice.toFixed()) + '₫';
                    updateCartSize();
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    // Handle error response from servlet
                }
            });
        });
    });
});

$(document).ready(function () {
    document.getElementById("add-to-cart-btn").addEventListener("click", function (event) {
        event.preventDefault();
        alert('hi');
        const itemId = document.getElementById("product-id").value;
        alert(itemId);
        // make the AJAX call with the itemId
        $.ajax({
            type: "POST",
            url: "addToCartController",
            data: {txtProductID: itemId},
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












