import java.util.Scanner;

@FunctionalInterface
interface StringOperation{
    String operation(String message); 
}

public class StringHandling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        StringOperation convertToUpper = (strInput) -> strInput.toUpperCase();

        StringOperation addPrefix = (strInput) -> {
            String stringWithPrefix = "Prefix"+strInput;
            return stringWithPrefix;
        };

        StringOperation reverseString = (strInput) -> {
            StringBuilder sb = new StringBuilder(strInput);
            sb.reverse();
            return sb.toString();
        };


        System.out.println(convertToUpper.operation(inputString));
        System.out.println(addPrefix.operation(inputString));
        System.out.println(reverseString.operation(inputString));

        scanner.close();
    }
}
