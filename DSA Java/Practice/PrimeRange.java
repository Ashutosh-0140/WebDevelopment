public class PrimeRange {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // divisible, not prime
            }
        }
        return true; // prime
    }

    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}