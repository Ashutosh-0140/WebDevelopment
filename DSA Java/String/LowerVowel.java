public class LowerVowel{
    public static void total(String s){
        int count = 0;
        int ch;
        for(ch=0; ch<s.length(); ch++){
            if(s.charAt(ch) == 'a' || s.charAt(ch) == 'e' || s.charAt(ch) == 'i' || s.charAt(ch) == 'o' || s.charAt(ch) == 'u'){
                count++;
            }
        }
        System.out.println("Total number of lower vowels is:"+count);
    }
    public static void main(String s[]){
        String str = ("how are you man ?");
        total(str);
    }
}