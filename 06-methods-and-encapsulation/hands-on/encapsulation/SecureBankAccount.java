class BankAccount {
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double withdrawal){
        if((this.balance-withdrawal)<0){
            System.out.println("Error");
            return;
        }
        this.balance-=withdrawal;
        System.out.println("Amount withdrawn, remaining balance: " + this.balance);
    }
}

public class SecureBankAccount{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12DG45SXCV", 10000);
        
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getBalance());

        acc.setBalance(4000);
        acc.setBalance(8000);
    }
}
