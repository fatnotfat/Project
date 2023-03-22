// ______________________________________ICON____________________________________________
// Get references to the search tab and its content
const searchTab = document.querySelector(".menu-icon-tab-search");
const searchContent = document.querySelector(".menu-icon-tab-search-content");

// Get references to the profile tab and its content
const profileTab = document.querySelector(".menu-icon-tab-profile");
const profileContent = document.querySelector(".menu-icon-tab-profile-content");

// Get references to the cart tab and its content
const cartTab = document.querySelector(".menu-icon-tab-cart");
const cartContent = document.querySelector(".menu-icon-tab-cart-content");

// Add a click event listener to the document
document.addEventListener("click", function (e) {
  // If the search tab or its content are not the target of the click event, hide the search content
  if (!searchTab.contains(e.target) && !searchContent.contains(e.target)) {
    searchContent.classList.remove("menu-icon-tab-search-content-active");
  }

  // If the profile tab or its content are not the target of the click event, hide the profile content
  if (!profileTab.contains(e.target) && !profileContent.contains(e.target)) {
    profileContent.classList.remove("menu-icon-tab-profile-content-active");
  }

  // If the cart tab or its content are not the target of the click event, hide the cart content
  if (!cartTab.contains(e.target) && !cartContent.contains(e.target)) {
    cartContent.classList.remove("menu-icon-tab-cart-content-active");
  }
});

// Add a click event listener to the search tab
searchTab.addEventListener("click", function () {
  // Toggle the visibility of the search content when the search tab is clicked
  searchContent.classList.toggle("menu-icon-tab-search-content-active");
  // Hide the profile and cart content
  profileContent.classList.remove("menu-icon-tab-profile-content-active");
  cartContent.classList.remove("menu-icon-tab-cart-content-active");
});

// Add a click event listener to the profile tab
profileTab.addEventListener("click", function () {
  // Toggle the visibility of the profile content when the profile tab is clicked
  profileContent.classList.toggle("menu-icon-tab-profile-content-active");
  // Hide the search and cart content
  searchContent.classList.remove("menu-icon-tab-search-content-active");
  cartContent.classList.remove("menu-icon-tab-cart-content-active");
});

// Add a click event listener to the cart tab
cartTab.addEventListener("click", function () {
  // Toggle the visibility of the cart content when the cart tab is clicked
  cartContent.classList.toggle("menu-icon-tab-cart-content-active");
  // Hide the search and profile content
  searchContent.classList.remove("menu-icon-tab-search-content-active");
  profileContent.classList.remove("menu-icon-tab-profile-content-active");
});

// ____________________________CATEGORY_______________________________________________
const menuLink = document.querySelector('.menu-link-category');
const dropdown = document.querySelector('.menu-link-category-tab');

// toggle the dropdown when the menu link is clicked
menuLink.addEventListener('click', () => {
  dropdown.classList.toggle('active');
});

// hide the dropdown when the user clicks outside of it
document.addEventListener('click', (event) => {
  if (!menuLink.contains(event.target) && !dropdown.contains(event.target)) {
    dropdown.classList.remove('active');
  }
});

// __________________________________NAV-RESPONSIVE_____________________________________
const menuIcon = document.querySelector(".menu-responsive-icon-img-bar");
const navBot = document.querySelector(".nav-bot");
const menu = document.querySelector(".menu");


menuIcon.addEventListener("click", () => {
  navBot.classList.toggle("active");
  menu.classList.toggle("active");
});

// _________________________CART-RESPONSIVE_____________________________________________________
const cartIcon = document.querySelector('.menu-responsive-icon-tab-cart');
const cartContentR = document.querySelector('.menu-responsive-icon-tab-cart-content');

// Function to toggle the cart content
function toggleCartContent() {
  cartContentR.classList.toggle('menu-responsive-icon-tab-cart-content-active');
}

// Event listener to show/hide the cart content
cartIcon.addEventListener('click', function(e) {
  e.stopPropagation();
  toggleCartContent();
});

// Event listener to hide the cart content when clicked outside
document.addEventListener('click', function() {
  if (cartContentR.classList.contains('menu-responsive-icon-tab-cart-content-active')) {
    toggleCartContent();
  }
});
// ________________________________CART RESPONSIVE______________________________

// ____________________________________PAY METHODS__________________________________
// Get references to the relevant elements
const codRadio = document.querySelector('.shipping-info-left-payment-field-input input[type="radio"]');
const otherRadio = document.querySelector('.shipping-info-left-payment-field-other-input input[type="radio"]');
const codDiv = document.querySelector('.shipping-info-left-payment-content-cod');
const otherDiv = document.querySelector('.shipping-info-left-payment-content-other');

// Add event listeners to the radio buttons
codRadio.addEventListener('click', function() {
  codDiv.style.display = 'block';
  otherDiv.style.display = 'none';
});

otherRadio.addEventListener('click', function() {
  codDiv.style.display = 'none';
  otherDiv.style.display = 'block';
});


//////////////////////////////////////////////
//function updateShippingFee(shippingFee) {
//    const parsedShippingFee = parseFloat(shippingFee);
//    const formattedShippingFee = parsedShippingFee.toFixed(0).replace(/\d(?=(\d{3})+$)/g, '$&,');
//    document.getElementById('shipping-fee').innerHTML = formattedShippingFee + '₫';
//}



//const radioButtons = document.getElementsByName()('location');
//radioButtons.forEach(button => {
//    button.addEventListener('change', () => {
//        const shippingFee = button.parentNode.nextElementSibling.querySelector('input[name="txtFee"]').value;
//        alert(shippingFee);
//        updateShippingFee(shippingFee);
//    });
//});
// ---------------------PRICE SHIPPING-------------------------------
// Get the radio button and the paragraph element
//const radio = document.getElementById('location');
//const price = document.querySelector('.shipping-info-right-product-fee-price-ship');
//
//
//// Add an event listener to the radio button
//radio.addEventListener('click', function() {
//  // Get the price of home delivery
//  const homeDeliveryPrice = document.querySelector('.shipping-info-left-form-delivery-home-price-number').textContent;
//
//  // Update the value of the paragraph with the home delivery price
//  price.textContent = homeDeliveryPrice;
//});


// Get all radio buttons
const radioButtons = document.querySelectorAll('input[type=radio][name=location]');
const inputElement = document.getElementsByName("txtHiddenTotal")[0];
const hiddenTotal = inputElement.value;

// Loop through radio buttons and add event listeners
radioButtons.forEach((radioButton) => {
  radioButton.addEventListener('click', (event) => {
    // Get the selected shipping fee value from the hidden input field
    const selectedShippingFee = event.target.closest('.shipping-info-left-form-delivery-home')
      .querySelector('input[type=hidden][name=txtFee]').value;

    // Update the shipping fee display
    updateShippingFee(selectedShippingFee);
  });
});

function updateShippingFee(shippingFee) {
  const parsedShippingFee = parseFloat(shippingFee);
  const totalPrice = parsedShippingFee + parseFloat(hiddenTotal);
  const formattedShippingFee = parsedShippingFee.toFixed(0).replace(/\d(?=(\d{3})+$)/g, '$&,');
  const formattedTotalPrice = totalPrice.toFixed(0).replace(/\d(?=(\d{3})+$)/g, '$&,');
  document.getElementById('shipping-fee').innerHTML = formattedShippingFee;
  document.getElementById('total-price-all-product').innerHTML = formattedTotalPrice + '₫';
}

