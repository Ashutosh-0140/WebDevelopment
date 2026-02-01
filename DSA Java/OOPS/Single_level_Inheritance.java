class Single_level_Inheritance{
    public static void main(String s[]){
        mamals human = new mamals();
        human.eat();
        human.breathe();
        human.walk();
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