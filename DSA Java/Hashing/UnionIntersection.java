import java.util.HashSet;

public class UnionIntersection {
    public static void main(String s[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        //union
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i = 0; i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println("Union is"+hs);

        hs.clear();
        //Intersection
        for(int i = 0; i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i = 0; i< arr2.length; i++){
            if(!hs.contains(arr2[i])){
                hs.remove(arr2[i]);
            }
        }
        System.out.println(hs);
    }
}
