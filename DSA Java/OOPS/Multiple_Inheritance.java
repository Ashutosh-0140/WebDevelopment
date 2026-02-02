public class Multiple_Inheritance{
    public static void main(String s[]){
        Bear b1 = new Bear();
        b1.eat();
        b1.walk();
    }
}

interface Herbivore{
    void eat();
}

interface Carnivore{
    void walk();
}

class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("I can eat like Herbivore.");
    }
    public void walk(){
        System.out.println("I can walk like Carnivore.");
    }
}