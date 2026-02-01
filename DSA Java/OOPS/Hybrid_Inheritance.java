class Hybrid_Inheritance{
    public static void main(String s[]){
        human h1 = new human();
        h1.eat();
        h1.breathe();
        //a1.walk(); It can not work. 
        //h1.fly();

        System.out.println("----------------------");

        dog d1 = new dog();
        d1.eat();
        d1.breathe();
        d1.walk(); 

        System.out.println("----------------------");

        eagle e1 = new eagle();
        e1.eat();
        e1.breathe();
        //a1.walk(); It can not work. 
        e1.fly();

        System.out.println("----------------------");

        penguins p1 = new penguins();
        p1.eat();
        p1.breathe();
        //p1.walk(); 
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
class human extends mamals{
    void walk(){
        System.out.println("Can walk");
    }
}
class dog extends mamals{
    void walk(){
        System.out.println("Can walk");
    }
}

class aves extends Animal{
    void fly(){
        System.out.println("can fly.");
    }
}

class eagle extends aves{
    void fly(){
        System.out.println("can fly.");
    }
}

class penguins extends aves{
    void fly(){
        System.out.println("can fly.");
    }
}