import java.util.*;
public class FirstNonRepeating {
    public static void printNonRepeating(String str){
        int freq[] =new int[26];
        Queue<Character> q1 = new LinkedList<>();

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            q1.add(ch);
            freq[ch-'a']++;

            while(!q1.isEmpty() && freq[q1.peek()-'a']>1){
                q1.remove();
            }
            if(q1.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(q1.peek());
            }
        }
    }
    public static void main(String s[]){
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
