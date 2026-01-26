public class Sum_of_number_in_second_row{
    public static void Search(int matrix[][], int key){
        int sum = 0;
        for(int i=0; i<matrix[1].length;i++){
            sum += matrix[1][i];
        }
        System.out.println("The sum of second row in the matrix is: "+sum);
    }
    public static void main(String s[]){
        int matrix[][] = {{1,2,3,4},
                          {7,6,7,8},
                          {9,7,11,12},
                          {7,14,7,16}};
        int key = 7;
        Search(matrix, key);
    }
}