function showCreateAccount() {
    const formIncludeCreate = document.querySelector('.form__create');
    if (formIncludeCreate.classList.contains("active")) {
        formIncludeCreate.classList.remove('active')
    } else {
        formIncludeCreate.classList.add('active')

    }

}

// Validation 
function Validator(options) {

    function getParent(element, selector) {
        while (element.parentElement) {
            if (element.parentElement.matches(selector)) {
                return element.parentElement
            }
            element = element.parentElement;
        }
    }


    var selectorRules = {};

    //Validate 
    function validate(inputElement, rule) {
        // var errorMessage = rule.test(inputElement.value)
        // vd var errorElement = getParent(inputElement, 'form-group)
        var errorMessage
        var errorElement = inputElement.parentElement.querySelector(options.errorSelector)

        // Lấy ra các rule của chính selector
        var rules = selectorRules[rule.selector];
        //Lặp qua từng rule và kiểm tra , nếu có lỗi thì dừng việc kiểm tra
        for (var i = 0; i < rules.length; ++i) {
            errorMessage = rules[i](inputElement.value)
            if (errorMessage) {
                break;
            }
        }

        if (errorMessage) {
            errorElement.innerText = errorMessage
            errorElement.classList.add('invalid')
        } else {
            errorElement.innerText = ''
            errorElement.classList.remove('invalid')

        }
        return !errorMessage;
    }

    function validateInputChange(inputElement, rule) {
        var errorMessage = rule.test(inputElement.value)
        var errorElement = inputElement.parentElement.querySelector('.form__message')


        errorElement.innerText = ''
        errorElement.classList.remove('invalid')

    }


    // Lấy element của form 
    var formElement = document.querySelector(options.form);
    if (formElement) {
        // Khi submit form ko bị chuyển trang
        formElement.onsubmit = function (e) {
            e.preventDefault();

            var isFormValid = true
            // lặp qua từng rules và validate
            options.rules.forEach(function (rule) {
                var inputElement = formElement.querySelector(rule.selector);
                var isValid = validate(inputElement, rule);
                if (!isValid) {
                    isFormValid = false;
                }
            });


            if (isFormValid) {
                // Trường hợp submit với js
                if (typeof options.onSubmit === 'function') {
                    //
                    var enableInputs = formElement.querySelectorAll('[name]');
                    var formValues = Array.from(enableInputs).reduce(function (values, input) {
                        values[input.name] = input.value
                        return values;
                    }, {});

                    options.onsubmit(formValues)
                } else {
                    // trường hợp submit với yêu cầu mặc định
                    formElement.submit();
                }
            }
        }

        //Xử lí lặp qua mỗi rule xử lí blur ra ngoài, input, .....
        options.rules.forEach(function (rule) {

            // Lưu lại các rules cho mỗi input vào
            if (Array.isArray(selectorRules[rule.selector])) {
                selectorRules[rule.selector].push(rule.test)
            } else {
                selectorRules[rule.selector] = [rule.test]
            }

            var inputElement = formElement.querySelector(rule.selector);

            if (inputElement) {
                // Xử lí blur ra khỏi ô input
                inputElement.onblur = function () {
                    validate(inputElement, rule);

                }

                inputElement.oninput = function () {
                    validateInputChange(inputElement, rule)
                }
            }
        });

        // console.log(selectorRules)
    }

}


// Khi có lỗi trả ra message lỗi
// Khi hợp lệ ko trả ra cái gì (undifined)
Validator.isRequired = function (selector, message) {
    return {
        selector: selector,
        test: function (value) {
            return value.trim() ? undefined : message
        }
    }
}


Validator.isName = function (selector, message) {
    return {
        selector: selector,
        test: function (value) {
            var regex = /[a-zA-Z]+$/;
            return regex.test(value) ? undefined : message || "Tên vui lòng không có kí tự đặc biệt hoặc số nhé!"
        }
    }
}


Validator.isPhone = function (selector, message) {
    return {
        selector: selector,
        test: function (value) {
            var regex = /^[0-9]+$/;
            return regex.test(value) ? undefined : message || "Vui lòng nhập chữ số nhé!"
        }
    }
}

Validator.isMinNumberPhone = function (selector, min, message) {
    return{
        selector: selector,
        test: function (value) {
            return value.length >= min ? undefined : message || `Số điện thoại bao gồm ${min} số nhé!`
        }
    }
}


Validator.isEmail = function (selector, message) {
    return {
        selector: selector,
        test: function (value) {
            var regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

            return regex.test(value) ? undefined : message || "Vui lòng nhập Email"
        }
    }
}


Validator.minLength = function (selector, min, message) {
    return {
        selector: selector,
        test: function (value) {

            return value.length >= min ? undefined : message || `Vui lòng nhập tối thiểu ${min} kí tự`
        }
    }
}

Validator.isComfirmed = function (selector, getConfirmValue, message) {
    return {
        selector: selector,
        test: function (value) {
            return value === getConfirmValue() ? undefined : message || "Giá trị nhập vào không chính xác"
        }
    }
}

