import java.util.Scanner;
class SmallestElement{
    public static int FindMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
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

        int min = FindMin(arr);
        System.out.println("The Minimun element of the array is:"+min);
    }
}