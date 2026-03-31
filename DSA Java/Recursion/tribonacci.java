class tribonacci {
    public static int tribonacci(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        if(n == 2){
            return 1;
        }
        int funN0 = tribonacci(n-1);
        int funN1 = tribonacci(n-2);
        int funN2 = tribonacci(n-3);

        return funN0 + funN1 + funN2;
    }

    public static void main(String s[]){
        int res = tribonacci(5);
        System.out.println(res);
    }
     
}