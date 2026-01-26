import static java.lang.Math.sqrt;

public class optimized_prime {
    public static void isPrime(int n){
        if(n==1){
            System.out.println("Special number"); 
        }
        else if (n==2) {
             System.out.println("Number is a prime number");
        }
        else{
            for(int i =2; i<=sqrt(n); i++ ){
            if(n%i == 0){
                System.out.println("Number is not a prime number");
                break;
            }
            else{
                System.out.println("Number is a prime number");
                break;
            }
        }
        }
        
    }
    public static void main(String s[]){
        int n = 64;
       isPrime(n);
    }
}

