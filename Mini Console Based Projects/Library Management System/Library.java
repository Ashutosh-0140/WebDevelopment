import java.util.Scanner;

public class Library{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("**********Welcome to Library**********");

        System.out.println("**********Select From The following Option**********");

        books ob = new books();

        int choice;
        int searchChoice;

        do{
            ob.dispMenu();
            choice = sc.nextInt();
            switch(choice){
                book b = new book();
                ob.addBook(b);
            }
        }
    }
}