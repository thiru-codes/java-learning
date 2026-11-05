package implementsingletonclasses;

class Person{
    private final String name;
    private final int age;
    

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //=== getters ===
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // no setters
}


public class ImmutablePractice {
    
}

