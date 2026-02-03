class Student{
    String name;
    static String Schoolname;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    int phy;
    int chem;
    int Math;
    static int percentage(int phy, int chem, int Math){
        return (phy+chem+Math)/3;
    }
}

public class StaticMethod{
    public static void main(String s[]){
        Student s1 = new Student();
        s1.setName("Ashu");
        s1.Schoolname = "K.ch Palli";


        Student s2 = new Student();
        s2.setName("Ashutosh");
        s2.Schoolname = "UPS";

        System.out.println(s1.getName()+" - "+"Percentage is:"+s1.percentage(59, 32, 67)+" and Schoo name is "+s1.Schoolname);
        System.out.println(s2.getName()+" - "+"Percentage is:"+s2.percentage(56, 67,69)+" and School name is "+s2.Schoolname);
    }
}