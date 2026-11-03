class UserAccount{
    String username;
    UserAccount(){
        this.username = "Default";
    }
    UserAccount(String username){
        this.username = username;
    }
}

public class UserDefinedConstructors{
    public static void main(String[] args) {
        UserAccount acc1 = new UserAccount();
        UserAccount acc2 = new UserAccount("XYZ");
        System.out.println(acc1.username);
        System.out.println(acc2.username);

    }
}