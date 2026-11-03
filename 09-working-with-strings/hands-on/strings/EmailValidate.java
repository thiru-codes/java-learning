import java.util.Scanner; 

class Validate{
    public void checkEmail(String email){
        if(!(email.contains("@")) || !(email.endsWith(".com"))){
            throw new IllegalArgumentException("Invalid email");
        }
    }
}

public class EmailValidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validate validate = new Validate();

        System.out.println("Enter e-mail: ");
        String email = scanner.next();
        
        try{
            validate.checkEmail(email);
            System.out.println("Valid email");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}