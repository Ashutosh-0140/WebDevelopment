import java.util.ArrayList;

public class MatrixList{
    public static void main(String s[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);

        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);
    }
}