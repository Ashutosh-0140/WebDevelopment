import java.util.Scanner;

public class mark_percentage{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[10];

        System.out.println("Enter your Physics Mark");
        marks[0] = sc.nextInt();

        System.out.println("Enter your Chemestry Mark");
        marks[1] = sc.nextInt();

        System.err.println("Enter your Mathematics Mark");
        marks[2] = sc.nextInt();

        int avg = (marks[0] + marks[1] + marks[2])/3;

        System.out.println(marks);

        System.out.println("Percentage is "+ avg);

    }
}