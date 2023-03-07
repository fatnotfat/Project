
const provinceSelect = document.getElementById('province');
const districtSelect = document.getElementById('district');
const wardSelect = document.getElementById('ward');

const getProvince = async () => {
  const data = await fetch('https://provinces.open-api.vn/api/p').then(response => response.json());
  data.forEach(province => {
    const option = document.createElement('option');
    option.value = province.code;
    option.text = province.name;
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
    wardSelect.appendChild(option);
  });
};

provinceSelect.addEventListener('change', (event) => {
  const selectedProvinceCode = event.target.value;
  if (selectedProvinceCode) {
    getDistrict(selectedProvinceCode);
  } else {
    districtSelect.innerHTML = '<option value="" disabled selected>Select District</option>';
    wardSelect.innerHTML = '<option value="" disabled selected>Select Ward</option>';
  }
});

districtSelect.addEventListener('change', (event) => {
  const selectedDistrictCode = event.target.value;
  if (selectedDistrictCode) {
    getWard(selectedDistrictCode);
  } else {
    wardSelect.innerHTML = '<option value="" disabled selected>Select Ward</option>';
  }
});

getProvince();