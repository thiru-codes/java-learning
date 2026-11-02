import java.util.Scanner;

public class Multiples{

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i=1;i<=10;i++){
			if(i%n == 0){
				System.out.println(i);
			}
		}
		scanner.close();
	}
}