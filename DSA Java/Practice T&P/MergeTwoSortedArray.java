public class MergeTwoSortedArray {
    public static void merge(int arr1[], int arr2[]){
        int i =0;
        int min =Math.min(arr1.length, arr2.length);
        int ans[]= new int[arr1.length+arr2.length];
        for(i; min<arr1.length; i++){
            if(arr1[i]<arr2[i]){
                ans[i] = arr1[i];
            }
            else ans[i] = arr2[i];
        }

    }
    public static void main(String s[]){
        int arr1[] ={1,2,3,9};
        int arr2[] ={4,5,6};
        merge(arr1, arr2);
    }
}
