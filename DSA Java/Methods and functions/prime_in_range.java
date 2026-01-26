import static java.lang.Math.sqrt;

public class prime_in_range {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void prime_range(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " , " + isPrime(i));
        }
    }

    public static void main(String[] args) {
        int n = 20;
        prime_range(n);
    }
}