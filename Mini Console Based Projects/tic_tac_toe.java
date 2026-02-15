import java.util.*;
public class tic_tac_toe{
    static String board[];
    static String turn;

    public static void printBoard(){
        System.out.println("|---|---|---|");
        System.out.println("|  "+board[0]+" |  "+board[1]+"  |  "+board[2]+"  |");
        System.out.println("|---|---|---|");
        System.out.println("|"+board[3]+"|"+board[4]+"|"+board[5]+"|");
        System.out.println("|---|---|---|");
        System.out.println("|"+board[6]+"|"+board[7]+"|"+board[8]+"|");
        System.out.println("|---|---|---|");
    }

    public static String checkWinner(){
        for(int i = 0; i<=8; i++ ){
            String line = null;

            switch(i){
                case 0: line = board[0] + board[1] + board [2];
                break;

                case 1: line = board[3] + board[4] + board [5];
                break;

                case 2: line = board[6] + board[7] + board [8];
                break;

                case 3: line = board[0] + board[3] + board [6];
                break;

                case 4: line = board[1] + board[4] + board [7];
                break;

                case 5: line = board[2] + board[5] + board [8];
                break;

                case 6: line = board[0] + board[4] + board [8];
                break;

                case 7: line = board[2] + board[4] + board [6];
                break;
            }
            if ("XXX".equals(line)) {
                return "X";
            } else if ("OOO".equals(line)) {
                return "O";
            }
        }
        for(int a = 0; a<9; a++){
            if(Arrays.asList(board).contains(String.valueOf(a+1))){
                break;
            }
            else if(a ==8){
                return "DRAW!";
            }
        }

        System.out.println(turn + "'s turn, enter a slot number.");
        return null;
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for(int i = 0; i<9; i++){
            board[i] = String.valueOf(i+1);
        }

        System.out.println("Welcome to Tic Tac Toe Game");
        printBoard();
        System.out.println("X please start the match. Enter a slot number:");

        while(winner == null){
            int numInput;
            try{
                numInput=sc.nextInt();

                if(!(numInput>0 && numInput<=9)){
                    System.out.println("Enter a valid number (between 1 to 9).");
                    continue;
                }
                if(board[numInput-1].equals(String.valueOf(numInput))){
                    board[numInput-1]=turn;

                    turn = turn.equals("X") ? "O": "X";

                    printBoard();
                    winner = checkWinner();
                } else {
                    System.out.println(" Slot already taken Re enter slot number");
                }

            }catch(InputMismatchException e){
                System.out.println("Invelid Input; re enter slot number:");
                sc.nextLine();
            }

        }
        if(winner.equalsIgnoreCase("DRAW")){
            System.out.println("It is a draw! Thanks for playing. Have a good day.");
        } else{
            System.out.println("Congratulations!"+winner+" has won the match.");
        }
        sc.close();
    }
}