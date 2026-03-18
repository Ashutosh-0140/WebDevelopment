public class GridWays{
    public static int ways(int i, int j, int m, int n){
        if(i==m-1 && j == n-1){
            return 1;
        }else{
            if(i == m || j == n){
                return 0;
            }
        }

        int nextTotal = ways(i, j+1, m, n);
        int buttomTotal = ways(i+1, j, m, n);
        int total = nextTotal + buttomTotal;

        return total;
    }
    public static void main(String s[]){
        int n = 3, m=3;
        int totalWays = ways(0, 0, n, m);
        System.out.println("The total number of ways to reach destination is "+totalWays);
    }
}