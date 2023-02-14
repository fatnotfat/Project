const navtabBtnList = document.querySelectorAll(".navtab-btn"); 
const navtabContentList = document.querySelectorAll(".tab-content-item");
//
navtabBtnList.forEach((btn)=>{
    btn.addEventListener("click", event =>{
        //xóa hết actived trên các nút 
        navtabBtnList.forEach((_btn)=>{
            _btn.classList.remove("actived"); 
        });
        //thêm actived vào nút vừa bị nhấn 
        event.target.classList.add("actived");
        //xóa actived trên content 
        navtabContentList.forEach((contentTab) =>{
            contentTab.classList.remove("actived"); 
        }); 
        document
        .querySelector(
            `.tab-content-item[data-content='${event.target.id}']`
            )
        .classList.add("actived");
    });
});