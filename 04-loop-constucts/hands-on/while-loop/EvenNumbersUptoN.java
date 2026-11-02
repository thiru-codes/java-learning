import java.util.Scanner;

public class EvenNumbersUptoN{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n = scanner.nextInt();
		int i=2;
	
		System.out.println("Even numbers up to " + n + ":");
	
		while(i <= n){
		
			System.out.println(i);
			i+=2; 
		
		}
		scanner.close();
	}

}