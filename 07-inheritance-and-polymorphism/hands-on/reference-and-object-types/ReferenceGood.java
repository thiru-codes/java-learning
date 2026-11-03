class Account{
    public String accountTier = "Standard";
    //parent declares the field once
    public static void printTerms(){
        System.out.println("Standard Terms");
    }

}

class PremiumAccount extends Account{

    public PremiumAccount(){
        this.accountTier = "Premium"; 
    }
    // No new field is declared, so accountTier is inherited from Account.
    // The constructor changes the value of the inherited field.
    


    public static void printTerms(){ 
    //static methods with matching signatures still hide parent static methods
    //handle them carefully in main by calling them via Class names
        System.out.println("Premium Terms");
    }
}

public class ReferenceGood {
    public static void main(String[] args) {
        Account acc1 = new PremiumAccount(); 
        //LHS Reference Type is Account | RHS Object Type is PremiumAccount
        // Field access is still determined by the reference type at compile time.
        // The constructor simply changes the value stored in the inherited field.
        
        System.out.println(acc1.accountTier); //no field hiding as the variable was inherited.
        Account.printTerms();

        PremiumAccount acc2 = new PremiumAccount(); 
        //LHS Reference Type is PremiumAccount | RHS Object Type is PremiumAccount

        // 1.Testing Field Hiding (LHS Variable Control)
        System.out.println(acc2.accountTier);
        
        // 2. Testing Static Method Hiding (Compile-time Binding)
        PremiumAccount.printTerms();

    }
}