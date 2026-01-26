import java.util.Scanner;

class largest_of_three {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" Is the largest number");
        }
        else if(b>c && b>a){
            System.out.println("The largest number is "+b);
        }
        else if(c>a && c>b){
            System.out.println("The largest number is "+c);
        }
        else if(a>c && b>c && a==b){
            System.out.println("The largest number is "+b+" a and b are equal");
        }
        else if(b>a && c>a && c==b){
            System.out.println("The largest number is "+b+" b and c are equal");
        }
        else if(a>b && c>b && c==a){
            System.out.println("The largest number is "+c+"  c and a are equal");
        }
        else{
            System.out.println("All numbers are equal");
        }

    }
}