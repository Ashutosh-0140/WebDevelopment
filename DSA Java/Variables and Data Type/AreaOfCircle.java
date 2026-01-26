import java.util.Scanner;

class AreaOfCircle{
    public static void main(String[] args) {
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle");
        float r = sc.nextFloat();
        
        float area = pi*r*r;

        System.out.println("Area of Circle is "+area);
        
    }
}