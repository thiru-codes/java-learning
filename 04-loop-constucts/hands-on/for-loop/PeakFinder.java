import java.util.Scanner;

public class PeakFinder{
	
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no. of entries:" );
		int n = scanner.nextInt();
		System.out.println("\n");

		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;

		for(int i=1;i<=n;i++){
			int x = scanner.nextInt();

			if(x>max){
				second_max = max; // to save the old max
				max = x; //update the new max
			}
			
			else if(x>second_max && x!=max){
				second_max = x; 
			}
			
		}

		System.out.println("\nLargest value: " + max);
		System.out.println("Second largest value: " + second_max);
		scanner.close();
	}

}


/*
1. If a new max arrives -> move current max to second_max and then update
2. If new number is not larger than max, then check if it is at least it is larger than second_max -> so that second_max can be updated
3. Because duplicate will hit false in first if, avoid dupe of max to become second_max
*/
