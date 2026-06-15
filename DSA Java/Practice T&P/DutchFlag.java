public class DutchFlag {
    public static void main(String s[]){
        int arr[] = {1,2,1,0,1,2,0,1};
        int m = 0;
        int l = 0;
        int h = arr.length-1;
        while(!(m>h)){
            if(arr[m]==0){
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                m++;
                l++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else{
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }

}
