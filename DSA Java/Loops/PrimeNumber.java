import java.util.Scanner;

class PrimeNumber {
public static void main(String s[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int num = sc.nextInt();

    int count = 0;
    if(num ==0 || num == 1){
        System.out.println("Special Number");
    }

    for(int i =1; i<=num/2; i++){
        if (num%i ==0){
            count += 1;
        }
    }

    if(count > 2){
        System.out.println(num+" is not a prime number.");
    }
    else{
        System.out.println(num+" is a prime number.");
    }
        

    }
}
    
