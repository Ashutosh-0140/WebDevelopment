import java.util.*;
public class QueueInterLeave {
    public static void interLeave(Queue<Integer> q){
        int size = q.size()/2;
        Queue<Integer> first = new LinkedList<>();
        for(int i = 0; i< size; i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int front = q.remove();
        reverse(q);
        q.add(front);
    }
    public static void main(String s[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        //interLeave(q);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        reverse(q);
        System.out.print("After reverse :");
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
