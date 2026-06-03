import java.util.ArrayList;
public class StackImplement{
    static class Stack{
        ArrayList <Integer> list = new ArrayList<>();
        //isEmpty()
        public boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public void push(int data){
            list.add(data);
        }
        //pop
        public int pop(){
            if(isEmpty()){
                System.out.println("Nothing to pop.");
                return -1;
            }
            return list.remove(list.size()-1);
        }
        //peak
        public int peak(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String s[]){
        Stack s1 = new Stack();
        System.out.println(s1.isEmpty());
        s1.push(1);
        s1.push(2);
        System.out.println(s1.pop());
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}