class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I am " + name);
    }
}
public class ReinXVI{
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Developer";
        s1.age = 19;

        s1.introduce();
    }
}