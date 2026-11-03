class Vehicle{
    public void wheels(){
        System.out.println("Vehicle has wheels");
    }
}

class Car extends Vehicle{
    @Override
    public void wheels(){
        System.out.println("Car has four wheels");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        Car c = new Car(); // child class object
        Vehicle v = new Vehicle();

        v.wheels();
        c.wheels(); //method overriding -> runtime polymorphism
    }
}