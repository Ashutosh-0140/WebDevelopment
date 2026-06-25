import java.util.*;
class ChocolaProblem{
    public static void main(String s[]){
        int n = 4, m = 6;
        Integer costVar[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVar, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h =0, v =0, hp =1, vp =1, cost = 0;
        while(h<costHor.length && v<costVar.length){
            if(costVar[v]<costHor[h]){
                cost += (costHor[h]*vp);
                hp++;
                h++;
            }else{
                cost+= (costVar[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost += (costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costHor.length){
            cost+= (costVar[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cuts = "+cost);
    }
}