import java.util.Scanner;

public class JaggedArrayInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no. of rows in the bus: ");
        int r = scanner.nextInt();

        int[][] busSeats = new int[r][];

        for(int i=0;i<r;i++){
            System.out.println("Enter no. of seats for row " + (i+1) + ": ");
            int seats = scanner.nextInt();

            busSeats[i] = new int[seats]; //explicitly create that row's 1D array

            for(int j=0;j<seats;j++){
                System.out.println("Enter if each seat for row " + (i+1) + " is occupied(1) or not(0): ");
                busSeats[i][j] = scanner.nextInt();
            }
        }

        int noOfEmptySeats = 0;

        for(int i=0;i<busSeats.length;i++){
            for(int j=0;j<busSeats[i].length;j++){
                if(busSeats[i][j] == 0) noOfEmptySeats++;
            }
        }

        System.out.println("No. of empty buses left in the bus: " + noOfEmptySeats);
        scanner.close();
    }
}