class Print_Increase{
    void printInc(int num){
        if(num ==1){
            System.out.print(num+" ");
            return;
        }
        printInc(num-1);
        System.out.print(num+" ");

    }
    public static void main(String s[]){
        int number = 5;
        Print_Increase p1 = new Print_Increase();
        p1.printInc(number);
    }
}