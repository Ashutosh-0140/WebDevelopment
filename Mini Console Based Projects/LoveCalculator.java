import java.util.Scanner;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("💖 Welcome to the Love Calculator 💖");
        System.out.print("Enter your name: ");
        String name1 = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        System.out.print("Enter your partner's name: ");
        String name2 = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        // Algorithm: sum ASCII values of both names
        int score1 = calculateScore(name1);
        int score2 = calculateScore(name2);

        int combinedScore = score1 + score2;

        // Convert to percentage (mod 101 ensures 0–100 range)
        int lovePercent = combinedScore % 101;

        System.out.println("\n✨ Calculating love compatibility... ✨\n");
        System.out.println("💑 " + capitalize(name1) + " ❤️ " + capitalize(name2));
        System.out.println("💘 Love Percentage: " + lovePercent + "%");

        // Fun messages
        if (lovePercent > 80) {
            System.out.println("😍 You two are a perfect match! Soulmates forever 💍💞");
        } else if (lovePercent > 50) {
            System.out.println("😊 A strong bond! Keep nurturing your love 🌹💕");
        } else if (lovePercent > 30) {
            System.out.println("🤔 There’s potential, but you’ll need effort and care 🌱💖");
        } else {
            System.out.println("😅 Love is tricky here... maybe just good friends 🤝💔");
        }

        System.out.println("\nThanks for playing the Love Calculator! 💕");
        sc.close();
    }

    // Helper method to calculate score based on ASCII values
    private static int calculateScore(String name) {
        int score = 0;
        for (char c : name.toCharArray()) {
            score += (int) c;
        }
        return score;
    }

    // Helper method to capitalize first letter
    private static String capitalize(String name) {
        if (name.isEmpty()) return name;
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}