import java.util.*;

public class ReinXXV {
    public static void main(String[] args) {

        System.out.println("Enter a number between to get multiplication table: ");
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int multiplier = 1;

        while (multiplier <= 10) {

            int multiply = input * multiplier;

            System.out.println(input + " x " + multiplier + " = " + multiply);

            multiplier++;
        }
    }
}