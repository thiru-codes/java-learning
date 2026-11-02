import java.util.Scanner;

public class PurchaseTracker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] categories = {"Leafy Vegetables","Root Vegetables","Bulb Vegetables","Seeds Vegetables","Fruits"};
        String[][] itemName = new String[categories.length][];


        System.out.println("------- Purchase tracker! -------");

        int total = 0,actual_total=0;
        do{
            System.out.print("Enter no. of items purchased: ");
            total = scanner.nextInt();
            if(total<20) System.out.println("Total items purchased has to be at least 20, try again!");
        }while(total<20);
        
    
        for(int i=0;i<categories.length;i++){
            System.out.print("Enter no. of " + categories[i] + ": ");
            int size = scanner.nextInt();
            itemName[i] = new String[size];

            for(int j=0;j<itemName[i].length;j++){
                System.out.print("Enter item " +(j+1)+ " name: ");
                itemName[i][j] = scanner.next();
                actual_total++;
            }
        }

        System.out.println("\nValidation: Expected " + total + " items. Current " + actual_total + " items.");
        if (actual_total != total) {
            System.out.println("Warning: The category totals do not match the initial total item count!");
        }

        System.out.println("------- Purchase summary! -------");
        for(int i=0;i<itemName.length;i++){
            System.out.println("Category: " + categories[i] + " :");
            int count = 0;
            for(int j=0;j<itemName[i].length;j++){
                System.out.println("Item name: " + itemName[i][j]);
                count++;
            }
            System.out.println("No. of items in category " + categories[i] + " : " + count);
        }

        scanner.close();
    }
}