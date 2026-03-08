import java.util.ArrayList;
public class ArrayList1{
    
    static void ArrayListExample(){

        ArrayList<Integer> Al= new ArrayList();
        Al.add(1);
        Al.add(2);
        Al.add(3);

        System.out.println(Al);

        System.out.println(Al.get(1));
        Al.set(1, 10);
        System.out.println(Al.contains(10));
    }

    public static void main(String s[]){
        ArrayListExample();
    }
}