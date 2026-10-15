import java.util.Scanner;

public class PCXII {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double distance = scan.nextDouble();

        System.out.print("Enter vehicle mileage (km/litre): ");
        double vehicleMileage = scan.nextDouble();

        System.out.print("Enter fuel price per litre (₹): ");
        double fuelPrice = scan.nextDouble();

        double fuelRequired = distance / vehicleMileage;
        double totalCost = fuelRequired * fuelPrice;

        System.out.println("Fuel required: " + fuelRequired + " litres");
        System.out.println("Total fuel cost: ₹" + totalCost);

        scan.close();
    }
}