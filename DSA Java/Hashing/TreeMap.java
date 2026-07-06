public class TreeMap {
    public static void main(String s[]){
        java.util.TreeMap<String,Integer> tm = new java.util.TreeMap<>();
        tm.put("A", 1);
        tm.put("C", 3);
        tm.put("B", 2);
        System.out.println(tm);

        java.util.HashMap<String,Integer> hm = new java.util.LinkedHashMap<>();
        hm.put("C", 1);
        hm.put("B", 2);
        hm.put("A", 3);
        System.out.println(hm);

    }
}
