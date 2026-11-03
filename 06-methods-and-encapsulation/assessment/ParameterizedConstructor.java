class Account{
    int accountNumber;
    double balance;
    
    public Account(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountInfo(){
        System.out.println("--------Account Information--------");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account balance: " + balance);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Account acc1 = new Account(1245629028 , 250924.00);
        acc1.displayAccountInfo();
    }
}
