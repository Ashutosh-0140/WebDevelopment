public class PrimeorNot {
    public static void main(String s[]){
        int n = 100;
        for(int i =2; i<= Math.sqrt(n); i++){
            if(i%10 == 0){
                System.out.println(n+" is a Palindrome.");
                break;
            }
            else System.out.println(n+ " is not a palindrome."); return;
        }
    }
}
