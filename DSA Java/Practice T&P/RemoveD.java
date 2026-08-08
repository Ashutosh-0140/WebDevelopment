public class RemoveD {
    public static int remove(int arr[]) {
        if (arr.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 4, 4};
        int newLength = remove(arr);

        for (int i = 0; i < newLength; i++) {
            System.out.println(arr[i]);
        }
    }
}
