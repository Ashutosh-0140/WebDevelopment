import java.util.LinkedList;
public class LinkedList1{
    public static void main(String s[]){
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println(ll);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.remove(0);
        System.out.println(ll);
        
        System.out.println();
    }
}