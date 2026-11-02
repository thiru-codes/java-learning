import java.util.Scanner;

public class MinMaxSwapper {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = scanner.nextInt();

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int largestIndex = 0;
        int smallestIndex = 0;

        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            if(a[i]>largest){
                largest=a[i];
                largestIndex = i;
            } 
            if (a[i]<smallest){
                smallest=a[i];
                smallestIndex = i;
            } 
        }
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);

        MinMaxSwapper.swap(a, largestIndex, smallestIndex);
        
        System.out.println("After swapping smallest and largest values: ");
        for(int x: a){
            System.out.print(x + " ");
        }
        scanner.close();
    }
}
