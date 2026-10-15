import java.util.Scanner;

public class PCVIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, d, e;

        a = 2;
        b = 4;
        c = 6;
        d = 8;
        e = 10;

        int avgOfValues = (a + b + c + d + e) / 5;

        System.out.println("The avg of values: " + avgOfValues);
        scan.close();
    }
}
