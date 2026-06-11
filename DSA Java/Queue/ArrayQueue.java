public class ArrayQueue{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = 0;
        }
        //is empty
        public static boolean isEmpty() {
            return rear == -1;
        }
        //add at rear end
        public void add(int n){
            if(rear == size-1){
                System.out.println("No space to add");
                return;
            }
            rear = rear+1;
            arr[rear] = n;
        }

        //remove from front end
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty nothing to remove");
                return -1;
            }
            int f = arr[front];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            return f;
        }

        //peek the front element
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String s[]){
      Queue q1 = new Queue(5);
      q1.add(1);
      q1.add(2);
      q1.add(3);
      
      while(!q1.isEmpty()){
        System.out.println(q1.peek());
        q1.remove();
      }
        

    }
}