public class NQueen{
   static int count=0;
   public static boolean isSafe(int board[][], int row, int col){
    //left diagonal
    for(int i = row - 1, j = col-1; i>=0 && j>=0; i--,j--){
        if(board[i][j] =='Q'){
            return false;
        }
    }

    //right diagonal
    for(int i = row - 1, j = col+1; i>=0 && j<board.length; i--,j++){
        if(board[i][j] =='Q'){
            return false;
        }
    }
    //upward
    for(int i = row - 1; i>=0; i--){
        if(board[i][col] =='Q'){
            return false;
        }
    }
    return true;
   }
    public static int nQueen(int board[][], int row){
         
        if(row == board.length){
            count ++;
            return -1;
        }

        for(int j =0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = 'X';
            }
        }
        return count;
    }

    public int totalNQueens(int n) {
        int[][] board = new int[n][n]; // queens[row] = column position
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }
        return nQueen(board, 0);
    }


    public static void main(String s[]){
        int n = 10;
        int board[][] = new int[n][n];

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }
        NQueen nq = new NQueen();
        int num =nq.totalNQueens(n);
        System.out.print("Total number of possibles with "+n+" Queens are:"+num);
    }
}