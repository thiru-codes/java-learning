import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
     
        int spaceCount=n*2-2;
        int reverseSpaceCount=0;

        for(int i=1;i<=n;i++){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(spaceCount)); spaceCount-=2;
            System.out.println("*".repeat(i));
        }
        for(int i=n;i>=1;i--){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(reverseSpaceCount)); reverseSpaceCount+=2;
            System.out.println("*".repeat(i));
        }
        scanner.close();
    }
}
