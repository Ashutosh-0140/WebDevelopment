class MergeSort{
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void ArrSort(int arr[], int Si, int Ei){
        int mid = Si +(Ei - Si)/2;
        if(Si>=Ei){
            return;
        }
        ArrSort(arr, Si, mid);
        ArrSort(arr,mid+1, Ei);
        merge(arr, Si, mid, Ei);
    }
    public static void merge(int arr[], int Si, int mid, int Ei){
        int temp[] = new int[(Ei - Si)+1];
        int i = Si;
        int j = mid + 1;
        int k = 0;
        while(i<= mid && j<=Ei){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(j <= Ei){
            temp[k++] = arr[j++];
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        for(k =0, i = Si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String s[]){
        int arr[] = {3, 2, 5, 6, 9, 7};
        int Si = 0;
        int Ei = arr.length-1;
        ArrSort(arr, Si, Ei);
        PrintArr(arr);    }
}