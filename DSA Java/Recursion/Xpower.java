class Xpower{
    static int pow(int x, int n){
        if(n==1){
            return x;
        }
        return x*pow(x, n-1);
    }
    public static void main(String s[]){
        int x = 2;
        int n = 10;
        int res = pow(x,n);
        System.out.println(res);
    }
}