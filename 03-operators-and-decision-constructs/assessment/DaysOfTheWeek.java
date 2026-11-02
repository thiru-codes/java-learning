import java.util.Scanner;

public class DaysOfTheWeek{

	public String returnDay(int day){

		switch(day){
			case 1:
				return "Monday";
			case 2:
				return "Tuesday";
			case 3:
				return "Wednesday";
			case 4:
				return "Thursday";
			case 5:
				return "Friday";
			case 6:
				return "Saturday";
			case 7:
				return "Sunday";
			default:
				return "Invalid day";
		}
	}  
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 to 7: ");
		int num = scanner.nextInt();

		DaysOfTheWeek obj = new DaysOfTheWeek();

		System.out.println(obj. returnDay(num));
		scanner.close();
	}
}