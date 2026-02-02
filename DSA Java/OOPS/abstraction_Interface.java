public class abstraction_Interface{
    public static void main(String s[]){
        queen q1 = new queen();
        king k1 = new king();
        q1.move();
        k1.move();
    }
}

interface chess{
    void move();
}

class king implements chess{
    public void move(){
        System.out.println("King can move in either direction(one step).");
    }
}

class queen implements chess{
    public void move(){
        System.out.println("Queen can move in front, back, both side and diagonal(n steps)");
    }
}