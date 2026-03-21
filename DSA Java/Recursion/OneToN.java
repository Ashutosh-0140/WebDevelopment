import java.util.Scanner;
class OneToN{
    static int n;
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1, n);
    }
    public static void print(int x, int n){
        //base case
        if(n< x) return;        
        print(x+1, n);
        System.out.println(x);
    }
}