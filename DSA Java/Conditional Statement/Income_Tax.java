import java.util.Scanner;

class Income_Tax {
    public static void main (String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        double income = sc.nextDouble();
        double tax ;

        if(income <= 500000){
            System.out.println("no tax");
        }
        else if(income > 500000 && income <= 1000000){
            tax = 0.2*income;
            System.out.println("your tax is " + tax);

        }
        else{
            tax = 0.3*income;
            System.out.println("your tax is " + tax);
        }
    }
}