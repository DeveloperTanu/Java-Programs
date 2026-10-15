import java.util.Scanner;

public class PIV {
    public static void main(String[] args){

        System.out.print("Enter your age: ");
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();
        System.out.printf("Your age is %d.%n", age);

        scan.close();

    }
}
