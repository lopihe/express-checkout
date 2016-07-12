package uk.contribit.checkout.express;

public class Till {
    private int total;

    public void process(Item item) {
        if (item != null) {
            total += item.getPrice();
        }
    }

    public int getTotal() {
        return total;
    }
}
