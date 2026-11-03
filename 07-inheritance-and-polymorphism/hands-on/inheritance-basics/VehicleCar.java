class Vehicle{
    String brand;
    void displayBrand(){
        System.out.println("Brand: " +brand);
    }
}

class Car extends Vehicle{
    String model;
    void displayModel(){
        System.out.println("Model: " +model);
    }
}


public class VehicleCar{
    public static void main(String[] args) {

        Car car =new Car();

        car.brand = "Toyota";
        car.model = "Corolla";

        car.displayBrand();
        car.displayModel();
    }
}
