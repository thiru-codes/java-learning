import java.util.Scanner;

class Greeter{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your favorite color");
		String color = scanner.next();
		System.out.println("Wow, "+color+" that is a great color!");
		scanner.close();
	}
}