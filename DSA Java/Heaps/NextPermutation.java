public class NextPermutation {
    public static void nextPer(int arr[]) {
        int pivot = -1;

        // 1. Find pivot (first decreasing element from right)
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            // Array is in descending order → reverse to smallest permutation
            reverse(arr, 0, arr.length - 1);
        } else {
            // 2. Find next greater element to swap with pivot
            for (int i = arr.length - 1; i > pivot; i--) {
                if (arr[i] > arr[pivot]) {
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }

            // 3. Reverse the suffix
            reverse(arr, pivot + 1, arr.length - 1);
        }

        // 4. Print result
        System.out.print("Next permutation is: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    private static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String s[]) {
        int arr[] = {1, 2, 3, 6, 5, 4};
        nextPer(arr);
    }
}
