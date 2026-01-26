import java.util.Scanner;

class billPay{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of pencil:");
        float pencil = sc.nextFloat();

        System.out.println("Enter amount of pen:");
        float pen = sc.nextFloat();

        System.out.println("Enter amount of ereaser:");
        float ereaser = sc.nextFloat();


        float total = (pencil + pen + ereaser)*0.18f + (pencil + pen + ereaser);

        System.out.println("Total bill amount is "+total);

    }
}