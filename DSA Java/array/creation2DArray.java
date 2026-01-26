import java.util.Scanner;

public class creation2DArray{
    public static void main(String s[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers differentiate with a space");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] +",");
            }
            System.out.println();
        }

    }
}