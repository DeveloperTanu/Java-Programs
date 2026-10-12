class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

}

class Teacher extends Person {
    
}

public class ReinXVII {
    public static void main(String[] args) {
        Student s1 = new Student();
        Teacher t1 = new Teacher();

        t1.name = "NoName";
        t1.age = 20;
        // t1.phoneNo = "9000071902";

        s1.name = "Developer";
        s1.age = 19;

        s1.display();
        t1.display();
    }
}