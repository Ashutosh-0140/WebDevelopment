public class MergeSort{
    public static void sort(int arr[], int S, int E){
        if(S>= E){
            return;
        }
        int mid = S+(E-S)/2;

        sort(arr, S, mid);
        sort(arr, mid+1, E);

        merge(arr, S, E, mid);
    }
    public static void merge(int arr[], int S, int E, int mid){
        int temp[] = new int[E-S+1];
        int i = S;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=E){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=E){
            temp[k++] = arr[j++];
        }

        for (int a = 0; a < temp.length; a++) {
            arr[S + a] = temp[a];
        }
    }
    public static void main(String s[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        sort(arr, 0, arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}