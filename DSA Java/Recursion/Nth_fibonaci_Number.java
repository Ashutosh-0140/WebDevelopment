class Nth_fibonaci_Number{
    static int fibonaci(int nth){
        if(nth == 0 || nth == 1){
            return nth;
        }
        int fnm1 = fibonaci(nth-1);
        int fnm2 = fibonaci(nth -2);
        int fn = fnm1 + fnm2; 
        return fn;
    }
    public static void main(String s[]){
        int num = 25;
        int nth_term = fibonaci(num);
        System.out.println(nth_term);
    }
}