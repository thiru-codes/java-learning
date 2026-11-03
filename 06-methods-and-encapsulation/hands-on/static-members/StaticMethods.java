class BankUtils{
    double accountBalance;
    
    static double convertUsdToInr(double usdAmount){
        double result = usdAmount*85.0;
        return result;
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println(BankUtils.convertUsdToInr(125.72));
    }
}
