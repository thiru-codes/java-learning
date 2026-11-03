class Product{
    String productCode;
    double price;

    public Product(String productCode, double price){
        this.productCode = productCode;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product [Code: " + productCode + ", Price: $" + price + "]";
    }

    @Override
    public boolean equals(Object obj){ //compile time reference type 
        if(!(obj instanceof Product)){
            return false;
        }
        Product objectToCompare = (Product) obj; 
        //cast it to its object type once we have confirmed using instanceof
        //why?
        //compile-time reference type (LHS) restricts access to 
        //subclass fields until explicit casting takes place
        return this.productCode.equals(objectToCompare.productCode);
        
    }
}

//The instanceof operator is a keyword used 
// to check if an object belongs to a specific class, 
// inherits from a parent class, or implements a particular interface.

public class ObjectClassOverwrites {
    public static void main(String[] args) {
        Product p1 = new Product("A101", 99.99);
        Product p2 = new Product("A101", 149.99); 

        System.out.println(p1); 

        System.out.println("Equal? " + p1.equals(p2)); 
    }
}
