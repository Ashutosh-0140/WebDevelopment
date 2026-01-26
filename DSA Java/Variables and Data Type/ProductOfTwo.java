import java.util.Scanner;
class ProductOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();

        System.out.println("Product is "+a*b);
    }
}