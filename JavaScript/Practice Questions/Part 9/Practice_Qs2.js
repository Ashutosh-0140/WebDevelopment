

let button = document.createElement("button");
let input = document.createElement("input");

button.innerText="Clickme";

document.querySelector("body").append(button);
document.querySelector("body").append(input);

button.setAttribute("id", "btn");
button.setAttribute("placeholder", "Username");

let h1 = document.createElement("h1");
h1.innerText="DOM Practice";
document.querySelector("body").append(h1);

let p = document.createElement("p");
p.innerHTML = "My Practice for <b> JavaScript <b/>";
document.querySelector("body").append(p);
