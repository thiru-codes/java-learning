class Employee{
    static int employeeCount;
    String name;
    Employee(String name){
        this.name = name;
        employeeCount++;
    }
}

public class StaticFields {
    public static void main(String[] args) {
        Employee emp1 = new Employee("A");
        Employee emp2 = new Employee("B");
        Employee emp3 = new Employee("C");

        System.out.println(Employee.employeeCount);
        System.out.println(emp1.employeeCount);
        System.out.println(emp2.employeeCount);
        System.out.println(emp3.employeeCount);

    }
}
