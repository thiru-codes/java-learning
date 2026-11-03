import java.util.Scanner;

class Pay{
    public void validate(long cardNumber, int cvv, double amount){
        int cardLength = Long.toString(cardNumber).length();
        int cvvLength = Integer.toString(cvv).length();

        if(cardLength<16 || cardLength>16){
            throw new InvalidCardException("Failed, Card length must be sixteen digits");
        }
        if(cvvLength<3 || cvvLength>3){
            throw new InvalidCardException("Failed, CVV must be three digits");
        }

        if(amount<=0){
            throw new InvalidAmountException("Failed, Minimum amount must be greater than zero");
        }
    }
}

class InvalidCardException extends RuntimeException{
    public InvalidCardException(String message){
        super(message);
    }
}

class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String message){
        super(message);
    }
}


public class OnlineShoppingPaymentSystem{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pay pay = new Pay();
 
        System.out.println("Card Payment System");
        System.out.println("Enter card number: ");
        long cardNumber = scanner.nextLong();
        System.out.println("Enter CVV: ");
        int cvv = scanner.nextInt();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        try{
            pay.validate(cardNumber, cvv, amount);
            System.out.println("Payment processed, thank you for your purchase!");
        }
        catch(InvalidCardException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }  
    }
}