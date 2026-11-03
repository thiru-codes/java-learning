class Person{
    String name;
    void displayName(){
        System.out.println("Name:" + name);
    }

}

class Student extends Person{
}

public class PersonStudent{
    public static void main(String[] args) {

        Student student = new Student();
        student.name="Alice";

        student.displayName();
    }
}
