public class Product{
	private int stock; //cannot access stock variable outside of Product class
	Product(int initStock){
		stock = initStock;
	}
	public void sellProduct(int amount){
		stock = stock - amount;
	}
	public int getStock(){
		return stock;
	}
	public static void main(String[] args){
		Product productA = new Product(10);
		Product productB = new Product(20);
		System.out.println(productA.getStock());
		System.out.println(productB.getStock());
	}
}
