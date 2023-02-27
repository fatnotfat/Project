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
const provincesEndpoint = "https://provinces.open-api.vn/api/p";
const districtsEndpoint = "https://provinces.open-api.vn/api/d?province_id=";
const wardsEndpoint = "https://provinces.open-api.vn/api/w?district_id=";

// Get the select fields
const citySelect = document.getElementById("stored-city");
const districtSelect = document.getElementById("stored-district");
const wardSelect = document.getElementById("stored-ward");

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

   
   