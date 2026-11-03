class BankVault{
    private double cashBalance;
    public double balance;
    BankVault(double cashBalance){
        this.cashBalance = cashBalance;
    }
    public void deposit(double amount){
        if(amount>0) cashBalance+=amount;
    }
    public double statement(){
        return cashBalance;
    }
}

public class AccountVault{
    public static void main(String[] args) {
        BankVault vault = new BankVault(100);
        // private access error: vault.cashBalance = 10000000;
        vault.deposit((100));
        System.out.println(vault.statement());

        //public variable access
        vault.balance = 100000; 
        System.out.println(vault.balance);


    }
}
   