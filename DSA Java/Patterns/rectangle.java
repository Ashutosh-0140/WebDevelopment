class rectangle{
    public static void main(String s[]){
        int n = 4;
        for(int i=1; i<=n; i++){
            if(i==1 || 1==n){
                for(int j = 1; j<=n; j++){
                    System.out.print("*");
                }
                System.err.println("");
            }
            else{
                for(int j = 1; j<=n; j++){
                    while(j==1 || j==n){
                        System.out.println("*");
                        break;
                    }
                }
            }

        }
        System.out.println();
    }
}