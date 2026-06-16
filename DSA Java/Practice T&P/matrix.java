import java.util.*;

public class matrix {
    public static void findMax(int arr[][], int key){
        HashMap<Integer,Integer> max = new HashMap<>();

        // Count frequency of each element
        for(int i = 0; i < arr.length; i++){
            for(int j : arr[i]){
                if(max.containsKey(j)){
                    max.put(j, max.get(j) + 1); // ✅ use j
                } else {
                    max.put(j, 1);
                }
            }
        }

        // Sort by values in descending order
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(max.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print first 'key' entries
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : list){
            if(count < key){
                System.out.println(entry.getKey() + " → " + entry.getValue());
                count++;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args){
        int key = 2;
        int arr[][] = {{0,0,1},{1,1,0},{1,1,1}};
        findMax(arr, key);
    }
}
