import java.util.Scanner;
class Multiplication_Table{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }

    }
}
