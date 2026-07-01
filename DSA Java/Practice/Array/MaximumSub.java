public class MaximumSub{
    public static void main(String s[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int cs = arr[0];
        int ms = arr[0];
        for(int i = 0; i< arr.length-1; i++){
            cs = Math.max(cs, cs+arr[i]);
            ms = Math.max(cs,ms);
        }
        System.out.println("Maximum sub array is "+ms);
    }
}