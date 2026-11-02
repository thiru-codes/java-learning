import java.util.Scanner;

public class Countdown{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();

		if (n == 0) {
			System.out.println(0);
			scanner.close();
			return;
		}
		
		do{
			System.out.print(n-- + "\n");

		}while (n>0);
		scanner.close();
	}
}