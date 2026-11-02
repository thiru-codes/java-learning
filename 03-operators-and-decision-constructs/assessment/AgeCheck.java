import java.util.Scanner;

public class AgeCheck{
	
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter age: ");
		int age = scanner.nextInt();
		
		if(age<18){
			System.out.println("Child");
		}
		else{
			System.out.println("Adult");
		}
		scanner.close();
	}
}