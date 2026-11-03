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

public class ExceptionProgramFlow {
    public static void main(String[] args) {
        Account acc1 = new Account();

        int amount = -100;
        try{
            acc1.withdraw(amount);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(InsufficientFundsException e){
            System.out.println(e + ": Insufficient funds");
        }
    }
}

