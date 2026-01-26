import java.util.Scanner;

class ReverseNumber{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int lastDigit = num%10;

            //System.out.print(lastDigit+""); 
            rev = (rev*10) + lastDigit;
            num = num/10;

        }
        System.out.println(rev);
        
    }
}

