public class FirstOccurrence {
    
    // Recursive function to find first occurrence
    public static int firstOccurrence(int[] arr, int x, int index) {
        // Base case: if index reaches end of array
        if (index == arr.length) {
            return -1;
        }
        
        // If element found at current index
        if (arr[index] == x) {
            return index;
        }
        
        // Recursive call for next index
        return firstOccurrence(arr, x, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3};
        int x = 3;

        int result = firstOccurrence(arr, x, 0);
        
        if (result != -1) {
            System.out.println("First occurrence of " + x + " is at index: " + result);
        } else {
            System.out.println(x + " not found in array.");
        }
    }
}