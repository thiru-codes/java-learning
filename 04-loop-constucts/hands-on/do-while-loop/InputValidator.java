import java.util.Scanner;

public class InputValidator{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int n;
		do{
			System.out.println("Enter a number between 1 and 10 (inclusive): ");
			n = scanner.nextInt();
		} while (n>10 || n<1);
		scanner.close();
	}
}