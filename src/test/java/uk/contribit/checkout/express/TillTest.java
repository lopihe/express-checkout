package uk.contribit.checkout.express;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TillTest {
    @Test
    public void testNullItem() {
        Till till = new Till();
        till.process(null);
        assertEquals(0, till.getTotal());
    }

    @Test
    public void testAppleTotal() {
        Till till = new Till();
        till.process(Item.APPLE);
        assertEquals(Item.APPLE.getPrice(), till.getTotal());
    }

    @Test
    public void testOrangeTotal() {
        Till till = new Till();
        till.process(Item.ORANGE);
        assertEquals(Item.ORANGE.getPrice(), till.getTotal());
    }

    @Test
    public void testAppleOrangeTotal() {
        Till till = new Till();
        till.process(Item.APPLE);
        till.process(Item.ORANGE);
        assertEquals(Item.APPLE.getPrice() + Item.ORANGE.getPrice(), till.getTotal());
    }
}
