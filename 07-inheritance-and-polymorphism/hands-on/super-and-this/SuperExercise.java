class Person{
    String name;

    public Person(String name){
        this.name = name;
        System.out.println("Creating Person " + this.name);
    }
}

class Student extends Person{
    int rollNumber;

    public Student(String name, int roll){
        super(name);
        this.rollNumber = roll;
        System.out.println("Creating Student " + this.rollNumber);
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.rollNumber);
    }
    
}

class SuperExercise{
    public static void main(String[] args) {
        Student s = new Student("Kaja", 101);
        s.display();
    }
}