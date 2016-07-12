package uk.contribit.checkout.express;

public class CheckoutApp {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide list of items");
        }
        Till till = new Checkout().processItems(args[0]);
        System.out.println(till.getTotal());
    }
}
