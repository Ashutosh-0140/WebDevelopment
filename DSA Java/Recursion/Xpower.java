class Xpower{
    public static int pow(int a, int b){
        if(b == 1){
            return a;
        }
        return a*pow(a, b-1);
    }
    public static void main(String s[]){
        int a = 2;
        int b = 4;
        int res = pow(a,b);
        System.out.println(res);
    }
}