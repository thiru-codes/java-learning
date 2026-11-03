class BankAccount{
    void deposit(double amount){
        System.out.println("Deposited: " + amount);
    }
}

class SavingsAccount extends BankAccount{
    @Override
    void deposit(double amount){
        System.out.println("Deposited into Savings Account: " + amount);
    }

    void deposit(double amount, String transactionDescription){
        System.out.println("Deposited " + amount + " for " + transactionDescription);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();
        SavingsAccount savingsAccount = new SavingsAccount();

        account.deposit(100000);
        //method overriding -> runtime polymorphism

        savingsAccount.deposit(400000);
        savingsAccount.deposit(500000,"Auto-Save: Round-Up Deposit");
        //method overloading -> compile time polymorphism
    }
}
