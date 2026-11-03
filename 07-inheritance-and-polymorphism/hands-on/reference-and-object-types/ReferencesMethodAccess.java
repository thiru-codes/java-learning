class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

public class ReferencesMethodAccess{
    public static void main(String[] args) {
        
        Animal a = new Dog();

        a.eat();
        //a.bark(); -> Error:
        //The method bark() is undefined for the type Animal
    }
}