public class practice {
    public static void searchMatrix(int[][] arr, int key) {
        // 1. Handle empty edge cases safely
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("Not available");
            return; // Must return here to prevent crashing below
        }

        // 2. Start at the top-right corner
        int row = 0;
        int col = arr[0].length - 1; 

        // 3. Stay within valid matrix boundaries
        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println("Found at index: " + row + ", " + col);
                return; // Stop searching once found
            }
	    else if(key <arr[row][col-1] && key < arr[row+1][col]){ row ++; col--;}
            else if (key < arr[row][col]) {
                col--; // Move LEFT because the current value is too big
            } 
            else {
                row++; // Move DOWN because the current value is too small
            }
        }
        
        // 4. If the loop ends, the key doesn't exist
        System.out.println("Not Present");
    }

    public static void main(String s[]) {
        int[][] arr = {
            {1,  4,  7,  11, 15},
            {2,  5,  8,  12, 19},
            {3,  6,  9,  16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int key = 14;
        searchMatrix(arr, key); // Fixed spelling typo
    }
}
