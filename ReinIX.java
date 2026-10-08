import java.util.Scanner;

public class ReinIX {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter payment method (cash/card/upi/wallet): ");
        String payment = input.nextLine();

        switch(payment){
            case "cash":
                System.out.println("Please pay cash at counter.");
                break;
            case "card":
                System.out.println("Please pay card at card reader.");
                break;
            case "upi":
                System.out.println("Please pay UPI at upi scanner.");
                break;
            case "wallet":
                System.out.println("Please pay wallet at counter.");
                break;
        }
    }
}