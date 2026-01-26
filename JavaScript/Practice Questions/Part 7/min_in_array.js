let nums = [10, 20, 30, 40, 30];
let Min = nums.reduce((el,min) => {
  if (min < el){
    return min;
  }
  else{
    return el;
  }
    
});
console.log(Min);