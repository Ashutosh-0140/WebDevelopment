class GCD{
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else return gcd(b, a%b);
    }
    public static int lcm(int a, int b){
        int gcd1 = gcd(a,b); 
        if(a==0 || b==0){
            return 0;
        }
            return Math.abs(a*b)/gcd1;
    }
    public static void main(String s[]){
        int num1 = 20;
        int num2 = 25;
        int res =gcd(num1, num2);
        System.out.println(res);
        int lcm1 = lcm(num1,num2);
        System.out.println(lcm1);
    }
}