public class RangePalindrome {
    public static boolean PalimOrnot(int n){
        int rev = 0;
        int num = n;
        while(num != 0){
            int temp = num%10;
            rev = rev*10 + temp;
            num /= 10;
        }
        if(n == rev) return true;

        else return false;
    }
    public static void main(String s[]){
        int range = 20;
        int min = 0;
        for(int i =min; i<= range; i++){
            if(PalimOrnot(i)){
            System.out.println(i+" is a palimdoemw.");
            }
        }
    }
}
