import java.util.Scanner;

public class Search_in_2DMatrix{
    public static void Search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Yes the element is present at index:("+i+","+j+")");
                }
            }
        }
    }

    public static void Print(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        System.out.println("Enter nine element to the matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int key = 5;
        Print(matrix);
        Search(matrix, key);
    }
}