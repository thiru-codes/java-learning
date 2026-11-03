class Account {

    int accountNo;
    String accountHolder;

    public Account(int accountNo, String accountHolder){
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
    }

    public void createAccount(){
        System.out.println("Account created");
    }
}

class Savings extends Account{

    int accountNo;
    String accountHolder;
    double minBalance;

    public Savings(int accountNo, String accountHolder,double minBalance){
        super(accountNo, accountHolder);
        this.minBalance = minBalance;
    }

    @Override
    public void createAccount(){
        System.out.println("Savings account created");
    }
}

public class RuntimePolymorphism{
    public static void main(String[] args) {
        Account a = new Savings(0, null, 0);
        a.createAccount();
    }
}