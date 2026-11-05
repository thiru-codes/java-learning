package overridingobjectclassmethods;

import java.util.Objects;

class Product{
    private String productCode;
    private String productName;
    private double productPrice;

    public Product(String productCode, String productName, double productPrice){
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductCode(){
        return productCode;
    }
    public String getProductName(){
        return productName;
    }
    public double getProductPrice(){
        return productPrice;
    }

    @Override
    public boolean equals(Object object){
        // 1. first check -> if object is null
        if(object == null){
            return false;
        }
        // 2. second check -> if object is same object this
        if(this == object){
            return true;
        }
        // 3. now, not the same object, so, check with productCode
        // for that, first, check if the argument is an instance of Product class
        if(object instanceof Product){
            Product product = (Product) object;
            if(this.productCode.equals(product.productCode)){
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }

    @Override 
    public int hashCode(){
        return Objects.hash(productCode); // -> Java, give me a hash value 
        // based on this object's equality-relevant data.
    }
    // Now Java has a rule we must respect:
    // If two objects are equal according to equals(), 
    // they must return the same hashCode()
    // so, if:
    // p1.equals(p2) → true
    // then:
    // p1.hashCode() == p2.hashCode() 
    // must also be true

    @Override
    public String toString(){
        return "Product{productCode= " + this.productCode + ", productName= " + this.productName + ", productPrice= " +  this.productPrice + "}";
    }

}


public class ObjectClassMethodsOverrideDemo{
    public static void main(String[] args){
        Product p1 =  null;
        Product p2 = new Product("A100", "Laptop", 70000);
        Product p3 = p2;
        Product p4 = new Product("A100", "Laptop Pro", 90000);
        Object obj = new Object();
        Product p5 = new Product("A200", "Laptop Pro", 90000);

        System.out.println(p2.equals(p1));
        System.out.println(p2.equals(p3));
        System.out.println(p2.equals(p4));
        System.out.println(p2.equals(obj));

        System.out.println(p2.hashCode() == p4.hashCode());

        System.out.println(p4.hashCode() == p5.hashCode());
        // Different objects are allowed to have the same hash code
        // called hash collision
        // so it is possible for above to be true/false

        System.out.println(p2);
        System.out.println(p4);
        System.out.println(p5);

    }
}