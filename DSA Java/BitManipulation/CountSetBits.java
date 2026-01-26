public class CountSetBits{
    public static void Count1Bits(int num){
        int count = 0;
        while(num != 0){
            if((num & 1) != 0){
                count ++;
            }
            num = num>>1;
        }
        System.out.println("Number of 1 in the binary form of 10 are "+count);
    }
        
    public static void main(String s[]){
        int num = 10;
        Count1Bits(num);
    }
}