class BuySellStock {
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maximumProfit = Math.max(maximumProfit,profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maximumProfit;

        
    }
    public static void main(String s[]){
        int stocks[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit : "+ maxProfit(stocks));
    }
}