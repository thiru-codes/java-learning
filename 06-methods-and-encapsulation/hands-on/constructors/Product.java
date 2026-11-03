
public class Product {
    private String name;
    private double price;
    private int stock;
    private String category;

    public Product(String name) {
        this(name, 0.0);
        System.out.println("Constructor 1 executed.");
    }

    public Product(String name, double price) {
        this(name, price, 5);
        System.out.println("Constructor 2 executed.");
    }

    public Product(String name, double price, int stock) {
        this(name, price, stock, "General");
        System.out.println("Constructor 3 executed.");
    }

    public Product(String name, double price, int stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        System.out.println("Master Constructor executed.");
    }

    public void displayDetails() {
        System.out.println(name + " | Price: $" + price
                + " | Stock: " + stock
                + " | Category: " + category);
    }

    public static void main(String[] args) {

        System.out.println("--- Product 1: Name Only ---");
        Product laptop = new Product("Laptop");
        laptop.displayDetails();

        System.out.println("\n--- Product 2: Name and Price ---");
        Product phone = new Product("Phone", 799.99);
        phone.displayDetails();

        System.out.println("\n--- Product 3: Name, Price and Stock ---");
        Product tablet = new Product("Tablet", 499.99, 10);
        tablet.displayDetails();

        System.out.println("\n--- Product 4: All Parameters ---");
        Product monitor = new Product("Monitor", 299.99, 15, "Electronics");
        monitor.displayDetails();
    }
}