import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Supermarket Checkout System: ");
        
        // Creating items with price and special offers
        Item itemA = new Item("Apple", 0.50, 3, 1.30); // Special offer: 3 for £1.30
        Item itemB = new Item("Banana", 0.30, 2, 0.45); // Special offer: 2 for £0.45
        Item itemC = new Item("Carrot", 0.20, 0, 0); // No special offer
        Item itemD = new Item("Date", 0.15, 0, 0); // No special offer

        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        boolean continueShopping = true;

        // Loop for adding items to the cart
        while (continueShopping) {
            System.out.println("Select an item to purchase: ");
            System.out.println("A. Apple - £0.50 each or 3 for £1.30");
            System.out.println("B. Banana - £0.30 each or 2 for £0.45");
            System.out.println("C. Carrot - £0.20 each");
            System.out.println("D. Date - £0.15 each");
            System.out.print("Your value: ");
            String itemSelection = scanner.nextLine().toUpperCase();

            Item selectedItem = null;
            // Selecting the item based on user input
            if (itemSelection.equals("A")) {
                selectedItem = itemA;
            } else if (itemSelection.equals("B")) {
                selectedItem = itemB;
            } else if (itemSelection.equals("C")) {
                selectedItem = itemC;
            } else if (itemSelection.equals("D")) {
                selectedItem = itemD;
            } else {
                System.out.println("Invalid selection. Please try again.");
                continue;
            }

            // Asking the user for the quantity
            System.out.print("Enter the quantity you would like: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            cart.addItem(selectedItem, quantity);

            // Asking the user if they want to continue shopping
            System.out.print("Thank you. Would you like to purchase more items? (y/n): ");
            String continueResponse = scanner.nextLine().toLowerCase();
            if (continueResponse.equals("n")) {
                continueShopping = false;
            }
        }

        // Print the shopping list
        System.out.println("\nShopping List:");
        cart.printShoppingList();

        // Calculate total and format it to 2 decimal places
        double total = cart.calculateTotal();
        DecimalFormat df = new DecimalFormat("#.00"); // Output formatting to 2 decimal places
        System.out.println("Total Price: £" + df.format(total)); // Print formatted total price

        scanner.close();
    }
}
