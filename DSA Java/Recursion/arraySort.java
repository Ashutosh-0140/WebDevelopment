class arraySort{
    static boolean isSort(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSort(arr, i+1);
    }
public static void main(String s[]){
    int arr[] = {1,4,3,4,5};
    boolean res = isSort(arr, 0);
    System.out.println(res);
}
}