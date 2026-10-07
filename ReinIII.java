public class ReinIII {
    public static void main(String[] args){
        double cartTotal = 350.0;
        double freeDeliveryLimit = 399.0;
        double walletBalance = 320.0;
        int customerAge = 19;
        int minAge = 18;

        boolean isExactMatch = cartTotal == walletBalance;
        
        System.out.println("Is cart and wallet values are equal: " + isExactMatch);

        boolean notEqual = cartTotal != walletBalance;

        boolean leftGreaterThanRight = freeDeliveryLimit > walletBalance;
        System.out.println("Is Left value greater than Right? " + leftGreaterThanRight);

        boolean ageRequirement = customerAge >= minAge;
        System.out.println("Is customer's age is greater or equal than requirement age? " + ageRequirement);

        System.out.println("Is cart wallet values aren't equal: " + notEqual);
    }
}
