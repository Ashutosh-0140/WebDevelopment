public class StackLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
        static Node head;
        //isEmpty()
        public boolean isEmpty(){
            return head == null;
        }
        //push
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String s[]){
        Stack sl = new Stack();
        System.out.println(sl.isEmpty());
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        sl.push(5);
        System.out.println(sl.peek());
        while(!sl.isEmpty()){
            System.out.println(sl.pop());
        }
    }
}