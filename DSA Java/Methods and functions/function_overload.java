public class function_overload{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static void main(String s[]){
        int a =2;
        int b = 3;
        int c = 7;
        float d = 3;
        float e = 5;
        double f = 323232;
        System.out.println(sum(a,b) +","+ sum(a,b,c) +","+ sum(d,e) +","+ sum(f,f));

    }
}