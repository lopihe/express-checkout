package uk.contribit.checkout.express;

public enum Item {
    APPLE(60), ORANGE(25);

    Item(int price) {
        this.price = price;
    }

    private int price; // price in pence

    public int getPrice() {
        return price;
    }
}
