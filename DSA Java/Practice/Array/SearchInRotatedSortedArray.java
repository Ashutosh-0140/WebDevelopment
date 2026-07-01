class SearchInRotatedSortedArray{
    public static void search(int arr[], int target){
        int s =0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == target){
                System.out.println("Found");
                break;
            }
            if(arr[s]<=arr[mid]){
                if(arr[s]<=target && target<arr[mid]){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
            else{
                if(target >arr[mid] && target<=arr[e]){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }
            System.out.println("Not found");
        }
    }
    public static void main(String s[]){
        int arr[] = {6,7,8,1,2,3,4,5};
        search(arr, 2);
    }
}