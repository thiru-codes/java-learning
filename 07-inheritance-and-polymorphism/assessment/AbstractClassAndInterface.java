abstract class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    abstract void sound();
    abstract void food();
}

interface Pet{
    void play();
    void beFriendly();
}

class Lion extends Animal{
    public Lion(String name){
        super(name);
    }

    @Override
    void sound(){ System.out.println(name + " roars");}

    @Override
    void food(){ System.out.println(name + "eats raw meat");}
}

class Cheetah extends Animal{
    public Cheetah(String name){
        super(name);
    }

    @Override
    void sound(){ System.out.println(name+ "roars");}

    @Override
    void food(){ System.out.println(name + " hunts fresh prey");}
}

class Dog extends Animal implements Pet{
    public Dog(String name){
        super(name);
    }

    @Override
    void sound(){ System.out.println(name + " barks");}

    @Override
    void food(){ System.out.println(name + " eats kibble");}
    
    @Override
    public void play() {
        System.out.println(name + " likes to go for a walk");
    }

    @Override
    public void beFriendly() {
        System.out.println(name + " loves cuddle-time");
    }

}

class Cat extends Animal implements Pet{
    public Cat(String name){
        super(name);
    }

    @Override
    void sound(){ System.out.println(name + " meows");}

    @Override
    void food(){ System.out.println(name + " drinks milk and likes tuna");}

    @Override
    public void play() {
        System.out.println(name + " chases a laser pointer");
    }

    @Override
    public void beFriendly() {
        System.out.println(name + " purrs and lays down on your neck");
    }
}


public class AbstractClassAndInterface {
    public static void main(String[] args) {
        Animal a1 = new Lion("simba"); 
        Animal a2 = new Cheetah("Bhageera");

        Animal a3 = new Dog("Zozo");

        Dog d1 = new Dog("Toby");
        Pet p1 = new Cat("Snickers");


        a1.sleep();
        a1.food();
        a1.sound();
        
        a2.sleep();
        a2.food();
        a2.sound();

        a3.sleep();
        a3.food();
        a3.sound();
        //Animal Type ref. cannot access Pet interface methods -> a3.play(), a3.beFriendly()


        d1.sleep();
        d1.food();
        d1.sound();
        d1.play();
        d1.beFriendly();

        p1.play();
        p1.beFriendly();
        //Pet interface ref. cannot access Animal abstract class methods -> p1.food(),p1.sound(), p1.sleep()
    }
}
