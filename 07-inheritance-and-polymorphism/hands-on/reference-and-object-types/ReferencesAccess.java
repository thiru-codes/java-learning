class Vehicle{
    String brand = "Toyota";
    void start(){
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle{
    String model = "Corolla";
    void displayModel(){
        System.out.println("Model :" + model);
    }
}


public class ReferencesAccess {
    public static void main(String[] args) {

        Vehicle v = new Car();

        System.out.println(v.brand);
        v.start();
        //System.out.println(v.model);
        //model cannot be resolved- is undefined for the type Vehicle
        //v.displayModel();
        //The method displayModel() is undefined for the type Vehicle
    }
}
