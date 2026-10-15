import java.util.Scanner;

public class PCXI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double itemPrice = 45;

        System.out.print("Enter item quantity: ");
        double itemQuantity = scan.nextInt();

        double totalBill = itemPrice * itemQuantity;

        if (totalBill >= 1000) {

            double discount = totalBill * 0.10;
            double finalBill = totalBill - discount;
            System.out.println("Total Bill after applied 10% discount: " + finalBill);

        } else {

            System.out.println("Total bill: " + totalBill);

        }

        scan.close();
    }
}
