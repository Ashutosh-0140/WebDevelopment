import java.util.HashSet;
import java.util.Iterator;

class HashSet1 {
    public static void main(String s[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(int k : set){
            System.out.println(k);
        }

        System.out.print(set);
        System.out.println(set.size());
        System.out.println(set.remove(9));
    }
}
