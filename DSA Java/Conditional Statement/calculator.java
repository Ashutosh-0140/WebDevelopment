import java.util.Scanner;

class calculator{
    public static void main(String s[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first operand:");
        int a = sc.nextInt();

        System.out.println("Enter second operand:");
        int b = sc.nextInt();

        System.out.println("Enter operator:");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+' : System.out.println("The addition is"+(a+b));
            break;
            case '-' : System.out.println("The addition is"+(a-b));
            break;
            case '*' : System.out.println("The addition is"+(a*b));
            break;
            case '/' : System.out.println("The addition is"+(a/b));
            break;
            case '%' : System.out.println("The addition is"+(a%b));
            break;
        }

    }
}