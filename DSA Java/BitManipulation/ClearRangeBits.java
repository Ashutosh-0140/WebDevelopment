public class ClearRangeBits{
    public static void ClearBits(int num, int i, int j){
        int firstMask = (~0)<<(j+1);
        int SecondMask = (i<<i)-1;
        int bitMask = firstMask | SecondMask;
        System.out.println(bitMask & num);
    }
    public static void main(String s[]){
        int num = 10;
        int i = 2;
        int j = 4;
        ClearBits(num, i, j);
    }
}