// Main class to execute the Supermarket Checkout System
public class Main {
    // Main method where the program execution begins
    public static void main(String[] args) {
        // Print the heading of the system
        System.out.println("Supermarket Checkout System: ");
        
        // Create two items with name and price
        Item item1 = new Item("Apple", 1.50);  // Item with name "Apple" and price $1.50
        Item item2 = new Item("Banana", 0.80); // Item with name "Banana" and price $0.80
        
        // Create a new Cart object to hold items
        Cart cart = new Cart();
        
        // Add the items to the cart
        cart.addItem(item1);  // Add the Apple item to the cart
        cart.addItem(item2);  // Add the Banana item to the cart
        
        // Calculate the total price of items in the cart
        double total = cart.calculateTotal();
        
        // Print the total price of items in the cart
        System.out.println("Total Price: $" + total);
    }
}
