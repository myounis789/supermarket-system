// Item class representing an item in the supermarket checkout system
public class Item {
    // Private instance variables to store the name and price of the item
    private String name;
    private double price;

    // Constructor to initialize the Item with a name and a price
    public Item(String name, double price) {
        this.name = name;  // Set the name of the item
        this.price = price; // Set the price of the item
    }

    // Getter method to return the name of the item
    public String getName() {
        return name; // Return the name of the item
    }

    // Getter method to return the price of the item
    public double getPrice() {
        return price; // Return the price of the item
    }
}
