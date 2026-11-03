class Array{
    public void printElement(int[] arr, int index){
        System.out.println(arr[index]);
    }
}

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        Array array = new Array();

        try{
            array.printElement(a, 6);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + " : Invalid array index.");
        }
    }
}
