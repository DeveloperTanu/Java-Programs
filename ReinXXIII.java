public class ReinXXIII {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;

        int o = 1;

        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        do {
        System.out.println(j);
        o++;
        } while (o <= 5);

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }
        
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 3; k++) {
                System.out.print("* ");
            }

                System.out.println();
        }
    }
}