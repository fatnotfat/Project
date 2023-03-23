//
//
//// ______________________________________ICON____________________________________________
//// Get references to the search tab and its content
//const searchTab = document.querySelector(".menu-icon-tab-search");
//const searchContent = document.querySelector(".menu-icon-tab-search-content");
//
//// Get references to the profile tab and its content
//const profileTab = document.querySelector(".menu-icon-tab-profile");
//const profileContent = document.querySelector(".menu-icon-tab-profile-content");
//
//// Get references to the cart tab and its content
//const cartTab = document.querySelector(".menu-icon-tab-cart");
//const cartContent = document.querySelector(".menu-icon-tab-cart-content");
//
//// Add a click event listener to the document
//document.addEventListener("click", function (e) {
//  // If the search tab or its content are not the target of the click event, hide the search content
//  if (!searchTab.contains(e.target) && !searchContent.contains(e.target)) {
//    searchContent.classList.remove("menu-icon-tab-search-content-active");
//  }
//
//  // If the profile tab or its content are not the target of the click event, hide the profile content
//  if (!profileTab.contains(e.target) && !profileContent.contains(e.target)) {
//    profileContent.classList.remove("menu-icon-tab-profile-content-active");
//  }
//
//  // If the cart tab or its content are not the target of the click event, hide the cart content
//  if (!cartTab.contains(e.target) && !cartContent.contains(e.target)) {
//    cartContent.classList.remove("menu-icon-tab-cart-content-active");
//  }
//});
//
//// Add a click event listener to the search tab
//searchTab.addEventListener("click", function () {
//  // Toggle the visibility of the search content when the search tab is clicked
//  searchContent.classList.toggle("menu-icon-tab-search-content-active");
//  // Hide the profile and cart content
//  profileContent.classList.remove("menu-icon-tab-profile-content-active");
//  cartContent.classList.remove("menu-icon-tab-cart-content-active");
//});
//
//// Add a click event listener to the profile tab
//profileTab.addEventListener("click", function () {
//  // Toggle the visibility of the profile content when the profile tab is clicked
//  profileContent.classList.toggle("menu-icon-tab-profile-content-active");
//  // Hide the search and cart content
//  searchContent.classList.remove("menu-icon-tab-search-content-active");
//  cartContent.classList.remove("menu-icon-tab-cart-content-active");
//});
//
//// Add a click event listener to the cart tab
//cartTab.addEventListener("click", function () {
//  // Toggle the visibility of the cart content when the cart tab is clicked
//  cartContent.classList.toggle("menu-icon-tab-cart-content-active");
//  // Hide the search and profile content
//  searchContent.classList.remove("menu-icon-tab-search-content-active");
//  profileContent.classList.remove("menu-icon-tab-profile-content-active");
//});
//
//// ____________________________CATEGORY_______________________________________________
//const menuLink = document.querySelector('.menu-link-category');
//const dropdown = document.querySelector('.menu-link-category-tab');
//
//// toggle the dropdown when the menu link is clicked
//menuLink.addEventListener('click', () => {
//  dropdown.classList.toggle('active');
//});
//
//// hide the dropdown when the user clicks outside of it
//document.addEventListener('click', (event) => {
//  if (!menuLink.contains(event.target) && !dropdown.contains(event.target)) {
//    dropdown.classList.remove('active');
//  }
//});
//
//// __________________________________NAV-RESPONSIVE_____________________________________
//const menuIcon = document.querySelector(".menu-responsive-icon-img-bar");
//const navBot = document.querySelector(".nav-bot");
//const menu = document.querySelector(".menu");
//
//
//menuIcon.addEventListener("click", () => {
//  navBot.classList.toggle("active");
//  menu.classList.toggle("active");
//});
//
//// _________________________CART-RESPONSIVE_____________________________________________________
//const cartIcon = document.querySelector('.menu-responsive-icon-tab-cart');
//const cartContentR = document.querySelector('.menu-responsive-icon-tab-cart-content');
//
//// Function to toggle the cart content
//function toggleCartContent() {
//  cartContentR.classList.toggle('menu-responsive-icon-tab-cart-content-active');
//}
//
//// Event listener to show/hide the cart content
//cartIcon.addEventListener('click', function(e) {
//  e.stopPropagation();
//  toggleCartContent();
//});
//
//// Event listener to hide the cart content when clicked outside
//document.addEventListener('click', function() {
//  if (cartContentR.classList.contains('menu-responsive-icon-tab-cart-content-active')) {
//    toggleCartContent();
//  }
//});
//
//
//// _________________________________API CALL_______________________________________
//
//// ________________________________
//// Define the API endpoint URLs
//// Define the API endpoint URLs
//const provincesEndpoint = "https://provinces.open-api.vn/api/p";
//const districtsEndpoint = "https://provinces.open-api.vn/api/d?province_id=";
//const wardsEndpoint = "https://provinces.open-api.vn/api/w?district_id=";
//
//// Get the select fields
//const citySelect = document.getElementById("stored-city");
//const districtSelect = document.getElementById("stored-district");
//const wardSelect = document.getElementById("stored-ward");
//const citySearchInput = document.getElementById("city-search");
//const districtSearchInput = document.getElementById("district-search");
//const wardSearchInput = document.getElementById("ward-search");
//
//// Load the list of provinces
//fetch(provincesEndpoint)
//  .then(response => response.json())
//  .then(provinces => {
//    // Populate the city select field with the list of provinces
//    provinces.forEach(province => {
//      const option = document.createElement("option");
//      option.text = province.name;
//      option.value = province.id;
//      citySelect.add(option);
//    });
//  });
//
//// Add an event listener to the city select field
//citySelect.addEventListener("change", function () {
//  // Clear the district and ward select fields
//  districtSelect.innerHTML = '<option value="">Select District</option>';
//  wardSelect.innerHTML = '<option value="">Select Ward</option>';
//
//  // Get the selected city/town
//  const selectedCityId = this.value;
//
//  // Load the list of districts for the selected city/town
//  fetch(districtsEndpoint + selectedCityId)
//    .then(response => response.json())
//    .then(districts => {
//      // Populate the district select field with the list of districts
//      districts.forEach(district => {
//        const option = document.createElement("option");
//        option.text = district.name;
//        option.value = district.id;
//        districtSelect.add(option);
//      });
//    });
//});
//
//// Add an event listener to the district select field
//districtSelect.addEventListener("change", function () {
//  // Clear the ward select field
//  wardSelect.innerHTML = '<option value="">-- Select Ward --</option>';
//
//  // Get the selected district
//  const selectedDistrictId = this.value;
//
//  // Load the list of wards for the selected district
//  fetch(wardsEndpoint + selectedDistrictId)
//    .then(response => response.json())
//    .then(wards => {
//      // Populate the ward select field with the list of wards
//      wards.forEach(ward => {
//        const option = document.createElement("option");
//        option.text = ward.name;
//        option.value = ward.id;
//        wardSelect.add(option);
//      });
//    });
//});
//
//// Add event listeners to the search input fields
//citySearchInput.addEventListener("input", function () {
//  const searchValue = this.value.toLowerCase();
//  const options = citySelect.options;
//  
//  for (let i = 0; i < options.length; i++) {
//    const optionText = options[i].text.toLowerCase();
//    if (optionText.includes(searchValue)) {
//      options[i].style.display = "block";
//    } else {
//      options[i].style.display = "none";
//    }
//  }
//});
//
//districtSearchInput.addEventListener("input", function () {
//  const searchValue = this.value.toLowerCase();
//  const options = districtSelect.options;
//  
//  for (let i = 0; i < options.length; i++) {
//    const optionText = options[i].text.toLowerCase();
//    if (optionText.includes(searchValue)) {
//      options[i].style.display = "block";
//    } else {
//      options[i].style.display = "none";
//    }
//  }
//});
//
//wardSearchInput.addEventListener("input", function () {
//  const searchValue = this.value.toLowerCase();
//  const options = wardSelect.options;
//  
//  for (let i = 0; i < options.length; i++) {
//    const optionText = options[i].text.toLowerCase();
//    if (optionText.includes(searchValue)) {
//      options[i].style.display = "block";
//    } else {
//      options[i].style.display = "none";
//    }
//  }
//});
//
//
//

