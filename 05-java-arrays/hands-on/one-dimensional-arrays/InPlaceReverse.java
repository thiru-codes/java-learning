import java.util.Scanner;

public class InPlaceReverse {

    public static void reverse(int[] arr){
        int n = arr.length;
        int k = n-1;
        for(int i=0;i<(n/2);i++){
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            k--;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }

        InPlaceReverse.reverse(a);

        System.out.println("Array after reversing: ");
        for(int x:a){
            System.out.print(x + " ");
        }

        scanner.close();
    }
}
