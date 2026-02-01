class Multi_Level_Inheritance{
    public static void main(String s[]){
        ashu a1 = new ashu();
        a1.eat();
        a1.breathe();
        a1.walk();
        a1.code();
    }
}

class Animal{
    void eat(){
        System.out.println("Can eat.");
    }
    void breathe(){
        System.out.println("Can breathe.");
    }
}

class mamals extends Animal{
    void walk(){
        System.out.println("Can walk");
    }
}

class ashu extends mamals{
    void code(){
        System.out.println("I can code.");
    }
}