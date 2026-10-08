public class pIII {

    public static void main(String[] args) {

        int number = 123;
        int reversed = 0;

        while (number > 0) {
             
            int a = number % 10;
            int b = number / 10;

            System.out.println(b + a);
        }
    }

}