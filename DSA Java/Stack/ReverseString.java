import java.util.Stack;
class ReverseString{
    public static String reverse(String str){
        Stack <Character> s = new Stack<>();
        int i = 0;
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char c = s.pop();
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String s[]){
        String str = "abc";
        String result=reverse(str);
        System.out.print(result);
    }
}