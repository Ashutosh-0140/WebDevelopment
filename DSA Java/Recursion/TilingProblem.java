public class TilingProblem{
    static int TotalWays(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        int VerticalWay = TotalWays(n-1);
        int HorizontalWay = TotalWays(n-2);
        int TotalWay = VerticalWay + HorizontalWay;

        return TotalWay;
    }
    public static void main(String s[]){
        int n = 4;
        int res = TotalWays(n);
        System.out.println(res);
    }
}