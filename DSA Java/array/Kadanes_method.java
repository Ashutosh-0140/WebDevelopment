public class Kadanes_method{

    public static int kadanes(int numbers[]){
        int cs = 0;
        int mn = Integer.MIN_VALUE;
         for(int i =0; i<= numbers.length -1; i++){
            cs=numbers[i];
            if (mn < 0){
                mn =0;
            }
            mn = Math.max(mn, mn);
         } 
        return mn;
    }
    public static void main(String s[]){
        int numbers[] = {1,-2, 4, -5};
        int max =kadanes(numbers);
        System.out.println(max);
    }
}