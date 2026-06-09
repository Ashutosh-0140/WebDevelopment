import java.util.Arrays;
public class clothStore {
    public static void main(String s[]){
        int arr[] = {1,2,3,1,2,3,5,6,7};
        Arrays.sort(arr);
        int i = 0;
        int pair = 0;

        while(i<arr.length){
            if(i == arr.length-1){
                break;
            }
            if(arr[i]==arr[i+1]){
                pair++;
                i +=2;
            }
            else {
                i++;
            }
        }
        System.out.println(pair);
    }
}
