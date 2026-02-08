class FindUnique {
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for(int i = 0; i<nums.length; i++){
            unique = unique^nums[i];
        }
        return unique;
    }
   
    public static void main(String s[]){
        int arr[] = {1, 2, 3,3, 2};
        int res = singleNumber(arr);
        System.out.println(res);
    }
}