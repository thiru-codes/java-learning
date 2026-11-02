import java.util.Scanner;

public class IntermediatePatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //pattern 1
        for(int i=1;i<=n;i++){
            System.out.print(" ".repeat(n-i));
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //pattern 2
        System.out.println();
        for(int i=n;i>=1;i--){
            System.out.print(" ".repeat(n-i));
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //pattern 3
        System.out.println();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }

        //pattern 4
        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.print(" ".repeat(n-i));
            for(int j=n-i+1;j<=n+i-1;j+=2){
                System.out.print("* ");
            }
            System.out.println();
        }
        

        scanner.close();
    }
}
