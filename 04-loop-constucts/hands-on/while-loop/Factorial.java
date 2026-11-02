import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n = scanner.nextInt();

		System.out.println("Factorial of " + n + ":" );
		
		int fact = 1;
	
		while(n > 1){
			fact *= n;	
			n--;	
		}
		System.out.println(fact);
		scanner.close();
	}

}