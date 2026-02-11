import java.util.Scanner;

public class SortRotate {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is found
            if (nums[mid] == target) return mid;

            // Check which half is sorted
            if (nums[left] <= nums[mid]) {
                // Left half is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // target lies in left half
                } else {
                    left = mid + 1; // target lies in right half
                }
            } else {
                // Right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // target lies in right half
                } else {
                    right = mid - 1; // target lies in left half
                }
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements of sorted & rotated array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target element to search:");
        int target = sc.nextInt();

        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array.");
        }

        sc.close();
    }
}