public class SubsetsOfString{
    public static void findsubsets(String str, String ans, int i ){
        //base case
        if(i == str.length()){
            if(ans == ""){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //yes case
        findsubsets(str, ans+str.charAt(i), i+1);
        //no case
        findsubsets(str, ans, i+1);
    }
    public static void main(String s[]){
        String str ="abc";
        findsubsets(str, "", 0);
    }
}