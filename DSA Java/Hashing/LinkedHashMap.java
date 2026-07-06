import java.util.*;
public class LinkedHashMap{
    public static void main(String s[]){
        java.util.LinkedHashMap<String,Integer> lhm = new java.util.LinkedHashMap<>();
        lhm.put("India", 1);
        lhm.put("China", 2);
        lhm.put("Austrelia", 3);
        System.out.println(lhm);

        java.util.HashMap<String,Integer> hm = new java.util.LinkedHashMap<>();
        hm.put("India", 1);
        hm.put("China", 2);
        hm.put("Austrelia", 3);
        System.out.println(hm);

    }
}