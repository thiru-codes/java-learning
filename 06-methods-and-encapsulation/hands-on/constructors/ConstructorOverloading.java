class InventoryItem{
    String itemName;
    double price;
    int stockQuantity;

    InventoryItem(String itemName){
        this.itemName = itemName;
        this.price = 0.0;
        this.stockQuantity = 0;
    }

    InventoryItem(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
        this.stockQuantity = 10;
    }

    InventoryItem(String itemName, double price, int stockQuantity){
        this.itemName = itemName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    void getInventory(){
        System.out.println("Item name: " + this.itemName);
        System.out.println("Item price: " + this.price);
        System.out.println("Item stock: " + this.stockQuantity + "\n");
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {

        InventoryItem item1 = new InventoryItem("Product 1");
        InventoryItem item2 = new InventoryItem("Product 2", 48.75);
        InventoryItem item3 = new InventoryItem("Product 3", 60, 4);

        item1.getInventory();
        item2.getInventory();
        item3.getInventory();
    }
}
