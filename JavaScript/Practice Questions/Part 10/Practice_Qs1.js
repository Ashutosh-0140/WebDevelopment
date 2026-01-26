// let input = document.querySelector("input");
// input.addEventListener("mouseout", function(){
//     alert("mouse out")
// });

// input.addEventListener("keypress", function(){
//     alert("Key pressed")
// });
// let p = document.querySelector("P");
// p.addEventListener("scroll", function(){
//     alert("You scrolled");
// });

// let button = document.createElement("button");

// button.textContent ="Click me"

// document.body.appendChild(button);



// button.addEventListener("click", function() {
//     this.style.backgroundColor = "red";
//     this.textContent = "Color Changed!";
// });


let input = document.querySelector("input");
let h2 = document.querySelector("h2");
input.addEventListener("input", function(event){
    let inputValue = event.target.value;
    const lettersOnlyRegex = /^[a-zA-Z]*$/;
    if (lettersOnlyRegex.test(inputValue)) {
        h2.textContent = inputValue;
    }
})
