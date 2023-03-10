const reviews = [
     {
       name: "John",
       rating: 4,
       date: "2/28/2023",
       comment: "Good product"
     },
     {
       name: "Jane",
       rating: 5,
       date: "2/27/2023",
       comment: "Great product"
     }
   ];
   
   // Loop through each review and add up the number of stars
   let totalStars = 0;
   reviews.forEach(review => {
     totalStars += review.rating;
   });
   
   // Calculate the average rating
   const averageRating = Math.round(totalStars / reviews.length);
   
   // Update the HTML of the total stars element
   const totalStarsElement = document.getElementById("total-stars");
   totalStarsElement.innerHTML = `${averageRating} out of 5 stars`;
   