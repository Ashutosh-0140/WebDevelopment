class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1; 
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[idx--] = nums1[i--];  // FIXED: copy from nums1
            } else {
                nums1[idx--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[idx--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int m = 4, n = 4;
        int arr1[] = new int[m + n]; // FIXED: allocate extra space
        arr1[0] = 2; arr1[1] = 4; arr1[2] = 6; arr1[3] = 8;
        int arr2[] = {1, 3, 5, 6};

        MergeTwoSortedArray m1 = new MergeTwoSortedArray();
        m1.merge(arr1, m, arr2, n);

        // Print merged array
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}