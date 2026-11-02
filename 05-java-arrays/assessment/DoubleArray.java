import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = scanner.nextInt();

        double[] a = new double[n];

        double sum = 0;

        System.out.println("Enter array values: ");
        for(int i=0;i<n;i++){
            a[i] = scanner.nextDouble();
            sum += a[i];
        }

        System.out.printf("Sum of all elements: %.2f\n" , sum);
        scanner.close();
    }
}
