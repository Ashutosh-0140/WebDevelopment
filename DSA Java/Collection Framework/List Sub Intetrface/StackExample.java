import java.util.Stack;

public class StackExample{
    public static void main(String s[]){
        Stack<String> st = new Stack();
        st.push("Ashu");
        st.push("tosh");
        st.push("Sahu");
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        
    }
}