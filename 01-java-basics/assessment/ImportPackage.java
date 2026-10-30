import java.util.Scanner; //Importing java util package, Scanner class

public class ImportPackage{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in); //scanner object to access nextInt() method
	System.out.println("Enter a number: ");
	
	int number = scanner.nextInt();
		
	if(number % 2 == 0){ System.out.println(number + " is even"); }
	else { System.out.println(number + " is odd"); }

	scanner.close();
	}
}