import java.util.Scanner;

public class PCIII{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter temperature in celcius: ");
        int c = scan.nextInt();

        int fahrenheit = (c * 9/5) + 32;

        System.out.println("The temperature in fahrenheit is: " + fahrenheit);

        scan.close();
    }
}