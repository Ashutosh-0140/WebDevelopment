class findUniqueAmongOdd {
    public static int singleNumber(int[] nums) {
    int ones = 0, twos = 0;
    for (int num : nums) {
        ones = (ones ^ num) & ~twos;
        twos = (twos ^ num) & ~ones;
    }
    return ones;
}
    public static void main(String s[]){
        int arr[] = {1, 2,2,2};
        int res = singleNumber(arr);
        System.out.println(res);
    }
}