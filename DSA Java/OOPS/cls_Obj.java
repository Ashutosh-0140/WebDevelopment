public class cls_Obj{
    public static void main(String s[]){
        pen p1 = new pen();
        p1.setColor("Black");
        System.out.println(p1.color);

        pen p2 = new pen();
        p2.setTip(3);
        System.out.println(p2.tipSize);
    }
}
class pen{
    String color = "Blue";
    int tipSize = 1; //Sharp

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tipSize = newTip;
    }
}
class stuednt{
    String name = "Ashu";
    char grade = 'A';


}