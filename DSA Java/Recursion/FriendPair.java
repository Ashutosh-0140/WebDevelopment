public class FriendPair{
    public static int TotalPair(int n){
        if(n==1 || n==2){
            return n;
        }
        return TotalPair(n-1) + (n-1)*TotalPair(n-2);
    }
    public static void main(String s[]){
        int res = TotalPair(4);
        System.out.println(res);
    }
}