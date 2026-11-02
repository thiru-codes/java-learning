import java.util.Scanner;

public class BasicSwap {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter index positions to swap: "); 
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        BasicSwap.swap(arr, i, j);

         System.out.println("After swap: ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        scanner.close();
    }
}
