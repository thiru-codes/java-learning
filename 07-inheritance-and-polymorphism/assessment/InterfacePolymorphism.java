interface Payable{
    void pay(double amount); //interface methods are implicitly public abstract
    void refund(String transactionId);
    void getTransactionStatus(String transactionId);
}

class CreditCard implements Payable{
    @Override
    public void pay(double amount){
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }

    @Override
    public void refund(String transactionId){
        System.out.println("Refund for transaction " + transactionId + " by Credit Card payment initiated");
    }

     @Override
    public void getTransactionStatus(String transactionId){
        System.out.println("Transaction status for "+ transactionId + " by Credit Card payment is being retrieved");
    }
}

class UPIWallet implements Payable{
    @Override
    public void pay(double amount){
        System.out.println("Paid Rs." + amount + " using UPI wallet");
    }

    @Override
    public void refund(String transactionId){
        System.out.println("Refund for transaction " + transactionId + " by UPI payment initiated");
    }

     @Override
    public void getTransactionStatus(String transactionId){
        System.out.println("Transaction status for "+ transactionId + " by UPI payment is being retrieved");
    }
}


public class InterfacePolymorphism {
    public static void main(String[] args) {
        Payable p1 = new CreditCard();
        Payable p2 = new UPIWallet();
        
        p1.pay(500);
        p1.refund("45627");
        p1.getTransactionStatus("45627");

        p2.pay(500);
        p2.refund("45628");
        p2.getTransactionStatus("45628");

    }
}
