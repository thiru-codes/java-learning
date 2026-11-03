class Employee{
    void display(){
        System.out.println("Employee");
    }
}

class Manager extends Employee{
    @Override
    void display(){
        System.out.println("Manager");
    }

    void meeting(){
        System.out.println("Meeting in session");
    }

    void meeting(int count){
        System.out.println("Meeting in session with " + count + " members");
    }

    void meeting(int count, int minutes){
        System.out.println("Meeting in session with " + count + " members for " + minutes + " minutes");
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee = new Manager();

        employee.display();

        if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            manager.meeting();
            manager.meeting(7);
            manager.meeting(4,30);
        }
    }
}
