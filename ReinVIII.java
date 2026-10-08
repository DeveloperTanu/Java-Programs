import java.util.Scanner;

public class ReinVIII{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an amount: ");
        int bill = input.nextInt();

        if(bill >= 1000){
            System.out.println("Big spender");
        }else if(1000 > bill && bill >= 500){
            System.out.println("Medium spender");
        }else if(bill > 0){
            System.out.println("Low Spender");
        }else{
            System.out.println("Wrong amount");
        }
    }
}