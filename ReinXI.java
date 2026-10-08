import java.util.Scanner;

public class ReinXI{

    static double calculateFinalBill(double bill) {
        double discount = bill * 0.10;
        double finalBill = bill - discount;
        return finalBill;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double result1 = calculateFinalBill(1200.0);
        System.out.println("Final bill 1: " + result1);

        double result2 = calculateFinalBill(1500.0);
        System.out.println("Final bill 2: " + result2);

    }
}