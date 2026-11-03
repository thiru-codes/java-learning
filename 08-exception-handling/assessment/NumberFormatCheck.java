import java.util.Scanner;


public class NumberFormatCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String s = scanner.next();

        try{
            int n = Integer.parseInt(s);
            System.out.println("Number: " + n);
        }
        catch(NumberFormatException e){
            System.out.println(e + ": Enter a number");
        }
        finally{    
            scanner.close();
        }

       
    }
}
