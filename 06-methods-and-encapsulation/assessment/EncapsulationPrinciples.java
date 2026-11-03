class BankAccount{
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(int accountNumber){
        this(accountNumber,10000.0);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountBalance(double withdrawal){
        if((balance-withdrawal)<0){
            System.out.println("Error");
            return;
        }
        balance -= withdrawal;
        System.out.println("Amount withdrawn. Balance: " + getBalance());
    }
}

public class EncapsulationPrinciples {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(103456);
        BankAccount account2 = new BankAccount(103457,43678.90);


        System.out.println(account1.getAccountNumber()+" " + account1.getBalance());
        account1.setAccountBalance(200.0);

        System.out.println(account2.getAccountNumber()+" " + account2.getBalance());
        account2.setAccountBalance(50000);

    }
}
