public class ProductExceptSelf{
    public static void findProduct(int nums[], int arr[]){
        int product = 1;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i == j){
                    continue;
                }
                else{
                    product *= nums[j];
                }
            }
            arr[i] = product;
            
            product = 1;
        }
    }
    public static void main(String s[]){
        int nums[] = {1, 2, 3, 4};
        int arr[] = new int[nums.length];
        findProduct(nums, arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}