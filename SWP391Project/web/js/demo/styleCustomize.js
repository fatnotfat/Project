

function showCalendarMonth(){
    const calendarSearch = document.querySelector(".calendar_search");
    const calendarButton = document.querySelector(".fa-calendar");
    calendarButton.classList.toggle("text-gray-600")
        calendarSearch.classList.toggle("active");
}