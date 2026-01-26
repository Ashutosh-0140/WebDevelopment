public class SetiThBit{
    public static void setBit(int num, int i){
        int bitMask = 1<<i;
        System.out.println("After puting 1 in "+i+" th position of "+num+" the number is "+(num|bitMask)+".");
    }
    public static void main(String s[]){
        int num = 15;
        int i = 5;
        setBit(num, i);
    }
}