

// _________________________________API CALL_______________________________________

// ________________________________


// Get the select fields
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
        option.setAttribute('data-name', `${province.name}`);
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
        option.setAttribute('data-name', `${district.name}`);
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
        option.setAttribute('data-name', `${ward.name}`);
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



//__________________________OPTION__________________________________________
// Get references to the relevant elements
const codRadio = document.querySelector('.shipping-info-left-form-delivery-home input[type="radio"]');
const otherRadio = document.querySelector('.shipping-info-left-form-delivery-home-new input[type="radio"]');
const codDiv = document.querySelector('.shipping-info-left-form-delivery-address-option');
const otherDiv = document.querySelector('.shipping-info-left-form-delivery-store-info');

// Add event listeners to the radio buttons
codRadio.addEventListener('click', function() {
  codDiv.style.display = 'block';
  otherDiv.style.display = 'none';
});

otherRadio.addEventListener('click', function() {
  codDiv.style.display = 'none';
  otherDiv.style.display = 'block';
});