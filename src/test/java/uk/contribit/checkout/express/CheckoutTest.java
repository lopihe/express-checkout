package uk.contribit.checkout.express;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckoutTest {
    @Test
    public void testSingleItem() {
        Checkout c = new Checkout();
        Till t = c.processItems("APPLE");
        assertEquals(Item.APPLE.getPrice(), t.getTotal());
    }

    @Test
    public void testDoubleItem() {
        Checkout c = new Checkout();
        Till t = c.processItems("APPLE APPLE");
        assertEquals(Item.APPLE.getPrice() * 2, t.getTotal());
    }

    @Test
    public void testMixedItems() {
        Checkout c = new Checkout();
        Till t = c.processItems("APPLE ORANGE");
        assertEquals(Item.APPLE.getPrice() + Item.ORANGE.getPrice(), t.getTotal());
    }

    @Test
    public void testNoItems() {
        Checkout c = new Checkout();
        Till t = c.processItems("");
        assertEquals(0, t.getTotal());
    }

    @Test
    public void testNullItems() {
        Checkout c = new Checkout();
        Till t = c.processItems(null);
        assertEquals(0, t.getTotal());
    }
}
