import java.util.HashMap;

public class MajorityElement {
    public static void main(String s[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = {1,3};
        for(int i = 0; i< arr.length;i++){
            int num = arr[i];
            if(hm.containsKey(num)){
                hm.put(num, hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
        java.util.Set<Integer> keySet = hm.keySet();
        for(int i:keySet){
            if(hm.get(i)>=(arr.length/3)){
                System.out.println(i+"->"+hm.get(i));
            }
        }
    }
}
