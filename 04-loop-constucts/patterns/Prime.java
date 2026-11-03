import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            } 
        }

        
        System.out.println((isPrime) ? "Prime" : "Not Prime");

        scanner.close();
    }
}
