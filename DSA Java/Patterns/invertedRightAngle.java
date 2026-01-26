import java.util.Scanner;

class invertedRightAngle{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of row:");  
    int num = sc.nextInt();

    for(int i =num; i>=1; i--){
        for( int j = 1; j<=i; j++ ){
            System.out.print("* ");
        }
        System.out.println();
    }       

    }
              

}