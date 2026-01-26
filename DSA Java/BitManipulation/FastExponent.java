public class FastExponent{
    public static void Exponent(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n&1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String s[]){
        int num = 5;
        int pow = 3;
        Exponent(num, pow);
    }
}