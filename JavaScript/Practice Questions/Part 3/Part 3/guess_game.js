const max = prompt("Enter max number");
console.log(max);


const random =Math.floor(Math.random*max)+1;

let guess=prompt("guess the number");

while(true){
    if(guess ="quit"){
        console.log("User quit");
        break;
    }
    if(guess=="random"){
        console.log("youare right");
        break;
    } else if(guess < random){
        guess=prompt("Guesconsole.logs is small enter a large number")
    }
    else {
        guess=prompt("Guess was too small try again")
    }

    // else {
    //    guess= prompt("Your guess was wrong try again");
    // }
}