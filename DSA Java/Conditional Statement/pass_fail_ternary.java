import java.util.Scanner;

class pass_fail_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt(); 
        String result = (score >= 30) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}