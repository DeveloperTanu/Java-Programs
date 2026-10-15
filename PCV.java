import java.util.Scanner;

public class PCV {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int a = scan.nextInt();

        if(a % 2 == 0){
            System.out.println(a + " is Even");
        }
        else{
            System.out.println(a + " is Odd");
        }

        scan.close();
    }
}
