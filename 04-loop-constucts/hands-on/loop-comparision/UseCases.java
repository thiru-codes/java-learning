import java.util.Scanner;

public class UseCases{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no. of entries: ");
		int f = scanner.nextInt();

		//when no. of repetitions known -> for loop 
		for(int i=1;i<=f;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			} 
			System.out.println();
		}
		

		
		//when repeating depends on a condition -> could be 0 times too!

		int balance = 100000; 

		while(balance>0){ //if balance is 0 -> while block skipped
			System.out.println("Enter amount to withdraw: ");
			int w = scanner.nextInt();
			balance -= w;
		} 
		System.out.println("Amount withdrawn");


		//when repeating depends on a condition -> and loop needs to run at least once!
		int pin = 1234;

		do {
    			System.out.print("Enter your 4-digit secret PIN: ");
    			pin = scanner.nextInt();
    			// Keeps looping if the PIN is incorrect
		} while (pin != 1234); 

		System.out.println("Access Granted!");
		scanner.close();
	}
}