public class PCX {
    public static void main(String[] args){

        int a, b;

        a = 3;
        b = 12;

        if(a > 0 && b > 0){
            double formulaOutput = (double) (a*a + b*b) / (2 * a * b);

            System.out.println("formula output: " + formulaOutput);
        }

    }
}
