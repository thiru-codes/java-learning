class Animal{
}

class Dog extends Animal{
}

class Cat extends Animal{
}

public class ClassCast {
    public static void main(String[] args) {
        Animal a = new Dog();

        try{
            Cat c = (Cat)a;
        }
        catch(ClassCastException e){
            System.out.println(e + " Invalid object casting.");
        }
    }
}
