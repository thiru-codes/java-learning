import java.util.Scanner;

public class TwoDim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter no. of students: ");
        int n = scanner.nextInt();

        System.out.print("Enter no. of tests: ");
        int s = scanner.nextInt();

        int[][] track = new int[n][s];

        //input + tracking highest score
        int highestScore = 0;

        for(int i=0;i<n;i++){
            System.out.println("Enter grades of student " + (i+1) + " :");
            for(int j=0;j<s;j++){
                System.out.print("Test " + (j+1) + " :");
                track[i][j] = scanner.nextInt();
                if(track[i][j]>highestScore) highestScore = track[i][j];
            }
        }

        
        System.out.println("--- GRADE SHEET ---");
        for(int i=0;i<n;i++){
            System.out.print("Student " + (i+1) + " :");
            for(int j=0;j<s;j++){
                System.out.print(track[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Highest score in the class: " + highestScore);

        scanner.close();
    }
}
