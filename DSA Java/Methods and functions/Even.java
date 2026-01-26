import java.util.Scanner;

public class Even{
    public static void isEven(int n){
        if(n%2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is not even.");
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        isEven(n);
    }
}