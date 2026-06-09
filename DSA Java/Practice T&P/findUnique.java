public class findUnique{
    public static void unique(int arr[]){
            int ans = 0;
            for(int i = 0; i<arr.length;i++){
                ans = ans^arr[i];
            }
            System.out.println("UNique number is "+ans);
        }
    public static void main(String s[]){
        int arr[] = {1,2,3,4,5,5,4,3,2,1,9};
        unique(arr);
    }
}