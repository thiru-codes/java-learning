abstract class Pet{
    String name;
    int energyLevel;
    
    public Pet(String name, int energyLevel){
        this.name = name;
        this.energyLevel = energyLevel;
    }

    abstract void sound();
    abstract void food();

    public void eat(double amount){
        energyLevel+=45;
        System.out.println("Energy levels increased : " + energyLevel);
    }

    public void sleep(double amount){
        energyLevel+=100;
        System.out.println("Energy level fully restored : " + energyLevel);
    }

}

class Dog extends Pet{

    public Dog(String name, int energyLevel){
        super(name, energyLevel);
    }

    @Override
    void sound(){
        System.out.println("Dog barks");
    }

    @Override
    void food(){
        System.out.println("Dog eats kibble");
    }


}

class Cat extends Pet{

    public Cat(String name, int energyLevel){
        super(name, energyLevel);
    }

    @Override
    void sound(){
        System.out.println("Cat meows");
    }

    @Override
    void food(){
        System.out.println("Cat eats tuna");
    }

}


public class AbstractClassDemo{
    public static void main(String[] args) {
        Pet p1 = new Dog("Rosco", 1400);
        Pet p2 = new Cat("Snow", 450);

        p1.sound();
        p1.food();
        p1.eat(40);
        p1.sleep(9);
        

        p2.sound();
        p2.food();
        p1.eat(25);
        p1.sleep(14);
    }
}