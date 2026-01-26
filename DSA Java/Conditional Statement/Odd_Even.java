import java.util.Scanner;
class Odd_Even{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}