// _____________________________________ICON___________________________________________
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

// ___________________________CATEGORY______________________________________________
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

// _________________________________NAV-RESPONSIVE____________________________________
const menuIcon = document.querySelector(".menu-responsive-icon-img-bar");
const navBot = document.querySelector(".nav-bot");
const menu = document.querySelector(".menu");


menuIcon.addEventListener("click", () => {
    navBot.classList.toggle("active");
    menu.classList.toggle("active");
});

// ________________________CART-RESPONSIVE____________________________________________________
const cartIcon = document.querySelector('.menu-responsive-icon-tab-cart');
const cartContentR = document.querySelector('.menu-responsive-icon-tab-cart-content');

// Function to toggle the cart content
function toggleCartContent() {
    cartContentR.classList.toggle('menu-responsive-icon-tab-cart-content-active');
}

// Event listener to show/hide the cart content
cartIcon.addEventListener('click', function (e) {
    e.stopPropagation();
    toggleCartContent();
});

// Event listener to hide the cart content when clicked outside
document.addEventListener('click', function () {
    if (cartContentR.classList.contains('menu-responsive-icon-tab-cart-content-active')) {
        toggleCartContent();
    }
});




//API
const provinceSelect = document.getElementById('stored-city');
const districtSelect = document.getElementById('stored-district');
const wardSelect = document.getElementById('stored-ward');
const dataNameInput = document.getElementById("txtCityDataName");
const dataNameInput2 = document.getElementById("txtDistrictDataName");
const dataNameInput3 = document.getElementById("txtWardDataName");


