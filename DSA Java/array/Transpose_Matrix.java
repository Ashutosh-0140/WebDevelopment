public class Transpose_Matrix{
    public static void transpose(int matrix[][]){
        System.out.println("Transpose matrix is :");
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[j][i]+",");
            }
            System.out.println();
        }
    }
    public static void main(String s[]){
        int matrix[][] = {{1,2},
                          {7,6},
                          {9,7},
                          {7,14}};
        transpose(matrix);
    }
}