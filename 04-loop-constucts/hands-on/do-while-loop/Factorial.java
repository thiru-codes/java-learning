import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = scanner.nextInt();

		if (n == 0){
			System.out.println(1);
			scanner.close();
			return;
		}

		System.out.println("Factorial of " + n + ":");

		int fact = 1;

		do{
			fact *= n;
			n--;
		} while (n>0);

		System.out.println(fact);
		scanner.close();
	}
}