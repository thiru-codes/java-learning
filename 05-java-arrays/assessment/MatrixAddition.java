import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        System.out.println("Matrix A: ");
        for(int i=0;i<2;i++){
            System.out.print("Values for row " + (i+1) + " : ");
            for(int j=0;j<2;j++){
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matrix B: ");
        for(int i=0;i<2;i++){
            System.out.print("Values for row " + (i+1) + " : ");
            for(int j=0;j<2;j++){
                b[i][j] = scanner.nextInt();
            }
        }

        //sum
        System.out.println();
        System.out.println("Resulting matrix of A+B: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]= a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
