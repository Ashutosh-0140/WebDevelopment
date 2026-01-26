import java.util.Scanner;
class number_1_n{
    public static void main(String s[]){
        int i =1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter end number:");
        int n = sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}