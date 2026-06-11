import java.util.Stack;
public class LargeAreaInHistogram {
    public static void LargeArea(int arr[]){
        Stack<Integer> sc = new Stack<>();
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        int MaxArea = 0;

        //calculate next samll right
        for(int i = arr.length-1; i>= 0; i--){
            while(!sc.isEmpty() && arr[sc.peek()]>=arr[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = sc.peek();
            }
            sc.push(i);
        }

        //calculate the next small left
        sc = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            while(!sc.isEmpty() && arr[sc.peek()]>=arr[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                nsl[i] = arr.length;
            }else{
                nsl[i] = sc.peek();
            }
            sc.push(i);
        }

        //calculate area width = j-i-1;
        for(int i = 0; i<arr.length; i++){
            int curMax ;
            int width = nsr[i]-nsl[i]-1;
            curMax= arr[i]*width;
            MaxArea = Math.max(MaxArea,curMax);
        }
        System.out.println("Maximum area is :"+MaxArea);

    }
    public static void main(String s[]){
        int arr[] = {2,1,5,6,2,3};
        LargeArea(arr);
    }
}
