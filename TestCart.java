

public class TestCart {

    @Test
    public void testCalculateTotal() {
        Cart cart = new Cart();
        cart.addItem(new Item("Apple", 1.50));
        cart.addItem(new Item("Banana", 0.80));

        double total = cart.calculateTotal();
        assertEquals(2.30, total, 0.01);
    }
}
