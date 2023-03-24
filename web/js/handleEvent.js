

const payButton = document.querySelector('.your-cart-body-right-order-btn');
const payButtonHeader = document.querySelector('.pay-button');


payButtonHeader.addEventListener('click', (event) => {
    if (document.getElementById('cart-size-header') !== null) {
        const cartSizeValue = document.getElementById('cart-size-header').textContent;
        if (cartSizeValue > 0) {
            event.preventDefault(); // prevent the default form submission behavior
            window.location.href = 'shippingPage'; // navigate to the shipping page
        } else {
            // cart is empty, show alert message
            alert('You must add some product first!!');
            event.preventDefault(); // prevent the form from submitting
        }
    } else {
        // cart is empty, show alert message
        alert('You must add some product first!!');
        event.preventDefault(); // prevent the form from submitting
    }
});

payButton.addEventListener('click', (event) => {
    const cartSizeValue = document.getElementById('cart-size').textContent;
    if (cartSizeValue > 0) {
        // cart has items, proceed to shippingPage
        event.preventDefault(); // prevent the default form submission behavior
        window.location.href = 'shippingPage'; // navigate to the shipping page
    } else {
        // cart is empty, show alert message
        alert('You must add some product first!!');
        event.preventDefault(); // prevent the form from submitting
    }
});








