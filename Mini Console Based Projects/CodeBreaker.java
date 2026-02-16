import java.util.*;

public class CodeBreaker {
    private static final int CODE_LENGTH = 4;
    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretCode = generateCode();
        System.out.println("🎮 Welcome to Code Breaker!");
        System.out.println("Guess the 4-digit secret code (digits 0-9, no repeats).");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts.\n");

        int attempts = 0;
        boolean won = false;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            String guess = sc.nextLine();

            if (!isValidGuess(guess)) {
                System.out.println("❌ Invalid guess! Enter 4 unique digits.");
                continue;
            }

            attempts++;
            if (guess.equals(secretCode)) {
                won = true;
                break;
            } else {
                giveFeedback(secretCode, guess);
            }
        }

        if (won) {
            System.out.println("\n🎉 Congratulations! You cracked the code: " + secretCode);
        } else {
            System.out.println("\n💀 Game Over! The secret code was: " + secretCode);
        }
        sc.close();
    }

    private static String generateCode() {
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 10; i++) digits.add(i);
        Collections.shuffle(digits);
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(digits.get(i));
        }
        return code.toString();
    }

    private static boolean isValidGuess(String guess) {
        if (guess.length() != CODE_LENGTH) return false;
        Set<Character> unique = new HashSet<>();
        for (char c : guess.toCharArray()) {
            if (!Character.isDigit(c)) return false;
            unique.add(c);
        }
        return unique.size() == CODE_LENGTH;
    }

    private static void giveFeedback(String secret, String guess) {
        for (int i = 0; i < CODE_LENGTH; i++) {
            char g = guess.charAt(i);
            if (secret.charAt(i) == g) {
                System.out.println("✅ Digit " + g + " is correct and in the right position.");
            } else if (secret.indexOf(g) != -1) {
                System.out.println("⚠️ Digit " + g + " is in the code but wrong position.");
            } else {
                System.out.println("❌ Digit " + g + " is not in the code.");
            }
        }
        System.out.println();
    }
}