import java.util.*;

class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}

class WordGenerator {
    private static final String[] words = {
        "java", "thread", "object", "class", "method", "console", "game", "oops"
    };
    private Random random = new Random();

    public String getRandomWord() {
        return words[random.nextInt(words.length)];
    }
}

class TimerThread extends Thread {
    private int timeLimit;
    private boolean timeUp = false;

    public TimerThread(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public boolean isTimeUp() {
        return timeUp;
    }

    @Override
    public void run() {
        try {
            for (int i = timeLimit; i > 0; i--) {
                System.out.println("⏳ Time left: " + i + " seconds");
                Thread.sleep(1000);
            }
            timeUp = true;
            System.out.println("❌ Time's up!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
    }
}

class Game {
    private Player player;
    private WordGenerator generator;

    public Game(Player player) {
        this.player = player;
        this.generator = new WordGenerator();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        TimerThread timer = new TimerThread(20); // 20 seconds limit
        timer.start();

        System.out.println("🎮 Welcome, " + player.getName() + "! Type the words correctly!");

        while (!timer.isTimeUp()) {
            String word = generator.getRandomWord();
            System.out.println("👉 Type this word: " + word);

            String input = scanner.nextLine();
            if (input.equals(word)) {
                player.incrementScore();
                System.out.println("✅ Correct! Score: " + player.getScore());
            } else {
                System.out.println("❌ Wrong! Try again.");
            }
        }

        System.out.println("Game Over, " + player.getName() + "! Final Score: " + player.getScore());
    }
}

public class TypingSpeedGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        Game game = new Game(player);
        game.start();
    }
}