import java.util.HashMap;
import java.util.Map;

public class Cart {
    // Private field for storing items in the cart
    private Map<Item, Integer> items;

    // Constructor initializes the items map
    public Cart() {
        items = new HashMap<>();
    }

    // Method to add items to the cart
    // Takes an Item object and a quantity to add the item to the cart
    public void addItem(Item item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    // Method to calculate the total price of items in the cart, applying special offers if applicable
    public double calculateTotal() {
        double total = 0;

        // Loop through each item in the cart
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();

            // Apply special pricing if applicable
            if (item.getOfferQuantity() > 0 && quantity >= item.getOfferQuantity()) {
                int offerSets = quantity / item.getOfferQuantity(); // Number of offer sets
                int remainingItems = quantity % item.getOfferQuantity(); // Remaining items after applying offers
                total += offerSets * item.getOfferPrice() + remainingItems * item.getPrice(); // Calculate total with special offer
            } else {
                total += quantity * item.getPrice(); // Calculate total without special offer
            }
        }
        return total; // Return the calculated total price
    }
}
