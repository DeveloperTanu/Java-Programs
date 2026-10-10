class Student {
    String name;
    String email;
    int age;

    Student(String stdname, int stdage) {
        this.name = stdname;
        this.age = stdage;
    }
}

public class ReinXIV {
    public static void main(String[] args) {

        Student s1 = new Student("StudentOne", 22);
        Student s2 = new Student("StudentTwo", 30);

        System.out.println(s1.name);
        System.out.println(s1.age);

        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}