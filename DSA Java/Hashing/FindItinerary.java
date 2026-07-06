import java.util.HashMap;

public class FindItinerary {
    public static String startPoint(HashMap<String,String> hm){
        HashMap<String, String> Getstart = new HashMap<>();
        for(String key:hm.keySet()){
            Getstart.put(hm.get(key),key);
        }

        for(String key:hm.keySet()){
            if(!Getstart.containsKey(key)){
                return key;
            }
        }
        return null;    
    }
    public static void main(String s[]){
        
        HashMap<String,String> hm = new HashMap<>();
        hm.put("Chennai","Bengaluru");
        hm.put("Mumbai","Delhi");
        hm.put("Goa","Chennai");
        hm.put("Delhi","Goa");

        String start = startPoint(hm);
        System.out.print(start);
        for(String i : hm.keySet()){
            System.out.print("->"+hm.get(start));
            start = hm.get(start);
        }

    }
}
