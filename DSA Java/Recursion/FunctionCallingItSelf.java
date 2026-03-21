class FunctionCallingItSelf{
    public static void main(String s[]){
        ashu(5);
    }
    public static void ashu(int n){
        if(n== -1){
            //System.out.println(n);
            return;
        }
        System.out.println(n);
        ashu(n-1);
    }
}