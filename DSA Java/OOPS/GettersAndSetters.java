class GettersAndSetters{
    public static void main(String s[]){
        pen p1 = new pen();
        p1.set_name("Blue Pen");
        p1.get_name();
    }
}
class pen{
    String name;
    String color;
    void get_name(){
        System.out.println(name);
    }

    void set_name(String name){
        this.name = name;
    }
}