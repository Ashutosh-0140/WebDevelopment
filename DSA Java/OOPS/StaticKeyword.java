class Student{
    String name;
    static String Schoolname;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}

public class StaticKeyword{
    public static void main(String s[]){
        Student s1 = new Student();
        s1.setName("Ashu");
        s1.Schoolname = "K.ch Palli";

        Student s2 = new Student();
        s2.setName("Ashutosh");
        s2.Schoolname = "UPS";

        System.out.println(s1.getName()+" - "+s1.Schoolname);
        System.out.println(s2.getName()+" - "+s2.Schoolname);
    }
}