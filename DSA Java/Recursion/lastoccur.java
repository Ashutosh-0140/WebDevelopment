class lastoccur{
    static void  Inindex(int arr[], int key, int idx){
        if(idx == 0){
            System.out.println("Not found");
            return;
        }
        if(arr[idx]==key){
            System.out.println("Found at index:"+idx);
            return;
        }
        Inindex(arr, key, idx-1);
    }
    public static void main(String s[]){
        int arr[] = {1, 3, 2, 4,2, 5, 6, 4,5, 6};
        int key = 5;
        int idx = arr.length-1;
        Inindex(arr, key, idx);
    }
}