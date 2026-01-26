public class insertionSort {
    public static void Sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {   // start from 1, not 0
            int key = arr[i];
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && arr[j] > key) { //for decreasing order you need to change > to <
                arr[j + 1] = arr[j];
                j--;   // decrement j
            }
            arr[j + 1] = key;
        }

        // print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 5};
        Sort(arr);
    }
}