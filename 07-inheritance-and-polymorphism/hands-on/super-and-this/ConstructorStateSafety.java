class Employee {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
}

class Manager extends Employee {
    String department;

    public Manager(String employeeId, String department) {
        super(employeeId);
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class ConstructorStateSafety {
    public static void main(String[] args) {
        Manager manager = new Manager("EMP1024", "Sales");
        manager.displayDetails();
    }
}
