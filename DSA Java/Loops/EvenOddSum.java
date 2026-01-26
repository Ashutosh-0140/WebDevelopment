import java.util.Scanner;

class EvenOddSum{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int EvenSum =0;
        int OddSum = 0;
        int choice = 1;

        do { 
            System.out.println("Enter a number");
            int num = sc.nextInt();

            if(num%2 == 0){
                EvenSum += num;
            }
            else{
                OddSum += num;
            }
            System.out.println("Enter 1 for continue and enter 0 sor stop.");
            choice = sc.nextInt();
        } while (choice==1);
        System.out.println("Sum of all even numbers is"+EvenSum);
        System.out.println("Sum of all odd numbers is"+OddSum);

    }
    
}