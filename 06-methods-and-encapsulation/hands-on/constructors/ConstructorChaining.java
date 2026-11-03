class SmartDevice{
    String brand;
    String os;
    double batteryCapacity;

    //master constructor for assignment -> takes the most params and handles assignment
    SmartDevice(String brand, String os, double batteryCapacity){
        this.brand = brand;
        this.os = os;
        this.batteryCapacity = batteryCapacity;
        System.out.println("Constructor 1 executed.\n");
    }

    SmartDevice(String brand){
        this(brand,"Android",4000.0); //calls the constructor that matches this parameter list
        System.out.println("Constructor 2 executed.");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartDevice("Samsung");
        SmartDevice device2 = new SmartDevice("Apple","ios",5000.0);
    }
}
