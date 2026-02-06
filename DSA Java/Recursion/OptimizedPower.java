class OptimizedPower {
    static int power(int x, int n) {
        // Base cases
        if (n == 0) return 1;
        if (n == 1) return x;

        // Recursive step
        int half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;   // even exponent
        } else {
            return x * half * half; // odd exponent
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int res = power(x, n);
        System.out.println(res); // Output: 1024
    }
}