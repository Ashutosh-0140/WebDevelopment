public class ArrayReverse {
    public static void main(String s[]){
        int arr[]  = {1,2,3,4,5,6,7};
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}
