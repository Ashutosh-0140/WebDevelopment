import java.util.HashSet;

public class containsDuplicate {
    public static void main(String s[]){
        int arr[] = { 1,2,3,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            if(!set.add(i)){
                System.out.println("Yes cointains duplicate");
                break;
            }
        }
        
    }
}
