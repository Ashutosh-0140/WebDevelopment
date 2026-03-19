class SudokuSolver{
    public static boolean isSafe(char sudoku[][], int row, int col, int digit){
        //column
        for(int i = 0; i<= 8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        //row
        for(int j =0; j<=8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        //check in the grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i = sr; i<sr+3; i++){
            for(int j = sc; j<sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    } 
    public static boolean SudokuSolve(char sudoku[][], int row, int col){
        //base case
        if(row == 9){
            return true;
        }

        int nextRow = row;
        int nextCol = col +1;
        if(nextCol == 9){
            nextRow = row +1;
            nextCol = 0;
        }
        if(sudoku[row][col] !='.'){
            return SudokuSolve(sudoku, nextRow, nextCol);
        }
        for(char digit = '1'; digit <= '9'; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = (char)digit;
                if (SudokuSolve(sudoku, nextRow, nextCol)) {
                    return true;
                }
                // backtrack
                sudoku[row][col] = '.';
            }
        }
        return false;
    }
    public static void main(String s[]){
        char sudoku[][] = {
    {'5','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
};
        if (SudokuSolve(sudoku, 0, 0)) {
    System.out.println("Solution is:");
    for (int i = 0; i < 9; i++) {
        if (i % 3 == 0 && i != 0) {
            System.out.println("------+-------+------");
        }
        for (int j = 0; j < 9; j++) {
            if (j % 3 == 0 && j != 0) {
                System.out.print("| ");
            }
            System.out.print(sudoku[i][j] + " ");
        }
        System.out.println();
    }
} else {
    System.out.println("No solution exists.");
}

    }
}