const getProvince = async () => {
    const data = await fetch('https://provinces.open-api.vn/api/p').then(response => response.json());
    data.forEach(province => {
        const option = document.createElement('option');
        option.value = province.code;
        option.text = province.name;
                option.setAttribute('data-name', ${province.name}
                );
        provinceSelect.appendChild(option);
    });

};

const getDistrict = async (key) => {
    const data = await fetch('https://provinces.open-api.vn/api/d').then(response => response.json());
    const districts = data.filter(district => district.province_code == key);
    districtSelect.innerHTML = '<option value="" disabled selected>Select District</option>';
    districts.forEach(district => {
        const option = document.createElement('option');
        option.value = district.code;
        option.text = district.name;
                option.setAttribute('data-name', ${district.name}
                );
        districtSelect.appendChild(option);
    });
    wardSelect.innerHTML = '<option value="" disabled selected>Select Ward</option>';
};

const getWard = async (key) => {
    const data = await fetch('https://provinces.open-api.vn/api/w').then(response => response.json());
    const wards = data.filter(ward => ward.district_code == key);
    wardSelect.innerHTML = '<option value="" disabled selected>Select Ward</option>';
    wards.forEach(ward => {
        const option = document.createElement('option');
        option.value = ward.code;
        option.text = ward.name;
                option.setAttribute('data-name', ${ward.name}
                );
        wardSelect.appendChild(option);
    });
};



provinceSelect.addEventListener('change', (event) => {
    const selectedProvinceName = event.target.value;
    if (selectedProvinceName) {
        getDistrict(selectedProvinceName);
    } else {
        districtSelect.innerHTML = '<option value="" disabled selected>Select District</option>';
        wardSelect.innerHTML = '<option value="" disabled selected>Select Ward</option>';
    }
});

districtSelect.addEventListener('change', (event) => {
    const selectedDistrictName = event.target.value;
    if (selectedDistrictName) {
        getWard(selectedDistrictName);
    } else {
        wardSelect.innerHTML = '<option value="" disabled selected>Select Ward</option>';
    }
});

getProvince();


provinceSelect.addEventListener("change", () => {
    const selectedOption = provinceSelect.options[provinceSelect.selectedIndex];
    const dataNameValue = selectedOption.getAttribute("data-name");
    dataNameInput.value = dataNameValue;
});

districtSelect.addEventListener("change", () => {
    const selectedOption = districtSelect.options[districtSelect.selectedIndex];
    const dataNameValue = selectedOption.getAttribute("data-name");
    dataNameInput2.value = dataNameValue;
});


wardSelect.addEventListener("change", () => {
    const selectedOption = wardSelect.options[wardSelect.selectedIndex];
    const dataNameValue = selectedOption.getAttribute("data-name");
    dataNameInput3.value = dataNameValue;
});