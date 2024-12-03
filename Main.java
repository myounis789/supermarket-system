
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

        while (continueShopping) {
            // Display available items
            System.out.println("Select an item to purchase: ");
            System.out.println("A. Apple - £0.50 each or 3 for £1.30");
            System.out.println("B. Banana - £0.30 each or 2 for £0.45");
            System.out.println("C. Carrot - £0.20 each");
            System.out.println("D. Date - £0.15 each");
            System.out.print("Your value: ");
            String itemSelection = scanner.nextLine().toUpperCase();

            Item selectedItem = null;
            switch (itemSelection) {
                case "A":
                    selectedItem = itemA;
                    break;
                case "B":
                    selectedItem = itemB;
                    break;
                case "C":
                    selectedItem = itemC;
                    break;
                case "D":
                    selectedItem = itemD;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    continue;
            }

            // Ask for the quantity
            System.out.print("Enter the quantity you would like: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Add item to cart
            cart.addItem(selectedItem, quantity);

            //Display the runtime total as each item is added to cart
            double total = cart.calculateTotal();
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println();
            System.out.println("Current Total: £" + df.format(total));

            // Ask if user wants to continue shopping
            System.out.print("Thank you. Would you like to purchase more items? (y/n): ");
            String continueResponse = scanner.nextLine().toLowerCase();
            if (continueResponse.equals("n")) {
                continueShopping = false;
            }
        }

        // Print the shopping list
        System.out.println("\nShopping List:");
        cart.printShoppingList();

        // Calculate total
        double total = cart.calculateTotal();
        System.out.printf("Total Price: £%.2f\n", total);

        scanner.close();
    }
}
