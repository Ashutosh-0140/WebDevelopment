let btn = document.querySelector("button");

let input = document.querySelector("input");

input.addEventListener("keydown", function(){
    console.log("Key was pressed");
});

input.addEventListener("keyup", function(){
    console.log("Key was released");
});

btn.addEventListener("click", function(e){
    console.log(e);
    console.log("Button Clicked");
});

btn.addEventListener("dblclick", function(e){
    console.log(e);
    console.log("Button Clicked");
});