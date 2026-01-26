import java.util.Scanner;
class EnterNumberCont{
    
public static void main(String s[]){
    Scanner sc = new Scanner (System.in);
    
    do { 
        System.out.println("Enter a number");
        int num = sc.nextInt();
            if(num%10 == 0){
                continue;
            }
            System.out.println("Number was"+num);
    } while (true);
}
}