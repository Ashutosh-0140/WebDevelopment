let arr = [1,2,3,4,5]

const square = arr.map((el) => {
    return el**2;
});

const sum = arr.reduce((el, cur) => {
    return el + cur;
    
});

const Average = sum/5;

console.log(square)
console.log(sum)
console.log(Average)