import java.util.Stack;
class nextGreater{
    public static void main(String s[]){
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s1 = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        for(int i = arr.length-1; i>=0;i--){
            //1 whiole loop
            while(!s1.isEmpty() && arr[s1.peek()] <= arr[i]){
                s1.pop();
            }

            //if-else
            if(s1.isEmpty()){
                nxtGreater[i] = -1;
            }
            else{
                nxtGreater[i] = arr[s1.peek()];
            }

            //3 push into stack
            s1.push(i);
        }
        for(int i = 0; i<arr.length;i++)
        System.out.println(arr[i]);
    }
}