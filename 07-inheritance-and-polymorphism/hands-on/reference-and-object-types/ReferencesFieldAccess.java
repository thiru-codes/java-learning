class Person{
    String name = "John";
}

class Student extends Person{
    int rollNo =101;
}



public class ReferencesFieldAccess {
    public static void main(String[] args) {

        Person p =new Student();

        System.out.println(p.name);
        //System.out.println(p.rollNo); Error!
        //rollNo cannot be resolved or is not a field
    }
}

