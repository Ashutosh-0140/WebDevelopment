import java.util.PriorityQueue;
class priorityQ{
    public static void main(String s[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(7);
        pq.add(3);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}