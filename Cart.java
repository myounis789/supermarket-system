
import java.text.DecimalFormat;
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
    public void addItem(Item item, int quantity) {
        // Update the item quantity in the cart
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

// Adjusting total calculation logic to apply discounts correctly:
    public double calculateTotal() {
        double total = 0;

        // Loop through each item in the cart
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();

            // Apply the special offer if applicable
            if (item.getOfferQuantity() > 0 && quantity >= item.getOfferQuantity()) {
                int offerSets = quantity / item.getOfferQuantity(); // Number of offer sets
                int remainingItems = quantity % item.getOfferQuantity(); // Remaining items
                total += offerSets * item.getOfferPrice() + remainingItems * item.getPrice();
            } else {
                total += quantity * item.getPrice(); // No special offer
            }
        }
        return total; // Return the total price
    }

    // Updated method to print shopping list with correct pricing
    public void printShoppingList() {
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();

            // Calculate the total cost for the item considering the offer
            double itemTotal = 0;
            if (item.getOfferQuantity() > 0 && quantity >= item.getOfferQuantity()) {
                int offerSets = quantity / item.getOfferQuantity(); // Apply the offer
                int remainingItems = quantity % item.getOfferQuantity();
                itemTotal = offerSets * item.getOfferPrice() + remainingItems * item.getPrice();
            } else {
                itemTotal = quantity * item.getPrice(); // No special offer
            }

            // Print the item and its total cost
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(item.getName() + " x" + quantity + " = £" + df.format(itemTotal));
        }
    }
}
