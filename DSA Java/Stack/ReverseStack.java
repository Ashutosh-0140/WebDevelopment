import java.util.Stack;
class ReverseStack{
    public static void PushAtButtom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtButtom(s, data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        PushAtButtom(s,top);
    }
    public static void main(String s[]){
        Stack <Integer> stk= new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        System.out.println(stk);
        reverse(stk);
        System.out.println(stk);

    }
}