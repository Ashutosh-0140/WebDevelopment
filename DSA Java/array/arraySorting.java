public class arraySorting{
    public void Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("{");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("}");
    }
    public static void main (String s[]){
        int arr[] = {1, 3, 2,7, 5, 6, 4};
        int arr1[] = {1, 3, 2,7, 5, 6, };
        int arr2[] = {1, 3, 2,7, 6, 4};
        int arr3[] = {1, 3, 2,7, 5, 4};
        arraySorting sort= new arraySorting(); 
        sort.Sort(arr);
        System.out.println();
        sort.Sort(arr1);
        System.out.println();
        sort.Sort(arr2);
        System.out.println();
        sort.Sort(arr3);
    }
}