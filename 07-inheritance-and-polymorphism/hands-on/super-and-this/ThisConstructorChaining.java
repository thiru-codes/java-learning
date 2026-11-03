class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this(name, price, 1);
    }

    public Product() {
        this("Unknown", 0.0, 1);
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
}

public class ThisConstructorChaining {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 75000.0, 2);
        Product product2 = new Product("Keyboard", 2500.0);
        Product product3 = new Product();

        product1.displayDetails();
        product2.displayDetails();
        product3.displayDetails();
    }
}
