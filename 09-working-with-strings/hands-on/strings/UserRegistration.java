import java.util.Scanner;

class Registration{
    public void validate(String username){
        if(username.isEmpty()){
            throw new IllegalArgumentException("Invalid username");
        }
    }
}

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        username = username.trim().toLowerCase();

        try{
            registration.validate(username);
            System.out.println("Welcome, " + username);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}
