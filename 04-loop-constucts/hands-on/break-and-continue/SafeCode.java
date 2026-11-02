import java.util.Scanner;

public class SafeCode{

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter passcode: ");
		while(true){
			int code = scanner.nextInt();
			if ( code == 9999){
				System.out.println("Access Granted");
				break;
			}
			System.out.println("Incorrect passcode, try again.");
		}
		scanner.close();
	}
} 