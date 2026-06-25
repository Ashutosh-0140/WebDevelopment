import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySe{
    public static void main(String s[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sort the array according to end time
        int activity[][] = new int[start.length][3];
        for(int i = 0; i<end.length; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] =  end[i];
        }
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(activity[0][0]);
        int lastTime =activity[0][2];
        for(int i = 0; i<end.length;i++){
            if(activity[i][1]>=lastTime){
                maxAct++;
                ans.add(i);
                lastTime = activity[i][2];
            }
        }

        for(int i : ans){
            System.out.print("A"+i+",");
        }
    }
}