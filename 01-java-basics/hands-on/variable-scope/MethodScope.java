public class MethodScope{
	public static double calculateTotal(int quantity, double price){
		final double taxRate = 0.05;
		double total = (price * quantity) * (1 + taxRate);
		return total;
	}
	public static void main(String[] args){
		double total = calculateTotal(45, 100.0);
		System.out.println("Total cost:" + total);
	}
}