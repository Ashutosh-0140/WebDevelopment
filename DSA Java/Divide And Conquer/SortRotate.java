public class SortRotate{
    public static int Search(int arr[], int target, int Si, int Ei){
        if(Si > Ei){
            return -1;
        }

        int mid = (Si+Ei)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[Si]<= arr[mid]){
            if(arr[Si] <= target && target < arr[mid]){
                return Search(arr, target, Si, mid-1);
            }else{
                return Search(arr, target, mid+1, Ei);
            }
        }

        else{
            if(arr[mid] < target && arr[Ei]>target ){
                return Search(arr, target, mid+1, Ei);
            }else{
                return Search(arr, target, Si, mid-1);
            }
        }
    }
    public static void main(String s[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 4;
        int res = Search(arr, target, 0, arr.length-1);
        System.out.println(res);
    }
}