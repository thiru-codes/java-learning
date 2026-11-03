import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int temp = n;
        int sumOfDigits = 0;

        while(temp!=0){
            temp = Math.abs(temp); // if I want to handle negative input
            int digit = temp%10;
            sumOfDigits += digit;
            temp/=10;
        }

        System.out.println(sumOfDigits);
        scanner.close();
    }
}
