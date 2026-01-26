public class Linear_search{
    public static int linear_search(int number[], int key){
        for(int i = 0; i<number.length; i++){
            if(number[i] == key)
            return i;
        }
        return -1;

    }

    public static void main(String s[]){
        int number[] = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        int key = 34;

        int index =linear_search(number, key);

        if(index == -1){
            System.err.print("Not found.");
        }
        else{
            System.out.print("Number is present at index "+ index);
        }
    }
}