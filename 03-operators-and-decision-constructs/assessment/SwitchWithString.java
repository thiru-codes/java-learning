import java.util.Scanner;

public class SwitchWithString{

	String gradeMessage(String grade){
		switch(grade){
			case "A":
				return "Congrats! Keep it up!";
			case "B":
				return "Good job! You can improve!";
			case "C":
				return "Good try! Practice more to do better!";
			default:
				return "Invalid grade";
		}
	}
	
	
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your grade: ");
		String grade = scanner.next();

		SwitchWithString obj = new SwitchWithString();
		
		System.out.println(obj.gradeMessage(grade));
		scanner.close();
	}
}