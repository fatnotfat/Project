const app = {
    start: function () {
        this.handleEventFunction();
    },

    handleEventFunction: function () {
        const productItem = document.querySelector('.product__item');

        window.addEventListener('on')

    },

    hover: function (element) {
        element.setAttribute('src', 'https://i.pinimg.com/564x/2f/f9/0f/2ff90f557b508559ab62475296490b75.jpg');
    },

    unhover: function (element) {
        element.setAttribute('src', 'https://i.pinimg.com/564x/46/7c/a2/467ca2d7783149748b74ac84c5dc2079.jpg');
    }

}



app.start();

//// Wait for the page to finish loading
//$(document).ready(function () {
//
//    const categorySelect = document.querySelector('select[name="txtProductCateID"]');
//    const sizeSelect = document.querySelector('select[name="cboSize"]');
//
//    categorySelect.addEventListener('change', function () {
//        if (categorySelect.value === '1') {
//            sizeSelect.innerHTML = `
//            <option value="6">6</option>
//            <option value="7">7</option>
//            <option value="8">8</option>
//        `;
//        } else if (categorySelect.value === '2') {
//            sizeSelect.innerHTML = `
//            <option value="17">17</option>
//            <option value="18">18</option>
//            <option value="19">19</option>
//        `;
//        } else if (categorySelect.value === '3') {
//            sizeSelect.innerHTML = `
//            <option value="20">20</option>
//            <option value="21">21</option>
//            <option value="22">22</option>
//        `;
//        } else if (categorySelect.value === '4') {
//            sizeSelect.innerHTML = `
//            <option value="6">6</option>
//            <option value="7">7</option>
//            <option value="8">8</option>
//            <option value="17">17</option>
//            <option value="18">18</option>
//            <option value="19">19</option>
//            <option value="20">20</option>
//            <option value="21">21</option>
//            <option value="22">22</option>
//        `;
//        }
//    });
//
//
//});

