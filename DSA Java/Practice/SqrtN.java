public class SqrtN {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= x / mid) { // avoid overflow
                ans = mid;       // mid is a possible answer
                low = mid + 1;   // try to find a bigger one
            } else {
                high = mid - 1;  // mid is too large
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println("Square root of " + x + " is: " + mySqrt(x));
    }
}