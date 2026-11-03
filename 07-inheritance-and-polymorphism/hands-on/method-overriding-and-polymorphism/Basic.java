class Vehicle{
    String id;
    double maxWeight;

    void displayDetails(){
        System.out.println("Id: " + id + "Max weight: " + maxWeight);
    }
}

class Truck extends Vehicle{
    int axleCount;

    @Override
    void displayDetails(){
        System.out.println("Id: " + id + " Max weight: " + maxWeight);
        System.out.println("Axle count: " + axleCount);
    }
}

class CargoPlane extends Vehicle{
    int maxAltitude;

    @Override
    void displayDetails(){
        System.out.println("Id: " + id + " Max weight: " + maxWeight);
        System.out.println("Max altitude: " + maxAltitude);
    }
}

public class Basic{
    public static void main(String[] args) {
        Vehicle truck = new Truck();
        Vehicle cargoPlane = new CargoPlane();

        truck.displayDetails();
        cargoPlane.displayDetails();
    }
}

//@Override annotation omitted -> code will still compile and run perfectly fine
// The JVM does not require it to execute overridden methods. 
// The annotation instructs the compiler to verify that you are strictly overriding an existing method in a parent class
// (that the method actually matches a superclass signature)
// It prevents bugs stemming from typos or improper parameter declarations