import java.util.Scanner;

public class larger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number ");
        int a = scanner.nextInt();

        System.out.print("second number ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " is larger");
        } else if (b > a) {
            System.out.println(b + " is larger");
        } else {
            System.out.println("Both numbers are equal");
        
        }
    }
}