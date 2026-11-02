import java.util.Scanner;;

public class SumCounter {
    public static void main(String[] args) {
        
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number (0 to stop): ");
            int x = scanner.nextInt();
            if(x==0){
                break;
            }
            sum+=x;;
        }

        System.out.println("Total sum: " + sum);
        scanner.close();
    }
}
