import java.util.Scanner;

class leap_year{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a yera for checking it is a leap year or not");
        long year = sc.nextLong();

        if(year%400 == 0){
            System.out.println(year +" Is a leap year.");
        }
        else if((year%4 == 0) && (year%100 != 0)){
            System.out.println(year +" Is a leap year.");
        }
        else {
            System.out.println(year+" is not a leap year.");
        }
        
    }
}