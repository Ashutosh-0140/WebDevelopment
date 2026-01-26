import java.util.Scanner;

class AreaOfSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side of the square:");
        int a = sc.nextInt();

        float area = a*a;

        System.out.println("Average is " + area);
    }
}