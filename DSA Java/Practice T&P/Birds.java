import java.util.HashMap;
import java.util.Map;

public class Birds{
    public static int maxSpotted(int arr[]){
        Map<Integer, Integer> MyDict = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (MyDict.containsKey(arr[i])) {
                MyDict.put(arr[i], MyDict.get(arr[i]) + 1);
            } else {
                MyDict.put(arr[i], 1);
            }
        }
        
        int winnerKey = -1; 
        int highestValue = Integer.MIN_VALUE; 

        for (int currentKey : MyDict.keySet()) {
            int currentValue = MyDict.get(currentKey);
            if (currentValue > highestValue) {
                highestValue = currentValue;
                winnerKey = currentKey;
            } 
            else if (currentValue == highestValue) {
                if (currentKey < winnerKey) {
                    winnerKey = currentKey;
                }
            }
        }

        return winnerKey;
    }
    public static void main(String s[]){
        int arr[] = {1,2,3,4,3,2,5,4,1,2,2,2,2,2};
        int maxBird = maxSpotted(arr);
        System.out.println("Max Spotted bird is"+maxBird);
    }
}