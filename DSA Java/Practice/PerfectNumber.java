class PerfectNumber{
    public static void main(String s[]){
        int n = 6;
        isPerfect(n);
    }
    public static void isPerfect(int n){
        int sum = 1;
        for(int i=2; i<= n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n)
        System.out.println(n+" is a perfect number.");

        else System.out.println(n+" is not a perfect number.");
    }
}