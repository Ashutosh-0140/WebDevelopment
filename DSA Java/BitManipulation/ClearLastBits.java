public class ClearLastBits{
    public static void ClearBits(int num, int i){
        int bitMask = (~(0)<<i);
        System.out.println(bitMask & num);
    }
    public static void main(String s[]){
        int num = 10;
        int i = 2;
        ClearBits(num, i);
    }
}