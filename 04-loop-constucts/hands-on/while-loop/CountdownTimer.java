import java.util.Scanner;

public class CountdownTimer{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter timer countdown: ");
		
		int t = scanner.nextInt();
	
		System.out.println("Timer countdown from " + t + ":");
	
		while(t > 0){
		
			System.out.println(t);
			t--; 
		
		}
		System.out.println("Timer complete!");
		scanner.close();
	}

}