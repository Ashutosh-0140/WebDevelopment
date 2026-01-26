import java.util.Scanner;

public class PowerOfTwo{
    public static void PowerOrnot(int num){
        int res = num & (num -1);
        if(res == 0){
            System.out.println(num+ " is power of 2.");
        }
        else{
            System.out.println(num+" is not power of 2.");
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        PowerOrnot(num);
    }
}