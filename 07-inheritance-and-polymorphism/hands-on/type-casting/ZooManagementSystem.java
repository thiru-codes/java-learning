class Animal{
    void sound(){
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is barking");
    }

    void wagTail(){
        System.out.println("Tail is wagging");
    }
}

public class ZooManagementSystem {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        //runtime polymorphism.

        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.wagTail(); //safely access the dog-specific method using casting
        }
    }
}
