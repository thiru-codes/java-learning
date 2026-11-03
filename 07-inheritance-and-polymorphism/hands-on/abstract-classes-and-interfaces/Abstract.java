abstract class Employee{
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return name;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void displayInfo(){
        System.out.println("Employee Information");
        System.out.println("Name : " + name);
        System.out.println("Id : " + employeeId);
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeId){
        this(name, employeeId,100000);
    }

    public FullTimeEmployee(String name, int employeeId,double monthlySalary){
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hourlyWage;

    public PartTimeEmployee(String name, int employeeId){
        this(name, employeeId,0,100);
    }

     public PartTimeEmployee(String name, int employeeId,int hoursWorked){
        this(name, employeeId,hoursWorked,100);
    }

    public PartTimeEmployee(String name, int employeeId,int hoursWorked, double hourlyWage){
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    @Override
    double calculateSalary(){
        return hoursWorked*hourlyWage;
    }
}

public class Abstract{
    public static void main(String[] args) {
        
        Employee emp1 = new FullTimeEmployee("Kaja", 5104,80000);
        Employee emp2 = new PartTimeEmployee("Luffy", 91562,80);

        emp1.displayInfo();
        System.out.println(emp1.calculateSalary());

        emp2.displayInfo();
        System.out.println(emp2.calculateSalary());

    }
}

