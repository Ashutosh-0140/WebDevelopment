import java.util.Scanner;
class LargestElement{
    public static int FindMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements to the array:");
        for(int i = 0; i<n; i++){
            System.out.println("Enter next element to the array:");
            arr[i] = sc.nextInt();
        }

        int min = FindMax(arr);
        System.out.println("The Minimun element of the array is:"+min);
    }
}