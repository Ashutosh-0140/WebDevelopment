import java.util.Scanner;

public class arrReverse {
    public static void reverse(int arr[]){
        int last = arr.length-1;
        int i = 0;
        while(i<last){
            int temp = last;
            last = arr[i];
            arr[i] = temp;
            i++;
            last--;
        }
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] s) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter elements to the array:");

      for(int i = 0; i < n; i++) {
         System.out.println("Enter next element to the array:");
         arr[i] = sc.nextInt();
      }

      reverse(arr);
   }
}
