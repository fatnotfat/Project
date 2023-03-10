const stars=document.querySelectorAll('.star');
const current_rating=document.querySelector('.current-rating');

stars.forEach((star,index)=>{
  star.addEventListener('click',()=>{

    let current_star=index+1;
    current_rating.innerText=`${current_star} of 5`;

    stars.forEach((star,i)=>{
        if(current_star>=i+1){
          star.innerHTML='&#9733;';
        }else{
          star.innerHTML='&#9734;';
        }
    });

  });
});
// __________________________________TOTAL____________________________
function displayTotalReviewStar(reviews) {
     let totalRating = 0;
     let totalStars = 0;
   
     reviews.forEach(review => {
       totalRating += review.rating;
       totalStars += 5;
     });
   
     const averageRating = totalRating / reviews.length;
     const roundedRating = Math.round(averageRating * 2) / 2; // round to nearest 0.5
     const totalStarCount = totalStars;
   
     const starHtml = `<i class="fas fa-star"></i>`;
     const halfStarHtml = `<i class="fas fa-star-half-alt"></i>`;
     const emptyStarHtml = `<i class="far fa-star"></i>`;
   
     let starRatingHtml = "";
   
     for (let i = 1; i <= 5; i++) {
       if (i <= roundedRating) {
         starRatingHtml += starHtml;
       } else if (i === Math.ceil(roundedRating) && roundedRating % 1 !== 0) {
         starRatingHtml += halfStarHtml;
       } else {
         starRatingHtml += emptyStarHtml;
       }
     }
   
     document.getElementById("total-review-star").innerHTML = starRatingHtml;
     document.getElementById("total-star-count").innerHTML = `${totalStarCount} total stars`;
   }
// _____________________________________SHOW TO INPUT__________________________________________
const writeReviewBtn = document.querySelector(".product__item-info-review-btn-input");
const reviewContent = document.querySelector(".product__item-info-review-content");

writeReviewBtn.addEventListener("click", () => {
  reviewContent.classList.toggle("show");
});
