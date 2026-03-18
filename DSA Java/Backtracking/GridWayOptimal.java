class GridWayOptimal{
    public static long GridWays(int m, int n){
        return factorial((n-1) + (m-1))/(factorial(n-1)*factorial(m-1));
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        long totalWays = GridWays(m, n);
        System.out.println("Total numbers of ways are "+totalWays);
    }

}