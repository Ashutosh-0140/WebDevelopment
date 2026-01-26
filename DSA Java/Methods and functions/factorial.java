import java. util.*;

public class factorial{
    public static int fact(int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f *=i;
           
        }
         return f;
    }
    public static int bio_co(int n, int r){
        int factn = fact(n);
        int factr = fact(r);
        int factnr = fact(n-r);
        int value = factn/(factr*factnr);
        return value;
    }
    public static void main (String s[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a n:");
        int n = sc.nextInt();
        System.out.print("Enter a r:");
        int r = sc.nextInt();

        
        System.out.println("The bionomial co-efficient is "+bio_co(n,r));

    }

}
