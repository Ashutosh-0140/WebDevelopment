 class trap_water{

    public static void water_contain(int height[]){

        //calculate the left max array
        int n = height.length;
        int left_max[n] = new int[0];

        left_max[0] = height[0];
        for(int i = 1; i <= n-1; i++){
        left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        //calculate right max array
        int right_max[n] = new int[0];
        right_max[n-1] = height[n-1];
        for( int i = n-2; i>=0; i--){
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }

        int total_trap = 0;
        for(int i =0; i <= n-1; i++){
            total_trap +=  Math.min(left_max[i], right_max[i]) - height[i];
        }
        System.out.println("Total Trapping Rain Water is "+total_trap);
    }

    public static void main (String s[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        water_contain(height);
    }
 }