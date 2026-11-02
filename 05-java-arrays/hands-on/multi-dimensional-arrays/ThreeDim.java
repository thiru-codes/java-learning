public class ThreeDim {
    public static void main(String[] args) {
        int[][][] temperatures = {
            { // City 0
                {20, 25, 22}, // Day 0 readings (Morning, Afternoon, Evening)
                {24, 28, 23}  // Day 1 readings
            },
            { // City 1
                {15, 18, 16}, // Day 0 readings
                {17, 19, 15}  // Day 1 readings
            }
        };

        int cities = temperatures.length;
        int days = temperatures[0].length;
        int readings = temperatures[0][0].length;

        int sumOfAllTemps = 0;
        int noOfReadings = 0; 

        for(int i=0;i<cities;i++){
            for(int j=0;j<days;j++){
                for(int k=0;k<readings;k++){
                    sumOfAllTemps += temperatures[i][j][k];
                    noOfReadings++;
                }
            }
        }

        double avgTemp = (double)sumOfAllTemps / noOfReadings;

        System.out.println("Sum of all temperatures: " + sumOfAllTemps);
        System.out.println("No. of all readings: " + noOfReadings);
        System.out.println("Avg. temperature: " + avgTemp);
    }
}
