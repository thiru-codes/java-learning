import java.util.Scanner;

public class LoopConstructsCompare{
	
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println("Countdown using for loop:");
		for(int i=n;i>=0;i--){
			System.out.println(i);
		}
	
		System.out.println("Countdown using while loop:");
		int j=n;
		while(j-- > 0){
			System.out.println(j);
		}

		
		System.out.println("Countdown using do-while loop:");
		int k=n;
		do{
			System.out.println(k);
			k--;

		}while(k >=0);
		scanner.close();
	}
}