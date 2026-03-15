public class findPermutation{
    public static void permutations(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i =0; i < str.length(); i++){
            char cur = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);

            permutations(newStr, ans+cur);
        }
    }
    public static void main(String s[]){
        String str = "abc";
        permutations(str, "");
    }
}