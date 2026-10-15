import java.util.Scanner;

public class PCVI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double aDoubleValue = scan.nextDouble();
        System.out.println();

        System.out.println("Double value is: " + aDoubleValue);
        System.out.println();

        int doubleToInteger = ( int ) aDoubleValue;
        System.out.println("Integer value is: " + doubleToInteger);
        scan.close();
    }
}
