import java.util.*;

public class prodect{
        public static int prod(int a, int b){
        int product=a*b;
        return product;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int prodec = prod(a,b);
        System.err.println("Product is :"+prodec);
    }
    }

