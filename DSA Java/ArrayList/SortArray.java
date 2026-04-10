import java.util.ArrayList;
import java.util.Collections;

public class SortArray{
    public static void main(String s[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(10);
        System.out.println("Before sort");
        System.out.println(list);

        System.out.println("Ascending order");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Decending order");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}