public class Main {
    public static void main(String[] args) {
        System.out.println("Supermarket Checkout System: ");
        
        // Creating items with price and special offers
        Item item1 = new Item("Apple", 0.50, 3, 1.30); // Special offer: 3 for £1.30
        Item item2 = new Item("Banana", 0.30, 2, 0.45); // Special offer: 2 for £0.45
        Item item3 = new Item("Carrot", 0.20, 0, 0); // No special offer
        Item item4 = new Item("Date", 0.15, 0, 0); // No special offer
 
        Cart cart = new Cart();
        cart.addItem(item1, 7); // 7 Apples
        cart.addItem(item2, 5); // 5 Bananas
        cart.addItem(item3, 2); // 2 Carrots
        cart.addItem(item4, 2); // 2 Dates
 
        double total = cart.calculateTotal();
        System.out.println("Total Price: £" + total);
    }
 }
 