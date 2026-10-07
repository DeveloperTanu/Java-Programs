public class ReinIV {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even.");
        } else if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println("One number is odd.");
        } else {
            System.out.println("Both numbers are odd.");
        }
    }
}