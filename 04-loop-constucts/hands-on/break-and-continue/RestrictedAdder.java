import java.util.Scanner;

public class RestrictedAdder{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		while(true){
			int x = scanner.nextInt();

			if (x == 0) { break; }
			if (x < 0){
				System.out.println("Negative numbers skipped!");
				continue; 
			}
			sum+=x;
		}
		System.out.println("Sum: " + sum);
		scanner.close();
	}
}