public class PCIX {
    public static void main(String[] args){
        int a = 123;

        int hundreds = a / 100;
        int tens = (a % 100) / 10;
        int ones = a % 10;

        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);
    }
}
