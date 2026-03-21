import java.util.HashMap;
import java.util.Scanner;

public class ElementFrequency {
    public static void FindFrequency(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

for (int num : arr) {
    if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
    } else {
        map.put(num, 1);
    }
}

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

        FindFrequency(arr);
        
    }
}
