public class ClassCancle {
    public static void isCancled(int k, int arr[]){
        int onTimeStudent = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<=0) onTimeStudent++;
        }
        if(onTimeStudent < k){
            System.out.println("Class cancled");
        }
        else{
            System.out.println("Class not cancled");
        }
    }
    public static void main(String s[]){
        int k = 3;
        int times[] ={-1, -3,-2, 4, 2};
        isCancled(k, times);
    }
}
