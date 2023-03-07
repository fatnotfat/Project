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
const menuLink = document.querySelector(".menu-link-category");
const dropdown = document.querySelector(".menu-link-category-tab");

// toggle the dropdown when the menu link is clicked
menuLink.addEventListener("click", () => {
  dropdown.classList.toggle("active");
});

// hide the dropdown when the user clicks outside of it
document.addEventListener("click", (event) => {
  if (!menuLink.contains(event.target) && !dropdown.contains(event.target)) {
    dropdown.classList.remove("active");
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
const cartIcon = document.querySelector(".menu-responsive-icon-tab-cart");
const cartContentR = document.querySelector(
  ".menu-responsive-icon-tab-cart-content"
);

// Function to toggle the cart content
function toggleCartContent() {
  cartContentR.classList.toggle("menu-responsive-icon-tab-cart-content-active");
}

// Event listener to show/hide the cart content
cartIcon.addEventListener("click", function (e) {
  e.stopPropagation();
  toggleCartContent();
});

// Event listener to hide the cart content when clicked outside
document.addEventListener("click", function () {
  if (
    cartContentR.classList.contains(
      "menu-responsive-icon-tab-cart-content-active"
    )
  ) {
    toggleCartContent();
  }
});

// ________________________________________________VALIDATE_______________________________________

var firstName = document.querySelector("#first-name");
var lastName = document.querySelector("#last-name");
// var male = document.querySelector('#gender-male')
// var female = document.querySelector('#gender-female')
var date = document.querySelector("#date");
var phone = document.querySelector("#phone");
var address = document.querySelector('#address')
var password = document.querySelector("#password");
var confirmPassword = document.querySelector("#confirm-password");
var form = document.querySelector("form");
// Ham show error
function showError(input, message) {
  let parent = input.parentElement;
  let small = parent.querySelector("small");

  parent.classList.add("error");
  small.innerText = message;
}
// Ham show no error
function showSuccess(input) {
  let parent = input.parentElement;
  let small = parent.querySelector("small");

  parent.classList.remove("error");
  small.innerText = "";
}
// Ham kiem tra empty
function checkEmptyError(listInput) {
  let isEmptyError = false;
  listInput.forEach((input) => {
    input.value = input.value.trim();

    if (!input.value) {
      isEmptyError = true;
      showError(input, "Does not allow empty!");
    } else {
      showSuccess(input);
    }
  });
  return isEmptyError;
}
// Ham kiem tra email
function checkPhone(input) {
  const regexPhone =
    /^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$/i;
  input.value = input.value.trim();

  let isPhoneError = !regexPhone.test(input.value);

  if (regexPhone.test(input.value)) {
    showSuccess(input);
  } else {
    showError(input, "Phone Invalid!");
  }

  return isPhoneError;
}
// Ham kiem tra do dai ki tu
function checkLengthError(input, min, max) {
  input.value = input.value.trim();

  if (input.value.length < min) {
    showError(input, `Must contain at least ${min} characters`);
    return true;
  }
  if (input.value.length > max) {
    showError(input, `No more than ${max} characters`);
    return true;
  }

  return false;
}
// Ham kiem tra confirm password
function checkMatchPasswordError(passwordInput, cfPasswordInput) {
  if (passwordInput.value !== cfPasswordInput.value) {
    showError(cfPasswordInput, "Password does not match");
    return true;
  }

  return false;
}
// Ham check gender
// function checkEmptyGender() {
//   const radios = document.getElementsByName("gender");

//   let isValid = false;

//   for (let i = 0; i < radios.length; i++) {
//     if (radios[i].checked) {
//       isValid = true;
//       break;
//     }
//   }

//   if (!isValid) {
//     showError(radios[0], "Please select a gender");
//     return false;
//   }

//   return true;
// }

form.addEventListener("submit", function (e) {
  e.preventDefault();

  let isEmptyError = checkEmptyError([
    firstName,
    lastName,
    date,
    phone,
    address,
    password,
    confirmPassword,
  ]);
  let isPhoneError = checkPhone(phone);
  let isFirstNameLengthError = checkLengthError(firstName, 3, 10);
  let isLastnameLengthError = checkLengthError(lastName, 3, 10);
  let isPasswordLengthError = checkLengthError(password, 3, 10);
  let isMatchError = checkMatchPasswordError(password, confirmPassword);
  let isEmptyGender = checkEmptyGender();
  if (
    isEmptyError ||
    isPhoneError ||
    isPasswordLengthError ||
    isMatchError ||
    isFirstNameLengthError ||
    isLastnameLengthError
  ) {
    //do nothing
  } else {
    //logic, call API, gọi service, .....
  }
});
