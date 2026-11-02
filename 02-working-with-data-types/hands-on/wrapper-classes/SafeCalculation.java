public class SafeCalculation{

	public static double calculateTotal(String priceStr, Integer quantity){
		
		if (quantity == null) { return 0.0; }
	
		double priceDouble =  Double.parseDouble(priceStr); //auto-unboxing
		double totalCost = priceDouble * quantity;

		return totalCost;

	}
}