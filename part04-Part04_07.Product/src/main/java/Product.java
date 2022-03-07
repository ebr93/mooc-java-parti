

public class Product {
    // Instance Variables
    private double price;
    private int quantity;
    private String name;

    // Constructor with the Instance Variables
    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    // Method that prints the Instance variables
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}
