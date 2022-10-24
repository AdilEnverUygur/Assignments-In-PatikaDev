let fullName = prompt("Adinizni Giriniz:");

let myName = document.querySelector("#myName");

myName.innerHTML = `${myName.innerHTML} <span>${fullName}</span>`;

function showTime(){
    var date = new Date();
    var hour = date.getHours(); // 0 - 23
    var minute = date.getMinutes(); // 0 - 59
    var second = date.getSeconds(); // 0 - 59
    var day = date.getDay();
    hour = (hour < 10) ? "0" + hour : hour;
    minute = (minute < 10) ? "0" + minute : minute;
    second = (second < 10) ? "0" + second : second;

    if ( day == 1) {
        day = "Pazartesi";
    } else if ( day == 2) {
        day = "Salı";
    } else if ( day == 3) {
        day = "Çarşamba";
    } else if ( day == 4) {
        day = "Perşembe";
    } else if ( day == 5) {
        day = "Cuma";
    } else if ( day == 6) {
        day = "Cumartesi";
    } else if ( day == 0) {
        day = "Pazar";
    }
    
    var time = hour + ":" + minute + ":" + second + " " + day ;
    document.getElementById("myClock").innerText = time;
    document.getElementById("myClock").textContent = time;
    
    setTimeout(showTime, 1000);
    
}

showTime();


