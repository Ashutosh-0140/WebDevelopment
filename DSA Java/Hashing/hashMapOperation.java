import java.util.HashMap;
import java.util.Set;

public class hashMapOperation{
    public static void main(String s[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",140);
        hm.put("China",150);
        hm.put("SA",14);
        hm.put("UAE",15);
        hm.put("USA",10);
        hm.put("SL",50);
        hm.put("Indonesia",4);
        hm.put("Japan",5);


        /*System.out.println(hm);
        //put function
        System.out.println(hm.get("India"));

        //get function
        hm.get("India");

        //check if contains or not
        hm.containsKey("India");

        //remove
        hm.remove("India");

        //size
        System.out.println(hm.size());

        //size
        System.out.println(hm.isEmpty());*/

        Set<String> key = hm.keySet();
        for(String k : key){
            System.out.println(k+" -> "+hm.get(k));
        }
    }
}