import java.util.Scanner;

enum Tier{
    SILVER(5,"Silver"){
        @Override
        double calculateSpecialBonus(double amount){
            return (amount*SILVER.basePercentage)/100;
        }
    },
    GOLD(7,"Gold"){
        @Override
        double calculateSpecialBonus(double amount){
            return (amount*GOLD.basePercentage)/100;
        }
    },
    PLATINUM(10,"Platinum"){
        @Override
        double calculateSpecialBonus(double amount){
            return (amount*PLATINUM.basePercentage)/100;
        }
    };

    private final double basePercentage;
    private final String tierName;

    private Tier(double basePercentage, String tierName){
        this.basePercentage = basePercentage;
        this.tierName = tierName;
    }

    public String getTierName(){
        return tierName;
    }
    public double getBasePercentage(){
        return basePercentage;
    }

    abstract double calculateSpecialBonus(double amount);
}


public class TierManager{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Tier plusCustomer = Tier.PLATINUM;

        System.out.println("Tier Name           : " + plusCustomer.getTierName());
        System.out.println("Discount Percentage : " + plusCustomer.getBasePercentage() + "%");
        
        System.out.print("Enter amount: "); 
        double amount = scanner.nextDouble();

        System.out.println("Special Bonus on given amount : " + plusCustomer.calculateSpecialBonus(amount));

        scanner.close();
    }
}