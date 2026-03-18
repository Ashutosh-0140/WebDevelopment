class NQueenOneSolution {

   public static boolean isSafe(char board[][], int row, int col) {
      // left diagonal
      for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
         if (board[i][j] == 'Q') return false;
      }

      // right diagonal
      for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
         if (board[i][j] == 'Q') return false;
      }

      // upward
      for (int i = row - 1; i >= 0; i--) {
         if (board[i][col] == 'Q') return false;
      }
      return true;
   }

   public static void printBoard(char board[][]) {
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
   }

   public static boolean nQueen(char board[][], int row) {
      if (row == board.length) {
         printBoard(board);
         return true; // stop after first solution
      }

      for (int j = 0; j < board.length; j++) {
         if (isSafe(board, row, j)) {
            board[row][j] = 'Q';
            if (nQueen(board, row + 1)) return true; // bubble up success
            board[row][j] = 'X'; // backtrack
         }
      }
      return false;
   }

   public void totalNQueens(int n) {
      char[][] board = new char[n][n];
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board.length; j++) {
            board[i][j] = 'X';
         }
      }
      nQueen(board, 0);
   }

   public static void main(String s[]) {
      int n = 4;
      NQueenOneSolution nq = new NQueenOneSolution();
      nq.totalNQueens(n);
   }
}