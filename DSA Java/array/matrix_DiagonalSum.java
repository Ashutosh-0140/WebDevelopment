public class matrix_DiagonalSum{
    public static void Sum(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            //primary diagonal sum
            sum += matrix[i][i]; 
            if(i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("The sum of diagonals is: " + sum);
    }
    public static void main(String s[]){
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Sum(matrix);
    }
}