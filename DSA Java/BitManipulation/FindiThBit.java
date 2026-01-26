public class FindiThBit{
    public static int IthBit(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String s[]){
        int num = 15;
        int i = 3;
        int res = IthBit(num, i);
        System.out.println(res +" is present in "+i+" rd bit.");
    }
}