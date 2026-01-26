public class Search_in_Sorted_Matrix{
    public static void Search(int matrix[][], int key){
        int row = matrix.length-1;
        int col = 0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("Element found at index: ("+row+","+col+")");
                break;
            }
            else if(matrix[row][col] >key){
                row--;
            }
            else if(matrix[row][col] <key){
                col++;
            }
            else System.out.println("Element noot found in the matrix.");
        }
    }
    public static void main(String s[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        int key = 7;
        Search(matrix, key);
    }
}