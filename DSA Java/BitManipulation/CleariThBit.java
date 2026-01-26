public class CleariThBit{
    public static void CleariTh(int num, int i){
        int bitMask = ~(1<<i);
        System.out.println(num & bitMask);
    }
    public static void main(String s[]){
        int num = 10;
        int i = 1;
        CleariTh(num, i);
    }
}