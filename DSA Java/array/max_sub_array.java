public class max_sub_array{

    public static void sub(int arr[]){
        int curMax;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                curMax =0;
                for(int k=i; k<=j; k++){
                    curMax = curMax + arr[k];
                }
                System.out.println(curMax);
                if(curMax> max){
                    max = curMax;
                    
                }
            }
        }
         System.out.println("Max sub array is :"+max);
    }

    public static void main(String s[]){
        int arr[] = {2,4,6,8,10};
        sub(arr);
    }
}