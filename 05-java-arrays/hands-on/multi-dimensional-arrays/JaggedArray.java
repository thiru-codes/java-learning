public class JaggedArray{
    public static void main(String[] args) {
        int[][] busSeats = {
            {1, 0},             // Row 0: 2 seats total (1 taken, 1 empty)
            {1, 1, 0, 1},       // Row 1: 4 seats total (3 taken, 1 empty)
            {0, 0, 1, 1, 0}     // Row 2: 5 seats total (2 taken, 3 empty)
        };

        int noOfEmptySeats = 0;

        for(int i=0;i<busSeats.length;i++){
            for(int j=0;j<busSeats[i].length;j++){
                if(busSeats[i][j] == 0) noOfEmptySeats++;
            }
        }

        System.out.println("No. of empty buses left in the bus: " + noOfEmptySeats);

    }
}
