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
