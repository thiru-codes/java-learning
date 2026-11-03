class Voting{
    public void validateAge(int age) throws InvalidAgeException{
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if(age<18){
            throw new InvalidAgeException();
        }
    }
}

class InvalidAgeException extends Exception{
}

public class CustomAgeCheck {
    public static void main(String[] args) {
        Voting voter = new Voting();

        try{
            voter.validateAge(15);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidAgeException e){
            System.out.println("Legal age to vote: 18 and above");
        }
    }
}
