class UserAccount{
    String username;
}
public class DefaultConstructorCompiler {
    public static void main(String[] args) {
        UserAccount acc = new UserAccount();
        System.out.println("Success!");
        System.out.println("Used the compiler provided default constructor to create an object without any arguments or writing a default constructor");
    }
}
