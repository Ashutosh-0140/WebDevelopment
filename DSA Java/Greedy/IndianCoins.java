class IndianCoins{
    public static void main(String s[]){
        int value = 590;
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int coin = 0;
        for(int i = coins.length-1;i>=0;i--){
            if(coins[i]<value){
                while(coins[i]<=value){
                    value -= coins[i];
                    coin++;
                }
            }
        }
        System.out.println("Number of coins is "+coin);
    }
}