import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String s[]){
        int arr[] = {1,2,3,4,5,1,2,3,4,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
