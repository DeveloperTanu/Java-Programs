import java.util.Scanner;

class NewStudent {
    String name;
    String email;
    String className;
    String phoneNo;
    int Age;
    int rollNo;
    boolean isMale;
}

class ExistingStudent {
    String name;
    String email;
    String className;
    String phoneNo;
    int age;
    int rollNo;
    boolean isMale;

    ExistingStudent(String name, String email, String className,
            String phoneNo, int age, int rollNo,
            boolean isMale) {
        this.name = name;
        this.email = email;
        this.className = className;
        this.phoneNo = phoneNo;
        this.age = age;
        this.rollNo = rollNo;
        this.isMale = isMale;
    }
}

class StudentMarks extends ExistingStudent {
    int studentId;
    int marks;

    StudentMarks(String name, String email, String className,
            String phoneNo, int age, int rollNo,
            boolean isMale, int studentId, int marks) {

        super(name, email, className, phoneNo, age, rollNo, isMale);

        this.studentId = studentId;
        this.marks = marks;
    }
}

public class projectFile {
    public static void main(String[] args) {
        StudentMarks student = new StudentMarks(
                "Tanu",
                "tanu@example.com",
                "BTech CSE",
                "9876543210",
                19,
                101,
                true,
                5001,
                85);

        System.out.println(student.name);
        System.out.println(student.studentId);
        System.out.println(student.marks);
    }
}
