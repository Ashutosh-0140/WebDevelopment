public class LastOccurrence {
    
    // Recursive function to find last occurrence
    public static int lastOccurrence(int[] arr, int x, int index) {
        // Base case: if index reaches end of array
        if (index == arr.length) {
            return -1;
        }
        
        // Recursive call for next index
        int result = lastOccurrence(arr, x, index + 1);
        
        // If found later, return that index
        if (result != -1) {
            return result;
        }
        
        // Otherwise check current index
        if (arr[index] == x) {
            return index;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3};
        int x = 3;

        int result = lastOccurrence(arr, x, 0);
        
        if (result != -1) {
            System.out.println("Last occurrence of " + x + " is at index: " + result);
        } else {
            System.out.println(x + " not found in array.");
        }
    }
}