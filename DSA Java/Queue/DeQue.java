import java.util.*;
public class DeQue {
    public static void main(String s[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq);

    }
}
