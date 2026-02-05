class Recursion_Print_number{
    void decNumber(int num){
        if(num==1){
            System.out.print(num +" ");
            return;
        }
        System.out.print(num+" ");
        decNumber(num -1);
    }
    public static void main(String s[]){
        int number = 10;
        Recursion_Print_number n1 = new Recursion_Print_number();
        n1.decNumber(number);
    }
}