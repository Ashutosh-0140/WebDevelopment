let input = document.querySelector("input");
let button = document.querySelector("button");
let ul = document.querySelector("ul");

button.addEventListener("click", function(){
    let item = document.createElement("li");
    item.innerText = input.value;

    let btn = document.createElement("button");
    btn.innerText = "Delete";
    btn.classList.add("delete");
    item.appendChild(btn);
    ul.appendChild(item);
    input.value = "";
});


ul.addEventListener("click", function(e){
    if (e.target.nodeName == "BUTTON"){
        let listItem = e.target.parentElement;
        listItem.remove();
    }
})


// let btns = document.querySelectorAll(".delete"); // select buttons by class
// for (let bt of btns) {
//     bt.addEventListener("click", function() {
//         bt.parentElement.remove(); // remove the <li> that contains the button
//     });
// }
