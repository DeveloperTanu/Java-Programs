import java.util.Scanner;

public class PCVII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter principal: ");
        int principal = scan.nextInt(); 

        System.out.print("Enter rate: ");
        float rate = scan.nextFloat(); 

        System.out.print("Enter time: ");
        int time = scan.nextInt(); 

        float simpleInterest = (principal * rate * time)/100;
        System.out.println("Simple interest is: " + simpleInterest);
        scan.close();
    }
}
