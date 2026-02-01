class Inheritance{
    public static void main(String s[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();

    }
}

class Animal{
    void eat(){
        System.out.println("I can eat (Parent class).");
    }

    void breathe(){
        System.out.println("I can Breathe (Parent class).");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("I can swim (Child class)");
    }
}