import java.util.Scanner;

public class AdvancedPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //pattern 1 -> hollow square
        System.out.println("*".repeat(n));
        for(int i=1;i<=n-2;i++){
            System.out.println("*"+" ".repeat(n-2)+"*");
        }
        System.out.println("*".repeat(n));
        System.out.println();


        //pattern 2 -> diamond pattern
        for(int i=1;i<=n;i++){
            System.out.print(" ".repeat(n-i));
            for(int j=n-i+1;j<=n+i-1;j+=2){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            System.out.print(" ".repeat(n-i));
            for(int j=n-i+1;j<=n+i-1;j+=2){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        //pattern 3 -> palindrome pyramid
        for(int i=1;i<=n;i++){
            System.out.print(" ".repeat(n-i));
            int k=i;
            for(int j=n-i+1;j<=n+i-1;j++){
                System.out.print(k);
                k = (j<n) ? --k : ++k;
            }
            System.out.println();
        }

        scanner.close();
    }
}
