import java.util.Scanner;

public class Calculator{
	
	public double calculate(double num1, double num2, char operator){
		switch(operator){
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
			default:
				return -1;
		}
	}
	

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		double n1 = scanner.nextDouble();

		System.out.println("Enter number 2: ");
		double n2 = scanner.nextDouble();

		System.out.println("Enter calculator operation: ");
		char choice = scanner.next().charAt(0);

		Calculator c = new Calculator();

		double result = c.calculate(n1,n2,choice);
		System.out.println(result);
	}
}