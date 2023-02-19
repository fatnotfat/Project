// ________________________________________NAVIGATION_____________________________________________________
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
// ________________________________________________VALIDATE_______________________________________

var firstName = document.querySelector("#first-name");
var lastName = document.querySelector("#last-name");
// var male = document.querySelector('#gender-male')
// var female = document.querySelector('#gender-female')
var date = document.querySelector("#date");
var email = document.querySelector("#email");
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
function checkEmail(input) {
  const regexEmail =
    /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
  input.value = input.value.trim();

  let isEmailError = !regexEmail.test(input.value);

  if (regexEmail.test(input.value)) {
    showSuccess(input);
  } else {
    showError(input, "Email Invalid!");
  }

  return isEmailError;
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
    email,
    password,
    confirmPassword,
  ]);
  let isEmailError = checkEmail(email);
  let isFirstNameLengthError = checkLengthError(firstName, 3, 10);
  let isLastnameLengthError = checkLengthError(lastName, 3, 10);
  let isPasswordLengthError = checkLengthError(password, 3, 10);
  let isMatchError = checkMatchPasswordError(password, confirmPassword);
  let isEmptyGender = checkEmptyGender(); 
  if (
    isEmptyError ||
    isEmailError ||
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