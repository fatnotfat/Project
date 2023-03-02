

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


// // DATA_______________________________________
// const cityData = {
//   "Hồ Chí Minh": {
//     districts: [
//       "District 1",
//       "District 2",
//       "District 3",
//       "District 4",
//       "District 5",
//     ],
//     wards: {
//       "District 1": ["Ward 1", "Ward 2", "Ward 3", "Ward 4"],
//       "District 2": ["Ward 5", "Ward 6", "Ward 7", "Ward 8"],
//       "District 3": ["Ward 9", "Ward 10", "Ward 11", "Ward 12"],
//       "District 4": ["Ward 13", "Ward 14", "Ward 15", "Ward 16"],
//       "District 5": ["Ward 17", "Ward 18", "Ward 19", "Ward 20"],
//     },
//   },
//   "Hà Nội": {
//     districts: ["Ba Đình", "Hoàn Kiếm", "Hai Bà Trưng", "Đống Đa", "Tây Hồ"],
//     wards: {
//       "Ba Đình": ["Trúc Bạch", "Vĩnh Phúc", "Cống Vị", "Liễu Giai"],
//       "Hoàn Kiếm": ["Phan Chu Trinh", "Hàng Bạc", "Lý Thái Tổ", "Tràng Tiền"],
//       "Hai Bà Trưng": ["Bạch Đằng", "Lạc Trung", "Nguyễn Du", "Thái Thịnh"],
//       "Đống Đa": ["Cát Linh", "Láng Hạ", "Quốc Tử Giám", "Khâm Thiên"],
//       "Tây Hồ": ["Thụy Khuê", "Xuân La", "Quảng An", "Phú Thượng"],
//     },
//   },
// };
// // DATA______________________________________________________________________________
// const citySelect = document.getElementById("stored-city");
// const districtSelect = document.getElementById("stored-district");
// const wardSelect = document.getElementById("stored-ward");

// // Populate district options based on the selected city
// citySelect.addEventListener("change", () => {
//   const selectedCity = citySelect.value;
//   const districtOptions = cityData[selectedCity].districts.map(
//     (district) => `<option value="${district}">${district}</option>`
//   );
//   districtSelect.innerHTML = `<option value="">-- Select District --</option>${districtOptions}`;
//   wardSelect.innerHTML = '<option value="">-- Select Ward --</option>';
// });

// // Populate ward options based on the selected district
// districtSelect.addEventListener("change", () => {
//   const selectedCity = citySelect.value;
//   const selectedDistrict = districtSelect.value;
//   const wardOptions = cityData[selectedCity].wards[selectedDistrict].map(
//     (ward) => `<option value="${ward}">${ward}</option>`
//   );
//   wardSelect.innerHTML = `<option value="">-- Select Ward --</option>${wardOptions}`;
// });

// _______________________API CALL_____________________________________________
/**
 * 1. First, let's add an event listener to the city select element,
 *  so we can fetch the list of districts and 
 * update the district select element accordingly:
 */
// const citySelect = document.querySelector("#stored-city");
// const districtSelect = document.querySelector("#stored-district");

// citySelect.addEventListener("change", () => {
//   const selectedCityCode =
//     citySelect.options[citySelect.selectedIndex].getAttribute("data-code");
//   fetch(
//     `https://vapi.vnappmob.com/api/v2.0/location/districts/${selectedCityCode}`
//   )
//     .then((response) => response.json())
//     .then((data) => {
//       // Clear current options
//       districtSelect.innerHTML = "";
//       // Add new options
//       data.results.forEach((district) => {
//         const option = document.createElement("option");
//         option.value = district.name_with_type;
//         option.textContent = district.name_with_type;
//         districtSelect.appendChild(option);
//       });
//       // Trigger change event on district select to update ward options
//       districtSelect.dispatchEvent(new Event("change"));
//     });
// });
/**
 * This code will fetch the list of districts for the
 *  selected city and update the district select element with the new options.
 */
/**
 2. Now let's add another event listener to the district select element 
 to fetch the list of wards and update the ward select element accordingly:
 */
//  const wardSelect = document.querySelector('#stored-ward');

//  districtSelect.addEventListener('change', () => {
//    const selectedDistrict = districtSelect.options[districtSelect.selectedIndex].value;
//    const selectedCityCode = citySelect.options[citySelect.selectedIndex].getAttribute('data-code');
//    fetch(`https://vapi.vnappmob.com/api/v2.0/location/wards?district_id=${selectedDistrict}&province_id=${selectedCityCode}`)
//      .then(response => response.json())
//      .then(data => {
//        // Clear current options
//        wardSelect.innerHTML = '';
//        // Add new options
//        data.results.forEach(ward => {
//          const option = document.createElement('option');
//          option.value = ward.name_with_type;
//          option.textContent = ward.name_with_type;
//          wardSelect.appendChild(option);
//        });
//      });
//  });
 // Define your data object
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


// const storedCity = document.getElementById("stored-city");
// const storedDistrict = document.getElementById("stored-district");
// const storedWard = document.getElementById("stored-ward");

// function getProvinces() {
//   return fetch("https://provinces.open-api.vn/api/?depth=2")
//     .then(response => response.json())
//     .then(data => {
//       const provinces = data.filter(item => item.type === "tinh");
//       storedCity.innerHTML = `<option value="null" data-code="null" value="null">Choose Province / city</option>` + 
//                               provinces.map(item => `<option data-code="${item.code}" value="${item.id}">${item.name}</option>`).join("");
//     });
// }

// function getDistricts(cityId) {
//   return fetch(`https://provinces.open-api.vn/api/?depth=2&parent=${cityId}`)
//     .then(response => response.json())
//     .then(data => {
//       const districts = data.filter(item => item.type === "huyen");
//       storedDistrict.innerHTML = `<option value="">Choose District</option>` + 
//                                   districts.map(item => `<option data-code="${item.code}" value="${item.id}">${item.name}</option>`).join("");
//     });
// }

// function getWards(districtId) {
//   return fetch(`https://provinces.open-api.vn/api/?depth=2&parent=${districtId}`)
//     .then(response => response.json())
//     .then(data => {
//       const wards = data.filter(item => item.type === "xa");
//       storedWard.innerHTML = `<option value="">Choose Ward</option>` + 
//                                 wards.map(item => `<option data-code="${item.code}" value="${item.id}">${item.name}</option>`).join("");
//     });
// }

// getProvinces();

// storedCity.addEventListener("change", () => {
//   const selectedCity = storedCity.options[storedCity.selectedIndex];
//   const cityId = selectedCity.value;
//   if (cityId) {
//     getDistricts(cityId);
//   } else {
//     storedDistrict.innerHTML = "<option value=''>Choose District</option>";
//     storedWard.innerHTML = "<option value=''>Choose Ward</option>";
//   }
// });

// storedDistrict.addEventListener("change", () => {
//   const selectedDistrict = storedDistrict.options[storedDistrict.selectedIndex];
//   const districtId = selectedDistrict.value;
//   if (districtId) {
//     getWards(districtId);
//   } else {
//     storedWard.innerHTML = "<option value=''>Choose Ward</option>";
//   }
// });

