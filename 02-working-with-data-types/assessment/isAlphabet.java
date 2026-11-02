import java.util.Scanner;

class isAlphabet{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char ch = scanner.next().charAt(0); // built-in method of string class

		boolean result = Character.isLetter(ch); //Character -> wrapper class, .isLetter() -> method to check if a letter

		if(result) { System.out.println("Given character " + ch + " is an alphabet"); }
		else { System.out.println("Given character " + ch + " is not an alphabet"); }

		scanner.close();
	}
}