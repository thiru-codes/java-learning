class Employee{
	String name;
	int employeeId;

}


public class DataTransfer{
	public static void main(String[] args){
		
		Employee empOriginal = new Employee();
		empOriginal.name = "Arun";
		empOriginal.employeeId = 10123;
		

		Employee empBackup = new Employee();
		empBackup.name = empOriginal.name;
		empBackup.employeeId = empOriginal.employeeId;

		System.out.println("empBackup.name : " + empBackup.name);
		System.out.println("empBackup.employeeId : " + empBackup.employeeId);
	}

}