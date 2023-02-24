const app = {
    start: function(){
        this.handleEventFunction();
    },

    handleEventFunction: function(){
        
        const imgProduct1 = document.querySelector('.product_secondline-img');
        const contentProduct1 = document.querySelector('.product-content-1');
        const sizeProduct1 = document.querySelector('.product-size-1');
        const buyProduct1 = document.querySelector('.product-buy-1');
        const imgProduct2 = document.querySelector('.product_thirdline-img');
        const contentProduct2 = document.querySelector('.product-content-2');
        const sizeProduct2 = document.querySelector('.product-size-2');
        const buyProduct2 = document.querySelector('.product-buy-2');
        const outStadingContentTitleFirst = document.querySelector('.content__first-title')
        const outStadingContentTitleSecond = document.querySelector('.content__second-title')
        const outStadingContentTitleThird = document.querySelector('.content__third-title')
        const frameImageFirst = document.querySelector('.frame__first-img');
        const frameImageSecond = document.querySelector('.frame__second-img');
        const frameImageThird = document.querySelector('.frame__third-img');
        const contentComfortTitle = document.querySelector('.content-comfort-title');
        const contentComfortInfo = document.querySelector('.content-comfort-info');
        const contentGoldInfo = document.querySelector('.content-gold-info');
        const contentTrendInfo = document.querySelector('.content-trend-info');


        
        
        
        window.addEventListener("scroll", () => {
            console.log(window.pageYOffset)
            
            if(window.pageYOffset > 500){
                imgProduct1.classList.add('active');
                contentProduct1.classList.add('active');
                sizeProduct1.classList.add('active');
                buyProduct1.classList.add('active');
                
            }
            
            if(window.pageYOffset > 1250){
                sizeProduct2.classList.add('active');
                buyProduct2.classList.add('active');
                imgProduct2.classList.add('active');
                contentProduct2.classList.add('active');

            }

            if(window.pageYOffset > 1800){
               outStadingContentTitleFirst.classList.add('active');
               frameImageFirst.classList.add('active')
               contentComfortTitle.classList.add('active')
               contentComfortInfo.classList.add('active')
            }

            if(window.pageYOffset > 2500){
                console.log( frameImageSecond)
               outStadingContentTitleSecond.classList.add('active');
               frameImageSecond.classList.add('active')
               contentGoldInfo.classList.add('active')
            }

            if(window.pageYOffset > 3200){
                console.log( outStadingContentTitleFirst)
               outStadingContentTitleThird.classList.add('active');
               frameImageThird.classList.add('active')
               contentTrendInfo.classList.add('active')
                
            }

        })

    }
}


app.start();
