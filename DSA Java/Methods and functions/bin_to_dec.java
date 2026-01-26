import static java.lang.Math.pow;

public class bin_to_dec {
    public static void convert(int binnum) {
        int decnum = 0;
        int p = 0; // position counter

        while (binnum > 0) {
            int ld = binnum % 10; // last digit
            decnum = decnum + (int)(ld * pow(2, p)); // ld * 2^p
            binnum = binnum / 10; // move to next digit
            p++; // increase position
        }

        System.out.println(decnum);
    }

    public static void main(String s[]) {
        int binnum = 10; // binary 10 = decimal 2
        convert(binnum);
    }
}