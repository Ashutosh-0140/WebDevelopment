class ContainerWithMostWater{
    public static int mostWater(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int height = Math.min(arr[i], arr[j]);
                int width = j-i;
                int water = height*width;
                if(water>max){
                    max = water;
                }
            }
        }
        return max;
    }
    public static void main(String s[]){
        int arr[] ={2, 3,4,2,6,3,7};
        int max = mostWater(arr);
        System.out.println(max);
    }
}