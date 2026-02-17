import java.util.Scanner;
import java.util.Random;

// Base class for Difficulty
abstract class Difficulty {
    int maxNumber;
    int attempts;

    abstract void setRules();
}

// Easy difficulty
class Easy extends Difficulty {
    @Override
    void setRules() {
        maxNumber = 10;
        attempts = 5;
    }
}

// Hard difficulty
class Hard extends Difficulty {
    @Override
    void setRules() {
        maxNumber = 50;
        attempts = 3;
    }
}

// Player class
class Player {
    private String name;
    private int score;

    Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}

// Game class
class Game {
    private Difficulty difficulty;
    private Player player;
    private Random random = new Random();

    Game(Player player, Difficulty difficulty) {
        this.player = player;
        this.difficulty = difficulty;
        difficulty.setRules();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int target = random.nextInt(difficulty.maxNumber) + 1;
        System.out.println("\nGuess the number between 1 and " + difficulty.maxNumber);

        for (int i = 1; i <= difficulty.attempts; i++) {
            System.out.print("Attempt " + i + ": ");
            int guess = sc.nextInt();

            if (guess == target) {
                System.out.println("🎉 Correct! You win!");
                player.addScore(10);
                return;
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
        System.out.println("❌ Out of attempts! The number was: " + target);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Player player = new Player(name);

        System.out.println("Choose difficulty: 1. Easy  2. Hard");
        int choice = sc.nextInt();

        Difficulty difficulty = (choice == 1) ? new Easy() : new Hard();

        Game game = new Game(player, difficulty);
        game.start();

        System.out.println("\nFinal Score of " + player.getName() + ": " + player.getScore());
    }
}