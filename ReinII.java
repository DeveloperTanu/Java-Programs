public class ReinII {
    public static void main(String[] args){
        double cartTotal = 120.0;
        System.out.println();

        cartTotal += 30;
        System.out.println("After adding the GST of 30 in the cart: " + cartTotal);
        
        cartTotal *= 30;
        System.out.println("After X30 items to the cart: " + cartTotal);

        double newCartTotal = 120.0;
        newCartTotal /= 30;
        System.out.println("After splitting X30 times in the cart: " + newCartTotal);
    }
}
