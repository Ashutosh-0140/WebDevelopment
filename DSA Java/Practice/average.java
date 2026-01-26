import java.util.Scanner;
class average{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a= sc.nextInt();
         System.out.println("Enter b");
        int b = sc.nextInt();
        int c = 30;
        int avg = (a+b+c)/2;
        System.out.println("Average is "+avg);
    }
}