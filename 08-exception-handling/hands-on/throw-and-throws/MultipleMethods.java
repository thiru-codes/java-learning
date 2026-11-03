class Bank{
    int balance = 4000;

    public void withdraw(int amount) throws InsufficientFundsException{
        if(amount<0){
            throw new IllegalArgumentException("Amount cannot be less than zero");
        }
        if(balance-amount<0){
            throw new InsufficientFundsException();
        }
    }

    public void transfer(int amount){
        try{
            withdraw(amount);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(InsufficientFundsException e){
            System.out.println(e);
        }
    }
}

class InsufficientFundsException extends Exception{
}

public class MultipleMethods {
    public static void main(String[] args) {
        
        Bank account = new Bank();

        account.transfer(45000);
    }
}
