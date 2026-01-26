public class sub_array{

    public static void sub(int arr[]){
        int ts = 0;
        for(int i = 0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(" "+arr[k]);
                }
                System.out.print(",");
                ts++;
            }
            System.out.println("");
        }
        System.out.println("Total number of sub array is "+ts);
    }

    public static void main(String s[]){
        int arr[] = {2,4,6,8,10};
        sub(arr);
    }
}