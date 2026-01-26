public class OddOrEven{
    public static void main(String s[]){
        int num = 11;
        int bitMask = 1;
        if((num & bitMask) == 0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd numbber");
        }
    }
}