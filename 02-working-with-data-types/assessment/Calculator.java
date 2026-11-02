import java.util.Scanner;

public class Calculator{

	void add(int a, int b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}

	void subtract(int a, int b){
		System.out.println(a + " - " + b + " = " + (a-b));
	}

	void multiply(int a, int b){
		System.out.println(a + " * " + b + " = " + (a*b));
	}

	void divide(int a, int b){
		System.out.println(a + " / " + b + " (quotient) = " + (a/b));
		System.out.println(a + " / " + b + " (remainder) = " + (a%b));
	}
	
	
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 1st number: ");
		int a = scanner.nextInt();

		System.out.println("Enter 2nd number: ");
		int b = scanner.nextInt();

		Calculator calculate = new Calculator();

		calculate.add(a,b);
		calculate.subtract(a,b);
		calculate.multiply(a,b);
		calculate.divide(a,b);

		scanner.close();
	}
}