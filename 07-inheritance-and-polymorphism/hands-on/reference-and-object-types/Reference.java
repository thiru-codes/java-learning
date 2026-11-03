class Account{
    public String accountTier = "Standard";

    public static void printTerms(){
        System.out.println("Standard Terms");
    }

}

class PremiumAccount extends Account{
    public String accountTier = "Premium"; 
    //subclass variables with matching names hide parent variables


    public static void printTerms(){ 
    //static methods with matching signatures hide parent static methods
        System.out.println("Premium Terms");
    }
}

public class Reference {
    public static void main(String[] args) {
        Account acc1 = new PremiumAccount(); 
        //LHS Reference Type is Account | RHS Object Type is PremiumAccount
        // 1.Testing Field Hiding (LHS Variable Control)
        System.out.println(acc1.accountTier);

        // 2.Testing Static Method Hiding (Compile-time Binding)
        acc1.printTerms();

        PremiumAccount acc2 = new PremiumAccount(); 
        //LHS Reference Type is PremiumAccount | RHS Object Type is PremiumAccount
        
        System.out.println(acc2.accountTier);
        acc2.printTerms();

    }
}
