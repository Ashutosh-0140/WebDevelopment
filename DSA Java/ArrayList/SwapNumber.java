import java.util.ArrayList;

public class SwapNumber{
    public static ArrayList<Integer> swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        return list;
    }
    public static void main(String s[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Before swap");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        ArrayList<Integer> listSwapped = swap(list, 1, 3);
        System.out.println("After swap");
        for(int i = 0; i<listSwapped.size(); i++){
            System.out.println(listSwapped.get(i));
        }
    }
}