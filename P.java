//Basic calculator with user input.

import java.util.Scanner;

public class P {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Select an operation +, -, *, / or type 'exit' to quit: ");
            String askOperations = sc.nextLine();

            if (askOperations.equals("exit")) {
                break;
            }

            System.out.print("Enter first number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = sc.nextInt();

            sc.nextLine();

            if (askOperations.equals("+")) {

                int addition = firstNumber + secondNumber;
                System.out.println("Addition: " + addition);

            } else if (askOperations.equals("-")) {

                int subtraction = firstNumber - secondNumber;
                System.out.println("Subtraction: " + subtraction);

            } else if (askOperations.equals("*")) {

                int multiplication = firstNumber * secondNumber;
                System.out.println("Multiplication: " + multiplication);

            } else if (askOperations.equals("/")) {

                int division = firstNumber / secondNumber;
                System.out.println("Division: " + division);

            } else {

                System.out.println("Something went wrong");
            }
        }

        sc.close();
    }
}