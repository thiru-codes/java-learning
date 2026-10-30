class BankAccount{

	static String bankName = "DBS";
	static int totalAccounts;
	
	int accountNumber;
	int accountBalance;
	String accountType;
	
	BankAccount(int accountNumber, int accountBalance){
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountType = "DEFAULT";
		totalAccounts++;
	}
	
	int getBalance(){
		return this.accountBalance;
	}
	
	public static void main(String[] args){

		BankAccount acc1 = new BankAccount(1011, 100000);
		BankAccount acc2 = new BankAccount(1012, 100500);
		BankAccount acc3 = new BankAccount(1013, 100600);
		BankAccount acc4 = new BankAccount(1014, 100700);
		
		System.out.println(BankAccount.bankName);
		System.out.println("Total accounts: " + BankAccount.totalAccounts);
	
		System.out.println("acc1: " + acc1.accountNumber + " " +  acc1.accountBalance + " " + acc1.accountType);
		System.out.println("acc2: " + acc2.accountNumber + " " +  acc2.accountBalance + " " + acc2.accountType);
		System.out.println("acc3: " + acc3.accountNumber + " " +  acc3.accountBalance + " " + acc3.accountType);
		System.out.println("acc4: " + acc4.accountNumber + " " +  acc4.accountBalance + " " + acc4.accountType);
		
	}

}