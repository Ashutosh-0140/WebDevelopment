import java.util.Random;
import java.util.Scanner;

public class DiceBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        System.out.println("=== Welcome to Dice Battle ===");
        System.out.println("First to 5 points wins the game!");

        while (playerScore < 5 && computerScore < 5) {
            System.out.print("\nPress ENTER to roll your dice...");
            scanner.nextLine();

            int playerRoll = random.nextInt(6) + 1; // 1–6
            int computerRoll = random.nextInt(6) + 1;

            System.out.println("You rolled: " + playerRoll);
            System.out.println("Computer rolled: " + computerRoll);

            if (playerRoll > computerRoll) {
                playerScore++;
                System.out.println("You win this round!");
            } else if (computerRoll > playerRoll) {
                computerScore++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("Score → You: " + playerScore + " | Computer: " + computerScore);
        }

        if (playerScore == 5) {
            System.out.println("\n🎉 Congratulations! You won the Dice Battle!");
        } else {
            System.out.println("\n💻 Computer wins the Dice Battle. Better luck next time!");
        }

        scanner.close();
    }
}