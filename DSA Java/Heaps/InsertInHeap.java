import java.util.ArrayList;

public class InsertInHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int p = (x-1)/2;
            while(arr.get(x)<arr.get(p)){
                int temp = arr.get(x);
                arr.set(x, arr.get(p));
                arr.set(p,temp);
            }
        }
        //peek() the data
        public int peek(){
            return arr.get(0);
        }

        //delete data
        private void heapify(int i){
            int left = 2*+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx)>arr.get(left)){
                minIdx = left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx = right;
            }

            if(minIdx !=i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        public int remove(){
            int data = arr.get(0);

            //swap 1st and last
            int temp = arr.get(0);
            arr.set(0,arr.size()-1);
            arr.set(arr.size()-1, temp);

            //remove last index value
            arr.remove(arr.size()-1);

            //heapify
            heapify(0);

            return data;

        }
    }
    public static void main(String s[]){

    }
}
