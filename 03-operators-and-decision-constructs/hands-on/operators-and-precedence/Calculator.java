public class Calculator{

	public double calculateTotal(double price, int quantity, double discountCap){
	double result = ((price*quantity) - discountCap) * 1.05;
	return result;
}
	
	public static void main(String[] args){
		
		Calculator calc1 = new Calculator();
		System.out.println(calc1.calculateTotal(110.75,12,40.50));
	}

}