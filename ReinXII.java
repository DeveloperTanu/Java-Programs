import java.util.Scanner;

public class ReinXII {
    static String inputName(String name) {
        return name;
    }

    public static void main(String[] args) {

        System.out.print("Enter your name: ");

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String result = inputName(name);

        System.out.println("Your name is " + result + ".");

        scan.close();
    }
}