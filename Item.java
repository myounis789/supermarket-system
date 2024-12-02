public class Item {
    // Private fields for item properties
    private String name;            // The name of the item
    private double price;           // The price of the item
    private int offerQuantity;      // The quantity needed to trigger a special offer
    private double offerPrice;      // The special offer price for the offerQuantity

    // Constructor with special pricing logic
    // Initializes an item with a name, price, offer quantity, and offer price
    public Item(String name, double price, int offerQuantity, double offerPrice) {
        this.name = name;
        this.price = price;
        this.offerQuantity = offerQuantity;
        this.offerPrice = offerPrice;
    }

    // Getter for the name of the item
    public String getName() {
        return name;
    }

    // Getter for the price of the item
    public double getPrice() {
        return price;
    }

    // Getter for the offer quantity of the item
    public int getOfferQuantity() {
        return offerQuantity;
    }

    // Getter for the offer price of the item
    public double getOfferPrice() {
        return offerPrice;
    }
}

