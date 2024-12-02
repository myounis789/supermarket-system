import java.util.ArrayList;

public class Cart {
    // Private field for storing items in the cart
    private ArrayList<Item> items;

    // Constructor initializes the items list
    public Cart() {
        items = new ArrayList<>();
    }

    // Method to add items to the cart
    // Takes an Item object and a quantity to add the item multiple times
    public void addItem(Item item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            items.add(item);
        }
    }

    // Method to calculate the total price of items in the cart, applying special offers if applicable
    public double calculateTotal() {
        double total = 0;

        // Loop through each item in the cart
        for (Item item : items) {
            int itemCount = countItemOccurrences(item);

            // Apply special pricing if applicable
            if (item.getOfferQuantity() > 0 && itemCount >= item.getOfferQuantity()) {
                int offerSets = itemCount / item.getOfferQuantity(); // Number of offer sets
                int remainingItems = itemCount % item.getOfferQuantity(); // Remaining items after applying offers
                total += offerSets * item.getOfferPrice() + remainingItems * item.getPrice(); // Calculate total with special offer
            } else {
                total += itemCount * item.getPrice(); // Calculate total without special offer
            }
        }
        return total; // Return the calculated total price
    }

    // Helper method to count occurrences of an item in the cart
    private int countItemOccurrences(Item item) {
        int count = 0;

        // Loop through each item in the cart and count matching items
        for (Item cartItem : items) {
            if (cartItem.getName().equals(item.getName())) {
                count++;
            }
        }
        return count; // Return the count of the item in the cart
    }
}
