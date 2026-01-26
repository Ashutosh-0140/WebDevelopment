import java.util.Scanner;

class DayWeek{
    public static void main(String s[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Day number");
        int a = sc.nextInt();

        switch (a){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid number between 1 to 7");
            
        }

    }
}