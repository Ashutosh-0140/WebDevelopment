public class q1 {
    public static void reverse(int st, int end,int arr[]){
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void rotate(int arr[], int k){
        reverse(0,arr.length-1,arr);
        reverse(0,k-1,arr);
        reverse(k,arr.length-1,arr);

    }
    public static void main(String s[]){
        int arr[] = {10,20,30,40,50};
        int k = 2;
        rotate(arr,k);
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
