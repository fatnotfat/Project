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
