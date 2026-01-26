import java.util.Scanner;

class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        float average = (a + b + c) / 2.0f;

        System.out.println("Average is " + average);
    }
}