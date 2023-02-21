

const app = {
        start: function () {
                this.handleEventFunction();
        },

        handleEventFunction: function () {
                window.addEventListener('scroll', () => {
                        console.log(window.pageYOffset)
                })
        }

       
}


app.start();

function showCategory() {
        const categoryList = document.querySelector('.iphone__filter');
        const buttonFilter = document.querySelector('.show__filter-button');
        var messageClose = "Close Filter"
        var messageOpen = "Show Filter"
        categoryList.classList.toggle('active')

        window.addEventListener('click', () => {

        })
}