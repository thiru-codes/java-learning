class Item{
	int stockCount;
}

public class OrderProcessor{
	public static void main(String[] args){

		Item obj = new Item();
		obj.stockCount = 10;

		if(obj.stockCount>0){
			obj.stockCount--;
			System.out.println("Order Processed. Remaining stock: "  + obj.stockCount);
		}
	}
}