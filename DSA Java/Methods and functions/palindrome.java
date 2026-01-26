import java.util.Scanner;

public class palindrome{
    public static void isPalindrome(int n){
        int rev =0;
        int p = n;
        for(int i =1; i<=3; i++){
            int rem = p%10;
            rev = rev *10 + rem;
        }
        if(n == rev){
            System.err.println("not a alindrome");
        }
        else{
            System.err.println("is a palindrome");
        }
    }
    public static void main(String s[]){
        int num = 123;
        isPalindrome(num);
    }
}