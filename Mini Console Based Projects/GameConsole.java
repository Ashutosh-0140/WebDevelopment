import java.util.Scanner;

// Interface for any game
interface Game {
    void start();
    void playRound();
    void declareWinner();
}

// Abstract Player class
abstract class Player {
    protected String name;
    protected String choice;

    public Player(String name) {
        this.name = name;
    }

    public abstract void makeChoice();

    public String getChoice() {
        return choice;
    }

    public String getName() {
        return name;
    }
}

// Human Player class
class HumanPlayer extends Player {
    private Scanner sc;

    public HumanPlayer(String name, Scanner sc) {
        super(name);
        this.sc = sc;
    }

    @Override
    public void makeChoice() {
        System.out.println(name + ", enter Rock, Paper, or Scissors:");
        choice = sc.nextLine().trim().toLowerCase();
    }
}

// Rock-Paper-Scissors Game class
class RockPaperScissors implements Game {
    private Player p1;
    private Player p2;

    public RockPaperScissors(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void start() {
        System.out.println("🎮 Rock-Paper-Scissors Game Started!");
    }

    @Override
    public void playRound() {
        p1.makeChoice();
        p2.makeChoice();
    }

    @Override
    public void declareWinner() {
        String c1 = p1.getChoice();
        String c2 = p2.getChoice();

        System.out.println(p1.getName() + " chose: " + c1);
        System.out.println(p2.getName() + " chose: " + c2);

        if (c1.equals(c2)) {
            System.out.println("It's a draw!");
        } else if ((c1.equals("rock") && c2.equals("scissors")) ||
                   (c1.equals("scissors") && c2.equals("paper")) ||
                   (c1.equals("paper") && c2.equals("rock"))) {
            System.out.println(p1.getName() + " wins!");
        } else {
            System.out.println(p2.getName() + " wins!");
        }
    }
}

// Main class
public class GameConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player player1 = new HumanPlayer("Player 1", sc);
        Player player2 = new HumanPlayer("Player 2", sc);

        RockPaperScissors game = new RockPaperScissors(player1, player2);

        game.start();
        game.playRound();
        game.declareWinner();

        sc.close();
    }
}