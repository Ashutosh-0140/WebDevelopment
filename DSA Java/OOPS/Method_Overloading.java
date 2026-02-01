class Method_Overloading{
    public static void main (String s[]){
        calculator cal = new calculator();
        System.out.println(cal.sum(4,5));
        System.out.println(cal.sum((float)3.2,(float)4.5));
        System.out.println(cal.sum(1,2,3));
    }
}

class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
       return a+b+c;
    }
}