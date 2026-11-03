import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;

        do{
            count++;
            n/=10;
        }while(n!=0);

        System.out.println(count);
        scanner.close();
    }
}
