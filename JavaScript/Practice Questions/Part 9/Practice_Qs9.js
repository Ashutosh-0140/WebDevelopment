let para1 = document.createElement("p");
para1.innerText = "Hi I am Ashu!"
document.querySelector('body').append(para1)

para1.classList.add("red")


let h3 = document.createElement("h3");
h3.innerText = "Hi I am Ashu!"
document.querySelector('body').append(h3)

h3.classList.add("blue")


let div = document.createElement("div");
let h1 = document.createElement("h1");
let para = document.createElement("p");

h1.innerText ="I am in inner div";
para.innerText = "I also";

div.classList.add("box")
div.append(h1);
div.append(para);
document.querySelector('body').append(div)
