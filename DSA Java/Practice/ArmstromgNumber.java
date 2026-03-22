class ArmstromgNumber{
    public static void main(String s[]){
        int n = 153;
        isArmstrong(n);
    }
    public static void isArmstrong(int n){
        int Ndigit = (int) Math.log10(n)+1; 
        int num = n;
        int sum = 0;
         while(num != 0){
            int temp = num%10;
            sum += Math.pow(temp, Ndigit);
            num /= 10; 
         }
         if(n == sum) System.out.println(n+" is a Armstrong number.");
         else System.out.println(n+" is not a Armstrong number.");
    }
}