import static java.lang.Math.pow;

public class dec_to_bin{
    public static void convert(int myNum){
        int n = myNum;
        int rem;
        int bin=0;
        int p=0;
        while(n>0){
            rem = n/2;
            bin = bin + (int)(rem * pow(10, p));
            p++;
        }
        System.out.println(bin);
    }

    public static void main(String s[]){
        int number = 8;
        convert(number);
    }
}
