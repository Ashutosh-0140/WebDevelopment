public class BinaryStringsProblem{
    public static void Strings(int n, String str, int lp){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lp==0){
            Strings(n-1, str+"1", 1);
        }
        Strings(n-1, str+"0", 0);
    }
    public static void main(String s[]){
        int n = 3;
        Strings(n, "", 0);
    }
}