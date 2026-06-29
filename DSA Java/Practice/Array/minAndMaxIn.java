import java.util.Scanner;
public class minAndMaxIn{
    public static void findMinMax(int arr[]){
        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Min value is "+min+"Max value is "+max);
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements to the Array");
        for(int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        findMinMax(arr);
        sc.close();
;    }
}