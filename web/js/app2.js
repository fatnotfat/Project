/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



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


// _________________________________API CALL_______________________________________

// ________________________________
// Define the API endpoint URLs
// Define the API endpoint URLs
const provincesEndpoint = "https://provinces.open-api.vn/api/p";
const districtsEndpoint = "https://provinces.open-api.vn/api/d?province_id=";
const wardsEndpoint = "https://provinces.open-api.vn/api/w?district_id=";

// Get the select fields
const citySelect = document.getElementById("stored-city");
const districtSelect = document.getElementById("stored-district");
const wardSelect = document.getElementById("stored-ward");
const citySearchInput = document.getElementById("city-search");
const districtSearchInput = document.getElementById("district-search");
const wardSearchInput = document.getElementById("ward-search");

// Load the list of provinces
fetch(provincesEndpoint)
  .then(response => response.json())
  .then(provinces => {
    // Populate the city select field with the list of provinces
    provinces.forEach(province => {
      const option = document.createElement("option");
      option.text = province.name;
      option.value = province.id;
      citySelect.add(option);
    });
  });

// Add an event listener to the city select field
citySelect.addEventListener("change", function () {
  // Clear the district and ward select fields
  districtSelect.innerHTML = '<option value="">Select District</option>';
  wardSelect.innerHTML = '<option value="">Select Ward</option>';

  // Get the selected city/town
  const selectedCityId = this.value;

  // Load the list of districts for the selected city/town
  fetch(districtsEndpoint + selectedCityId)
    .then(response => response.json())
    .then(districts => {
      // Populate the district select field with the list of districts
      districts.forEach(district => {
        const option = document.createElement("option");
        option.text = district.name;
        option.value = district.id;
        districtSelect.add(option);
      });
    });
});

// Add an event listener to the district select field
districtSelect.addEventListener("change", function () {
  // Clear the ward select field
  wardSelect.innerHTML = '<option value="">-- Select Ward --</option>';

  // Get the selected district
  const selectedDistrictId = this.value;

  // Load the list of wards for the selected district
  fetch(wardsEndpoint + selectedDistrictId)
    .then(response => response.json())
    .then(wards => {
      // Populate the ward select field with the list of wards
      wards.forEach(ward => {
        const option = document.createElement("option");
        option.text = ward.name;
        option.value = ward.id;
        wardSelect.add(option);
      });
    });
});

// Add event listeners to the search input fields
citySearchInput.addEventListener("input", function () {
  const searchValue = this.value.toLowerCase();
  const options = citySelect.options;
  
  for (let i = 0; i < options.length; i++) {
    const optionText = options[i].text.toLowerCase();
    if (optionText.includes(searchValue)) {
      options[i].style.display = "block";
    } else {
      options[i].style.display = "none";
    }
  }
});

districtSearchInput.addEventListener("input", function () {
  const searchValue = this.value.toLowerCase();
  const options = districtSelect.options;
  
  for (let i = 0; i < options.length; i++) {
    const optionText = options[i].text.toLowerCase();
    if (optionText.includes(searchValue)) {
      options[i].style.display = "block";
    } else {
      options[i].style.display = "none";
    }
  }
});

wardSearchInput.addEventListener("input", function () {
  const searchValue = this.value.toLowerCase();
  const options = wardSelect.options;
  
  for (let i = 0; i < options.length; i++) {
    const optionText = options[i].text.toLowerCase();
    if (optionText.includes(searchValue)) {
      options[i].style.display = "block";
    } else {
      options[i].style.display = "none";
    }
  }
});




