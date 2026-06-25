import java.util.Arrays;

public class fractionalKnapSack {

    public static void findValue(int[] weight, int[] val, int capacity) {
        int n = weight.length;

        // Matrix: each row = {weight, value, ratio}
        double[][] items = new double[n][3];
        for (int i = 0; i < n; i++) {
            items[i][0] = weight[i];              // weight
            items[i][1] = val[i];                 // value
            items[i][2] = (double) val[i] / weight[i]; // ratio
        }

        // Sort by ratio descending
        Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));

        double totalVal = 0.0;

        // Pick items greedily
        for (int i = 0; i < n; i++) {
            if (capacity >= items[i][0]) {
                capacity -= items[i][0];
                totalVal += items[i][1];
            } else {
                // take fraction of the item
                totalVal += items[i][2] * capacity;
                break;
            }
        }

        System.out.println("Total optimized value is " + totalVal);
    }

    public static void main(String[] args) {
        int bagWeight = 50;
        int[] weight = {10, 20, 32, 40};
        int[] val = {15, 25, 24, 50};
        findValue(weight, val, bagWeight);
    }
}
