import java.util.Scanner;

public class LargestSmallestSecond {
    public static void SecondFind(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i] != max && arr[i]< max){
                secondMax = arr[i];
            }
        }
        
            
            

        System.out.println("Second Max value is:"+secondMax);
        
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

      SecondFind(arr);
   }
}
