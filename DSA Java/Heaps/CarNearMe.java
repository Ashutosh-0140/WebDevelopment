import java.util.PriorityQueue;
class Points implements Comparable<Points>{
    int x;
    int y;
    int distSq;
    int idx;
    public Points(int x, int y, int distSq, int idx){
        this.x = x;
        this.y = y;
        this.distSq = distSq;
        this.idx = idx;
    }
    @Override
    public int compareTo(Points p2){
        return this.distSq-p2.distSq;
    }
}
public class CarNearMe {
    public static void main(String s[]){
        int arr[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Points> pq = new PriorityQueue<>();

        for(int i=0; i<arr.length;i++){
            int distSq = arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
            pq.add(new Points(arr[i][0], arr[i][1],distSq,i));
        }

        for(int i =0; i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
