import java.util.Scanner;
class sumOfN{
    public static void main(String s[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        int i=1;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("Sum is: "+sum);
         
    }
}