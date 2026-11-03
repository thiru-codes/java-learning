import java.util.Scanner;

class Array{
    public void printValueAtIndex(int[] array, int index){
        System.out.println("Value at index " + index + " : " + array[index]);
    }

    public void printArray(int[] array){
        System.out.println("Array:");
        for(int x: array){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class ArrayIndexValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();

        int[] arr = {1,2,3,4,5};

        array.printArray(arr);

        System.out.println("Enter array index to search");
        int index = scanner.nextInt();

        try{
            array.printValueAtIndex(arr, index);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            scanner.close();
        }
    }
}