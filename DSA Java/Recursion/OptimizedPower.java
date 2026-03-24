class OptimizedPower {
    static int power(int a, int b) {
        if(b == 0) return 1;
        int Halfres = power(a, b/2);
        if(b%2 == 0){
            return Halfres*Halfres;
        }
        else return a*Halfres*Halfres;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int res = power(x, n);
        System.out.println(res); // Output: 1024
    }
}