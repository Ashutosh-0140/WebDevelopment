class Hierarchical_Inheritance{
    public static void main(String s[]){
        avs a1 = new avs();
        a1.eat();
        a1.breathe();
        //a1.walk(); It can not work. 
        a1.fly();

        System.out.println("----------------------");

        mamals a2 = new mamals();
        a2.eat();
        a2.breathe();
        a2.walk(); 
        // a2.fly(); it can not work
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

class avs extends Animal{
    void fly(){
        System.out.println("can fly.");
    }
}