public class NQueen_NRow{
   static int count=0;
   
    public static void nQueen(char board[][], int row){
         
        if(row == board.length){
            System.out.println("---- Queen Board ----");
            printBoard(board);
            count ++;
            return;
        }

        for(int j =0; j<board.length; j++){
        
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = 'X';
            
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