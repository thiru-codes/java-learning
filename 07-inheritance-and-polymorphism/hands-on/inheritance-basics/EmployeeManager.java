class Employee{
    String name;
    double salary;

    public void displayEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee{
    String departmnent;

    public void displayDepartment(){
        System.out.println("Department: " + departmnent);
    }
}


public class EmployeeManager{
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.name = "John";
        manager.salary = 50000;
        manager.departmnent = "Sales";

        manager.displayEmployee();
        manager.displayDepartment();
    }
}
