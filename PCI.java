import java.util.Scanner;

public class PCI {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.err.print("Enter first number: ");
        int a = scan.nextInt();
        System.err.print("Enter second number: ");
        int b = scan.nextInt();

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);

        scan.close();
    }
}
