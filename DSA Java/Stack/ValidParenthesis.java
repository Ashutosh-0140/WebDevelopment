import java.util.Stack;
class ValidParenthesis{
    public static void main(String s[]){
        String str = "(((((((({{{{[[[[]]]]}}}})))))))))))";
        Stack<Character> s1 = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='('||ch=='{'||ch=='['){
                s1.push(ch);
            }
            else{
                if(s1.isEmpty()){
                    System.out.println("not valid");
                }
                if((s1.peek()=='('&& ch==')')||(s1.peek()=='{'&& ch=='}')||(s1.peek()=='['&& ch==']')){
                    s1.pop();
                }
                else{
                    System.out.println("Not a valid parenthesis");
                }
            }
        }
        System.out.println("Valid parenthesis.");
    }
}