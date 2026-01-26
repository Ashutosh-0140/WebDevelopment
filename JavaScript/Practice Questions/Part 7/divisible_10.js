let nums = [10, 20, 30, 40, 30];
let Maxx = nums.every((el) => {
  return el % 10 ===0;
    
});
console.log(Maxx);