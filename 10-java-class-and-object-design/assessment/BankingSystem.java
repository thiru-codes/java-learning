package bankingsystem;

import java.time.LocalDateTime;
import java.util.Objects;

abstract class Account{
    private final int accountNumber;
    private double balance;
    Customer customer;
    private final LocalDateTime dateTimeOfAccountCreation;

    public Account(int accountNumber, double balance, Customer customer){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
        this.dateTimeOfAccountCreation = LocalDateTime.now();
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    abstract void withdraw(int amount);

    protected  void debit(int amount){
        balance -= amount;
    }

    
    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(this == object) return true;
        if(object instanceof Account){
            Account account = (Account) object;
            if(this.getAccountNumber() == account.getAccountNumber()){
                return true;
            }
        }
        return false;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString(){
        return "Account Number: " + accountNumber +  
                "\n Balance : " + balance + 
                "\n Customer : " + customer + 
                "\nDateOfCreation : " + dateTimeOfAccountCreation;
    }
}

class SavingsAccount extends Account{
    private static double interestRatePercentage;
    static{
        interestRatePercentage = 5;
    }

    public SavingsAccount(int accountNumber, double balance, Customer customer){
        super(accountNumber,balance,customer);
    }

    @Override
    void withdraw(int amount){
        if(amount > getBalance()){
            throw new IllegalArgumentException("Insufficient funds");
        }
        debit(amount);
    }

    public static double calculateInterest(Account account){
        return ((account.getBalance()*interestRatePercentage)/100);
    }
}

class CurrentAccount extends Account{
    private double minimumBalance;

    public CurrentAccount(int accountNumber, double balance, Customer customer, double minimumBalance){
        super(accountNumber,balance,customer);
        this.minimumBalance = minimumBalance;
    }

    @Override
    void withdraw(int amount){
        if(getBalance() - amount <= minimumBalance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        debit(amount);
    }
}


class Customer{
    String customerName;
    int customerId;
    int creditScore;

    public Customer(String customerName,int customerId, int creditScore){
        this.customerName = customerName;
        this.customerId = customerId;
        this.creditScore = creditScore;
    }

    @Override
    public String toString(){
        return "{Customer: " + customerName + 
                " , Id: " + customerId + " Credit Score :" + creditScore + " }";
    }
}

final class Transaction{
    private final int transactionId;
    private final int accountNumber;
    private final double amount;
    private final String transactionType;
    private final LocalDateTime transactionDateTime;

    public Transaction(int transactionId,int accountNumber,double amount,String transactionType) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionDateTime = LocalDateTime.now();
    }

    public int getTransactionId() {
        return transactionId;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAmount(){
        return amount;
    }
    public String getTransactionType(){
        return transactionType;
    }
    public LocalDateTime getDateTime(){
        return transactionDateTime;
    }

}

class  BankDatabase{
    private static String bankName = "ABankName";

    private BankDatabase(){
    }
    private static BankDatabase instance = new BankDatabase();
    public static BankDatabase getInstance(){
        return instance;
    }

    public static String getBankName(){
        return bankName;
    }
}



public class BankingSystem{
    public static void main(String[] args){
        Customer customer = new Customer("Kaja", 101, 750);
        System.out.println(customer);

        Account savings = new SavingsAccount(1001, 50000, customer);
        Account current = new CurrentAccount(1002, 30000, customer, 5000);

        //polymorphism
        try{
            savings.withdraw(10000);    
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        try{
            current.withdraw(15000);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(savings);
        System.out.println();

        System.out.println(current);
        System.out.println();

        //static method
        double interest = SavingsAccount.calculateInterest(savings);

        System.out.println("Interest: " + interest);
        System.out.println();

        //immutable transaction
        Transaction transaction = new Transaction(1,savings.getAccountNumber(),10000,"WITHDRAW");

        System.out.println(transaction);
        System.out.println();

        //singleton
        BankDatabase db1 =BankDatabase.getInstance();
        BankDatabase db2 =BankDatabase.getInstance();

        System.out.println("Bank: " + BankDatabase.getBankName());
        System.out.println("Same object? " +(db1 == db2));
    }
}