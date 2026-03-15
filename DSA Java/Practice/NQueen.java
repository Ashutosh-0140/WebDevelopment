public class NQueen{
   static int count=0;
   public static boolean isSafe(char board[][], int row, int col){
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
    public static void nQueen(char board[][], int row){
         
        if(row == board.length){
            System.out.println("---- Queen Board ----");
            printBoard(board);
            count ++;
            return;
        }

        for(int j =0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = 'X';
            }
        }
    }

    public static void printBoard(char board[][]){

        for(int i = 0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String s[]){
        int n = 4;
        char board[][] = new char[n][n];

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board, 0);
        System.out.print("Total number of possibles with "+n+" Queens are:"+count);
    }
}