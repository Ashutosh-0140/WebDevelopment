public class Kadanes_method{

    public static int kadanes(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
         for(int i =0; i<= numbers.length -1; i++){
            cs=numbers[i];
            if (mn < 0){
                mn =0;
            }
            ms = Math.max(mn, ms);
         } 
        return ms;
    }
    public static void main(String s[]){
        int numbers[] = {1,-2, 4, -5};
        int max =kadanes(numbers);
        System.out.println(max);
    }
}