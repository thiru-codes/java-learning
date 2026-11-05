package implementsingletonclasses;

// Rule 1:
// final prevents another class from extending this class 
// method overriding by child can alter core behaviour if inherited
final class Employee {

    // Rule 2:
    // private → cannot be accessed directly from outside
    // final   → can only be assigned once
    private final int employeeId;
    private final String name;
    private final double salary;

    // Rule 4:
    // All fields are initialized during construction
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getters are allowed because they only READ the state
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Rule 3:
    // No setters or other methods that modify the fields.
}

public class ABetterImmutableClassExample {
    public static void main(String[] args){
        Employee emp1 = new Employee(1011, "Arun", 10000000);
        System.out.println(emp1.getEmployeeId());
    }
}

