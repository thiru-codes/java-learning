import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5}; //1D array

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element to search in the array of numbers 1-5: ");
        int key = scanner.nextInt();

        boolean found = false;
        for(int x: arr){ //enhanced for
            if(x==key){ 
                found = true;
            }
        }
        System.out.println((found) ? "YES, element found in array" : "NO, element not found in array");

        scanner.close();
    }
}
