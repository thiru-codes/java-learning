import java.util.Scanner;

public class EncapsulationDemo{
	
	private String name ;
	private int age ;
	
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
	
	public void setAcc(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public static void main(String[] args){
			
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		EncapsulationDemo demo = new EncapsulationDemo();

		demo.setAcc(name, age);
		
		System.out.println("Name: " + demo.getName());
		System.out.println("Age: " + demo.getAge());
		
	}
}