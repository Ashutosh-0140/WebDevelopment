public class CircularQueue {
    static class Queue {
        int arr[];
        int size;
        int front;
        int rear;

        Queue(int n) {
            size = n;
            arr = new int[n];
            front = -1;
            rear = -1;
        }

        // is the queue empty
        public boolean isEmpty() {
            return front == -1;
        }

        // is the queue full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public void add(int n) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) { // first element
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = n;
        }

        // delete element
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Nothing to delete.");
                return -1;
            }
            int f = arr[front];
            if (rear == front) { // only one element
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return f;
        }

        // peek element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(5);
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
