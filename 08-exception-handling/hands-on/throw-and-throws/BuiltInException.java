class Account{
    int balance = 1000;

    public void withdraw(int amount){
        if(amount<0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
    }
}


public class BuiltInException{
    public static void main(String[] args) {
        Account acc1 = new Account();

        try{
            acc1.withdraw(-100);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}