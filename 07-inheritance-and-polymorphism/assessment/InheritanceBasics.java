class Account{
    // ===== Fields =====
    private final String accountHolder;
    private final int accountNumber;
    private double balance;

    // ===== Constructors =====
    public Account(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = (balance>=0) ? balance : 0;
    }

    // ===== Getters =====
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder; 
    }

    // ===== Public methods =====
    public boolean deposit(double amount){
        if(this.canDeposit(amount)){
            this.credit(amount);
            return true;
        }
        else{
            return false;
        }
    } 

    public boolean withdraw(double amount){
        if(this.canWithdraw(amount)){
            this.debit(amount);
            return true;
        }else{
            return false;
        }
    }

    public void transfer(Account acc, double amount){
        if (this!=acc){
            if(this.withdraw(amount)){
                acc.deposit(amount);
            }
        }else{
            System.out.println("Transfer failed, cannot transfer to self.");
        }
    }

    // ===== Protected Methods =====
    protected boolean canDeposit(double amount){
        if(amount>0){
            return true;
        }else{
            System.out.println("\nDeposit failed, invalid amount.");
            return false;
        }
    }

    protected boolean canWithdraw(double amount){
        if(amount>0){
            if(amount<=balance){
                return true;
            }else{
            System.out.println("\nWithdrawal failed, insufficient funds.");
            return false;
            }
        }else{
            System.out.println("\nWithdrawal failed, invalid amount.");
            return false;
        }
    }  

    // ===== Private Helpers =====
    private void credit(double amount){
        this.balance += amount;
        System.out.println("Amount "+ amount + " successfully deposited to account.");
    }

    private void debit(double amount){
        balance -= amount;
        System.out.println("Amount "+ amount + " successfully withdrawn from account.");
    }
}


class SavingsAccount extends Account{

    private double minimumBalance;

    public SavingsAccount(String accountHolder, int accountNumber, double balance){
        this(accountHolder, accountNumber, balance,6.7,1000);
    }

    public SavingsAccount(String accountHolder, int accountNumber, double balance,double interestRate,double minimumBalance){
        super(accountHolder, accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    protected boolean canWithdraw(double amount){
        if(getBalance()-amount < minimumBalance){
            System.out.println("\nWithdrawal failed, violates minimum balance requirement.");
            return false;
        }
        return super.canWithdraw(amount);
    }

}


class CurrentAccount extends Account{

    private double overDraftLimit;

    public CurrentAccount(String accountHolder, int accountNumber, double balance){
        this(accountHolder, accountNumber, balance,500);
    }

    public CurrentAccount(String accountHolder, int accountNumber, double balance, double overDraftLimit){
        super(accountHolder, accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    protected boolean canWithdraw(double amount){
        if(getBalance()-amount < -overDraftLimit){
            System.out.println("\nWithdrawal failed, violates overdraft limit requirement.");
            return false;
        }
        return super.canWithdraw(amount);
    }
}


public class InheritanceBasics{
    public static void main(String[] args) {
        Account acc1 = new CurrentAccount("Luffy", 14567, 10000);
        Account acc2 = new CurrentAccount("Zoro", 12890, 45000);

        acc1.deposit(4000);
        acc2.withdraw(2000);

        acc2.transfer(acc1, 1200);
    }
}