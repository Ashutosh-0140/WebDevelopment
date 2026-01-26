import java.util.Scanner;
class EnterNumber{
    
public static void main(String s[]){
    Scanner sc = new Scanner (System.in);
    
    do { 
        System.out.println("Enter a number");
        int num = sc.nextInt();
            if(num%10 == 0){
                break;
            }
    } while (true);
}
}