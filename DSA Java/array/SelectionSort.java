public class SelectionSort{
    public static void Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minValue = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minValue]){  //in decreasing order you need to change < to >
                    int temp = arr[j];                    
                    arr[j] = arr[minValue];
                    arr[minValue] = temp;
                }
            }
        }
    }
    public static void main(String s[]){
        int arr[] = {1, 3, 2, 5, 4};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}