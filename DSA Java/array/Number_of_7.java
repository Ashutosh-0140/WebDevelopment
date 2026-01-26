public class Number_of_7{
    public static void Search(int matrix[][], int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println("The number of "+key+" in the matrix is: "+count);
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