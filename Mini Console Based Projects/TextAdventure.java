import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasKey = false;
        boolean gameOver = false;

        System.out.println("🏰 Welcome to the Adventure!");
        System.out.println("You wake up in a dark dungeon. There are two doors: LEFT and RIGHT.");

        while (!gameOver) {
            System.out.print("Choose a door (left/right): ");
            String choice = sc.nextLine().toLowerCase();

            if (choice.equals("left")) {
                System.out.println("You enter a room with a treasure chest.");
                if (!hasKey) {
                    System.out.println("The chest is locked. You need a key.");
                } else {
                    System.out.println("You open the chest with the key... 🎉 You found the treasure! YOU WIN!");
                    gameOver = true;
                }
            } else if (choice.equals("right")) {
                System.out.println("You enter a room with a sleeping dragon 🐉.");
                System.out.print("Do you sneak past or fight? ");
                String action = sc.nextLine().toLowerCase();

                if (action.equals("sneak")) {
                    System.out.println("You sneak quietly and find a shiny key on the ground.");
                    hasKey = true;
                } else if (action.equals("fight")) {
                    System.out.println("The dragon wakes up and defeats you... GAME OVER.");
                    gameOver = true;
                } else {
                    System.out.println("Invalid action. The dragon wakes up anyway... GAME OVER.");
                    gameOver = true;
                }
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}