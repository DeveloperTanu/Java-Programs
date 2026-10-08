import java.util.Scanner;

public class ReinVII {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.println("Enter number of items ordered: ");
        int items = input.nextInt();

        System.out.println("Enter price per item: ");
        double pricePerItem = input.nextDouble();

        double totalBill = items * pricePerItem;
        System.out.printf("%n--- Bill Summary ---%n");

        System.out.printf("Customer Name: %s%n", customerName);

        System.out.printf("Items ordered: %d%n", items);

        System.out.printf("Total bill: $%.2f%n", totalBill);
    }
}

//$%.2f%n, display the number of zeroes after decimal (replace the 2 with other number) or use %d%n