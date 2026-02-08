public class IndicesOfElement{
    public static void FindIndices(int arr[], int key, int idx){
        if(idx == arr.length-1){
            if(arr[idx]==key){
                System.out.print(idx);
            }
            return;
        }
        if(arr[idx] == key){
            System.out.print(idx+" ");
            FindIndices(arr, key, idx+1);
        }
        else{
            FindIndices(arr, key, idx+1);
        }
    }
    public static void main(String s[]){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        int idx = 0;
        FindIndices(arr, key, idx);
    }
}