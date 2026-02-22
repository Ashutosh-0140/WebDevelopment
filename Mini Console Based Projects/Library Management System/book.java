

import java.util.Scanner;

public class book{
    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

    Scanner sc = new Scanner(System.in);

    public book(){
        System.out.println("Enter serial number of the book:");

        this.sNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Book name:");
        this.bookName = sc.nextLine();

        System.out.println("Enter Quantity of Books:");
        this.bookQty = sc.nextInt();
        bookQtyCopy = this.bookQty;

    }
}