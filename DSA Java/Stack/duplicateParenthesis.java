import java.util.Stack;
class duplicateParenthesis{
    public static boolean isValid(String str){
        Stack <Character> sc = new Stack<>();
        for(int i = 0; i<str.length();i++){
            //opening, operator, operand
            if(str.charAt(i)!=')'){
                sc.push(str.charAt(i));
            }

            //for closing bracket
            if(str.charAt(i)==')'){
                int count = 0;
                while(sc.peek() != '('){
                    sc.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    sc.pop();
                }    
            }
            
        }
        return false;    
    }
    public static void main(String s[]){
        String str = "(((a+b)*(c+d)))";
        boolean ans = isValid(str);
        System.out.println(ans);
    }
}