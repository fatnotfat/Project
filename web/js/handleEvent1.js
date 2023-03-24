/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

if (document.getElementById('search-button') !== null) {
    const searchInput = document.getElementById('search-button');

    searchInput.addEventListener('keydown', function (event) {
        const inputValue = searchInput.value.trim();

        if (event.keyCode === 13 && inputValue.length < 1) {
            // add your code here to handle the case where the user presses Enter
            // and the input value is not empty or only whitespace characters
            event.preventDefault();
            alert("Please input some word to find product!");
        }
    });
} else {
    event.preventDefault();
    alert("Please input some word to find product!");
}


