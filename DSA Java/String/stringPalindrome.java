public class stringPalindrome{
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String s[]){
        String str = "NOON";
        boolean res = isPalindrome(str);
        System.out.println(res);
    }
}