public class binary_search{

    public static void search(int arr[], int key){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        

        while(start<=end){
            int mid = (start +end)/2;
            if(key==arr[mid]){
                System.out.println("The number is found at index:"+mid);
            }
            if(key>arr[mid]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
    }
    public static void main (String s[]){
        int arr[] = {12,23,34,45,56,67,78,89,90};
        int key = 34;

        search(arr, key);
    }
}