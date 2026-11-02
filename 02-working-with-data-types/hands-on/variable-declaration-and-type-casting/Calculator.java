public class Calculator{

	public double calculateAverage(int totalSum, int itemCount){
		
		if (itemCount == 0) { return 0.0; }

		double avg = (double) totalSum / itemCount;
		return avg;

	}
	
	public static void main(String[] args){
	
		Calculator calculate = new Calculator();

		System.out.println(calculate.calculateAverage(500,10));
		System.out.println(calculate.calculateAverage(0,10));
		System.out.println(calculate.calculateAverage(0,0));
		
	}

}