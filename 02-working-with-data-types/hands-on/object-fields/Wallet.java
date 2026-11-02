public class Wallet{
	double cash;
	String currency;
	
	public static void main(String[] args){
		Wallet myWallet = new Wallet();
		
		myWallet.cash = 50.75;
		myWallet.currency = "USD";

		myWallet.cash -= 20.00;
		
		System.out.println("Wallet balance: " + myWallet.cash + " " + myWallet.currency);
	}
}

