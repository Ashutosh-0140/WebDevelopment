// const isEven = (num) => {
//     if(num%2 == 0){
//         console.log("Yes the number is even.");

//     }
//     else{
//         console.log("No the number is not even.");
//     }
// }

// let num = 7;
// console.log(isEven(num));



let nums = [10, 20, 30, 40, 30];
let Maxx = nums.every((el) => {
  return el % 10 ===0;
    
});
console.log(Maxx);