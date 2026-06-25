import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    public static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            // Always push into q1
            q1.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }
            int top = -1;

            // Move all but last element from q1 to q2
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // Last element is the "top"
            top = q1.remove();

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }
            int top = -1;

            // Move all but last element from q1 to q2
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // Last element is the "top"
            top = q1.peek();

            // Move it to q2 as well
            q2.add(q1.remove());

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println("Peek: " + s1.peek()); // 30
        System.out.println("Pop: " + s1.pop());   // 30
        System.out.println("Pop: " + s1.pop());   // 20
        System.out.println("Pop: " + s1.pop());   // 10
        System.out.println("Empty? " + s1.isEmpty()); // true
    }
}
