import java.util.Scanner;

public class MaxSumOfDistinctElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            int largest = Integer.MIN_VALUE;
            int second_largest = Integer.MIN_VALUE;
            

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if(a[i]>largest){
                    second_largest = largest;
                    largest = a[i];
                }
                else if (a[i]>second_largest && a[i]!=largest){
                    second_largest = a[i];
                }
            }
            
            int max_sum = largest+second_largest;
            System.out.println(max_sum);
            
        }
        scanner.close();
    }
}
