import java.util.Scanner;

public class PCII {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = scan.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = scan.nextInt();

        int areaOfRectangle = 2 * (length + breadth);

        System.out.println("The area of rectangle is: " + areaOfRectangle);

        scan.close();
    }
}
