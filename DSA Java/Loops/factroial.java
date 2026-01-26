import java.util.Scanner;

class factroial{
    public static void main(String s[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int fact = 1;
        
        for(int i = num; i>=1; i-- ){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is"+fact);
    }
}