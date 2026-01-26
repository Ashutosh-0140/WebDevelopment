class MajorityElement {
    public int majorityElement(int[] nums) {
        int frequency = 0;
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            if(frequency == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                frequency++;
            }
            else{
                frequency --;
            }
        }
        return ans;
    }
    public static void main (String s[]){
        int nums[] = {1, 1, 1, 1, 2, 2, 3};
        MajorityElement ans = new MajorityElement();
        int res = ans.majorityElement(nums);
        System.out.println("Majority element in the array is : "+res);
    }
}