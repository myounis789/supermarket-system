// Cart class representing a shopping cart in the supermarket checkout system
import java.util.ArrayList;

public class Cart {
    // Private instance variable to store the list of items in the cart
    private ArrayList<Item> items;

    // Constructor to initialize an empty cart with no items
    public Cart() {
        items = new ArrayList<>(); // Create a new ArrayList to hold the items in the cart
    }

    // Method to add an item to the cart
    public void addItem(Item item) {
        items.add(item); // Add the given item to the list of items in the cart
    }

    // Method to calculate the total price of all items in the cart
    public double calculateTotal() {
        double total = 0; // Initialize the total price to 0
        // Loop through each item in the cart and add its price to the total
        for (Item item : items) {
            total += item.getPrice(); // Add the price of the current item to the total
        }
        return total; // Return the final total price
    }
}
