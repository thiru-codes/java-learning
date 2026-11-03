//Price updater
class Product{
    double price;
    Product(double price){
        this.price = price;
    }
    double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price = price;
    }
}

class PriceTester{
    public void updatePrice(double price){
        price *= 1.10; // method only modifies a temp local copy 
    }
    public void updateProduct(Product prod){
        prod.setPrice(prod.getPrice()*1.10); // method updates object's field because copy ref. still points to same obj in heap
    }
}

public class PassByValueObject {
    public static void main(String[] args) {
        PriceTester priceTester = new PriceTester();
        double p = 50.64;

        System.out.println("------ Pass by Value behaviour in primitives as arguments ------");
        System.out.println("Before method call: " + p);

        priceTester.updatePrice(p); // copy of p passed as arg
        System.out.println("After method call: " + p);


        System.out.println("------ Pass by Value behaviour in objects as arguments ------");

        Product product = new Product(50.64);
        System.out.println("Before method call: " + product.getPrice());

        priceTester.updateProduct(product); // copy of product's ref. value passed as arg
        System.out.println("After method call: " + product.getPrice());
    }
}
