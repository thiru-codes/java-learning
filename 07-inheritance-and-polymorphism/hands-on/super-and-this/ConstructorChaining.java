class Employee{
    String employeeId;

    public Employee(String employeeId){
        this.employeeId = employeeId;
    }

    void getInfo(){
        System.out.println(employeeId);
    }
}

class Manager extends Employee{
    String department;

    public Manager(String employeeId,String department){
        super(employeeId); 
        //ensure the parent class initializes its fields before Manager sets up its own state
        this.department = department;
    }

    @Override
    void getInfo(){
        System.out.println(employeeId + " " + department);
    }
}


public class ConstructorChaining {
    public static void main(String[] args) {
        Manager mgr1 = new Manager("SHD4789", "DONT KNOW BRO");
        mgr1.getInfo();
    }
}

//Java forces super() to be on the very first line 
// because a child class cannot safely build its own specific features 
// until the foundational parent layer completely exists in memory