class Account{
    int balance = 1000;

    public void withdraw(int amount) throws InsufficientFundsException{
        if(amount<0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if(balance-amount<0){
            throw new InsufficientFundsException();
        }
    }
}

class InsufficientFundsException extends Exception{
}

public class CustomException {
    public static void main(String[] args) {
        Account acc1 = new Account();

        try{
            acc1.withdraw(-100);
            acc1.withdraw(1500); //never reached, exceptions alter normal program flow

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(InsufficientFundsException e){
            System.out.println(e + ": Insufficient funds");
        }
    }
}
