function greet(name = 'Guest'){
    return console.log("good morning",name)
};

greet()


// spread operator

const arr=[1,2,3,4,5]
console.log(Math.min(...arr));



function sum(...numbers) {
  return numbers.reduce((total, num) => total + num, 0);
}

console.log(sum(1, 2, 3)); // Output: 6
console.log(sum(10, 20, 30, 40)); // Output: 100


let player =["a", "b", "c", "d", "e"]
let [winner, runnerup, ...other] = player;
