class Sum_Of_NaturalNumber{
    int sum = 0;
    void sumIs(int number){
        if(number == 0){
            System.out.print(sum);
            return;
        }
        sum += number;
        sumIs(number-1);
    }
    public static void main(String s[]){
        Sum_Of_NaturalNumber s1 = new Sum_Of_NaturalNumber();
        int num = 4;
        s1.sumIs(num);
    }
}