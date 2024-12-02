public class Main {
   public static void main(String[] args) {
       System.out.println("Supermarket Checkout System: ");
       Item item1 = new Item("Apple", 1.50); 
       Item item2 = new Item("Banana", 0.80);
       Cart cart = new Cart();
       cart.addItem(item1);
       cart.addItem(item2);

       double total = cart.calculateTotal();
       System.out.println("Total Price: $" + total);
   }
}