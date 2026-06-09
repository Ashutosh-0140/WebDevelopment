class numberRearrange{
    public static void main(String s[]){
        String num = "459";//549
        String b = "500";
        String ans ="";
        String temp ="";

        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i)>=b.charAt(i)){
                ans = ans + num.charAt(i);
            }
            else{
                temp = temp+num.charAt(i);
            }
        }
    }
}