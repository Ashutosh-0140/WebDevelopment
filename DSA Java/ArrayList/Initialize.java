import java.util.ArrayList;
class Initialize{
    public static void main(String s[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n =list.get(2);
        System.out.println(n);

        list.remove(2);

        list.set(2, 10);

        System.out.println(list.contains(10));
        System.out.println(list.contains(9));

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.println(i);
        }
    }
}