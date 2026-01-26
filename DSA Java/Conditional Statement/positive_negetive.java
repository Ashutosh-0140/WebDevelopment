import java.util.Scanner;

class positive_negetive {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        String num = (a >=0)?"Number is Positive":" Number is negetive";

        System.out.println(num);
    }
}