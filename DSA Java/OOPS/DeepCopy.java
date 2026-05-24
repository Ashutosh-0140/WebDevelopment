public class DeepCopy{
    String name;
    int age;
    int marks[];
    DeepCopy(String name, int age, int marks[]){
        this.name = name;
        this.age = age;
        this.marks= new int[marks.length];
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = marks[i];
        }
    }
    void show(){
        System.out.println("Name "+name+ " Age "+age);
        for(int i = 0; i<marks.length; i++){
            System.out.println(this.marks[i]);
        }
    }
    public static void main(String s[]){
        int marks[] = {100, 102, 103};
        DeepCopy d1 = new DeepCopy("Ashu", 21, marks);
        d1.show();

        DeepCopy d2 = new DeepCopy("Ashu", 21, marks);
        d2.marks[0] = 99;
        d2.show();
    }
}