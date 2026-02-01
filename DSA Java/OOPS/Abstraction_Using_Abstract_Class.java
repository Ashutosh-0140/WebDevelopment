class Abstraction_Using_Abstract_Class{
    public static void main(String s[]){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Hen h2 = new Hen();
        h2.eat();
        h2.walk();
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal class constructor caalled.");
    }
    abstract void walk();
    void eat(){
        System.out.println("Animal eat");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse class constructor caalled.");
    }
    void walk(){
        System.out.println("I have four leg for walk.");
    }

}

class Hen extends Animal{
    Hen(){
        System.out.println("Hen class constructor caalled.");
    }
    void walk(){
        System.out.println("I have two leg for walk.");
    }
}