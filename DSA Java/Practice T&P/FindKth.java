public class FindKth {
    public static void sort(int arr[], int k) {
        for (int i = 1; i < arr.length; i++) { 
            int key = arr[i];
            int j = i - 1;

            
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("The kth smallest element is "+arr[k-1]);
    }
    public static void MinDiff(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < min) {
                min = diff;
            }
        }

        System.out.println("Min difference is "+min);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5,3,19,18,25};
        sort(arr,3);
        MinDiff(arr);
    }
}

