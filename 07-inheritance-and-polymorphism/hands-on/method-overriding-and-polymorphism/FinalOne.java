class Employee{
    void work(){
        System.out.println("Employee is working");
    }

}

class Manager extends Employee{

    @Override
    void work(){
        System.out.println("Manager is managing the team.");
    }

    void conductMeeting(){
        System.out.println("Meeting in progress");
    }

}

public class FinalOne {
    public static void main(String[] args) {
        Employee e = new Manager();

        e.work();
        //e.conductMeeting();
        //The method conductMeeting() is undefined for the type Employee
    }
}
