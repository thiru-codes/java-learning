interface Payable{
    void pay(double amount); //interface methods are implicitly public abstract
}

class CreditCard implements Payable{

    @Override
    public void pay(double amount){
        System.out.println("Paid Rs." + amount + "using Credit Card");
    }
}

class UPIWallet implements Payable{

    @Override
    public void pay(double amount){
        System.out.println("Paid Rs." + amount + "using UPI");
    }
}

class GiftCard implements Payable{

    @Override
    public void pay(double amount){
        System.out.println("Paid Rs." + amount + "using Gift Card");
    }
}

public class PaymentSystem{
    public static void main(String[] args) {

        Payable p1 = new CreditCard();
        Payable p2 = new UPIWallet();
        Payable p3 = new GiftCard();

        p1.pay(500);
        p2.pay(500);
        p3.pay(500);

    }
}