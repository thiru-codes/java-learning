import java.util.Scanner;

public class Comparision{

	public boolean checkCredentials(String inputPassword, String correctPassword){
		if ((inputPassword == null) || (correctPassword == null)){
			return false; 
		} //to compare memory address { return false; }
		return inputPassword.equals(correctPassword); //String -> object, so checks the actual data inside
	}

	
	public static void main(String[] args){

		String correctPassword = "Ghsz@1256";
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter password: ");
		String inputPassword = scanner.next();

		Comparision compare = new Comparision();

		System.out.println(compare.checkCredentials(inputPassword, correctPassword));
		
		scanner.close();
	}
}