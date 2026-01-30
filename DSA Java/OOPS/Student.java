class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Custom copy constructor
    Address(Address other) {
        this.city = other.city; // primitive/immutable field, safe to copy directly
    }
}

class Student {
    int id;
    String name;
    Address address;

    Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Custom copy constructor (deep copy)
    Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.address = new Address(other.address); // duplicate referenced object
    }

    void display() {
        System.out.println(id + " " + name + " " + address.city);
    }

    public static void main(String[] args) {
        Address addr1 = new Address("Berhampur");
        Student s1 = new Student(101, "Ashutosh", addr1);

        Student s2 = new Student(s1); // deep copy using custom logic
        s2.address.city = "Bhubaneswar"; // change in s2’s address

        s1.display(); // 101 Ashutosh Berhampur
        s2.display(); // 101 Ashutosh Bhubaneswar
    }
}