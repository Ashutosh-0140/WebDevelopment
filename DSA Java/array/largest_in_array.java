public class largest_in_array{
    public static void largest(int arr[]){
        int big = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]> big){
                big = arr[i];
            }
        }
        System.out.println("The largest number is "+big);
    }
    public static void smallest(int arr[]){
        int small = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]< small){
                small = arr[i];
            }
        }
        System.out.println("The smallest number is "+small);
    }

    public static void main(String s[]){
        int arr[]={1,2,3,2,4,3,5,4,5,43};

        largest(arr);
        smallest(arr);
    }
}