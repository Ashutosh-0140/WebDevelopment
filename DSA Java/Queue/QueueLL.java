public class QueueLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // is the queue empty
        public boolean isEmpty() {
            return head == null;
        }

        // add
        public void add(int n) {
            Node newNode = new Node(n);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // delete element
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Nothing to delete.");
                return -1;
            }
            int f = head.data;
            head = head.next;
            if (head == null) { // if queue becomes empty
                tail = null;
            }
            return f;
        }

        // peek element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(); // ✅ create queue object

        q1.add(1);
        q1.add(2);
        q1.add(3);

        System.out.println(q1.peek()); // 1
        q1.remove();
        System.out.println(q1.peek()); // 2
        q1.remove();
        System.out.println(q1.peek()); // 3
        q1.remove();
        System.out.println(q1.peek()); // Queue is empty
    }
}
