class StringPalindrome{
    public static void isPalim(String str){
        String newStr="";
        for(int i = str.length()-1; i>=0; i--){
            newStr += str.charAt(i);
        }
        if(str.equals(newStr)) System.out.print("Yes");
        else System.out.println(newStr);
    }
    public static void main(String s[]){
        String str = "AAcAA";
        isPalim(str);
    }
}