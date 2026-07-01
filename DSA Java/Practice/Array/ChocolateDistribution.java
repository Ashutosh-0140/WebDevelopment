/*Given an array arr[] of n integers where arr[i] represents the number of chocolates in ith packet.
Each packet can have a variable number of chocolates. There are m students, the task is to distribute
chocolate packets such that: 

Each student gets exactly one packet.
The difference between the maximum and minimum number of chocolates in the packets given to the students is minimized.*/

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String s[]){
        int arr[] = {7,3,2,4,9,12,56};
        Arrays.sort(arr);
        int min = 0;
        int m = 3;
        int minDiff =Integer.MAX_VALUE;

        for(int max = m-1;max < arr.length; max++){
            minDiff = Math.min(minDiff, arr[max]-arr[min]);
            min++;
        }
        System.out.println(minDiff);
    }
}
