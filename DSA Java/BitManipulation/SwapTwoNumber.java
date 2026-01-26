public class SwapTwoNumber {
    public static void Swap(int x, int y){
        x = x^y;
        y = x^y;
        x = x^y;

    System.out.println("After swap the numbers are: x ="+x+" and y ="+y);
    }
    public static void main(String s[]){
        int x = 12;
        int y = 21;
        System.out.println("Before Swap the numbers are: x ="+x+", y="+y);
        Swap(x,y);
    }
}