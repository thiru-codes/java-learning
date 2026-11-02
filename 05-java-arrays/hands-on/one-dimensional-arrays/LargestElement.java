import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0){
		    int n = scanner.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++)
		        arr[i] = scanner.nextInt();
		    
		    int max = Integer.MIN_VALUE;
		    
		    for(int x: arr){
		        if(x>max) max = x;
		    }
		    
		    System.out.println(max);
		}
        scanner.close();
    }
}
