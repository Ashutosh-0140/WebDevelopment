let buttons = document.querySelectorAll("button");


for(btn of buttons){
    // btn.onclick = sayHello;
    btn.addEventListener("click", sayHello);
    btn.addEventListener("click", askName);
}



// button.onclick = function() {
//     alert("Insta like event");
// }

function sayHello(){
    alert("hello");
}

function askName(){
    alert("What is your name");
}

// button.onclick = sayHello;