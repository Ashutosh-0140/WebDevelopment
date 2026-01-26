
public class array_function_argument{
    public static void update(int mark[]){
        int avg = (mark[0] + mark[1] + mark[2])/3;
        System.out.println(avg);

        mark[0] = 96;
        mark[1] = 96;
        mark[2] = 96;
    }
    public static void main(String s[]){
        int marks[] = new int[30];

        marks[0] = 95;
        marks[1] = 95;
        marks[2] = 95;

        update(marks);

        

        System.out.println("Updated marks are "+ marks[0] +"|"+ marks[1] +"|"+ marks[2]);
    }
}