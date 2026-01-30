class Student{
    String name;
    String roll;
    String password;
    int marks[] = new int[3];

    Student(){
        this.name = name;
        this.roll = roll;
        this.password = password;
        this.marks = marks;
    }

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        this.marks = s1.marks;
    }
}

class copyConstructur{
    public static void main(String s[]){
        Student s1 = new Student();
        s1.name = "Ashu";
        s1.roll ="23cse562";
        s1.marks[0] = 87;
        s1.marks[1] = 53;
        s1.marks[2] = 90;
        System.out.println(s1.name+","+s1.roll);

        Student s2 = new Student(s1);
        s2.name = "Chintu";
        System.out.println(s2.name+","+s2.roll);
        s2.marks[0] = 97; 
        System.out.println("After changing s2 :"+s2.marks[0]);
        System.out.println("After changing s1 :"+s1.marks[0]);
        System.out.println("After changing s2.name s1.name will be  :"+s1.name);
        
    }
}