public class StringCompression{
    static String comp(String s){
        String newStr ="";
        for(int i=0; i<s.length(); i++){
            Integer count = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            newStr += s.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String s[]){
        String str = "aaabbccccccddeeee";
        String res = comp(str);
        System.out.println("Compressed form of "+str+" is "+res);
    }
}