import java.time.LocalDateTime;

abstract class Order{
    private final int orderId;
    private final LocalDateTime orderPlacedOn;
    private final int noOfItems;
    private String[] order;
    private int[] quantity;

    public Order(int orderId,int noOfItems,String[] order,int[] quantity){
        this.orderId = orderId;
        this.noOfItems = noOfItems;
        this.order = order;
        this.quantity = quantity;
        this.orderPlacedOn = LocalDateTime.now();
    }

    public int getOrderId(){
        return orderId;
    }
    public LocalDateTime getOrderPlacedOn(){
        return orderPlacedOn;
    }
    public int getNoOfItems(){
        return noOfItems;
    }
    public String[] getOrder(){
        return order;
    }
    public int[] getQuantity(){
        return quantity;
    }

    protected void nextOrderPrompt(){
        System.out.println("Thanks for ordering! Use code TASTY10 for 10% off your next order.");
    }

    abstract void printReceipt();
}

class OnlineOrder extends Order{
    private static double deliveryChargeRate = 100.0;
    private static int GST = 5;
    private String deliveryAddress;
    
    public OnlineOrder(int orderId,int noOfItems,String[] order,int[] quantity,String deliveryAddress){
        super(orderId,noOfItems,order,quantity);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void printReceipt(){
        System.out.println("==Online Order==");
        System.out.println("Order Id        : " + getOrderId());
        System.out.println("Deliver to      : " + deliveryAddress);
        System.out.println("Delivery charge : " + deliveryChargeRate);
        System.out.println("GST             : " + GST + "%");
        for(int i=0;i<getNoOfItems();i++){
            System.out.println(getOrder()[i] +" : "+ getQuantity()[i]);
        }
        nextOrderPrompt();
    }

}

class RestaurantOrder extends Order{
    private static int GST = 5;

    public RestaurantOrder(int orderId,int noOfItems,String[] order,int[] quantity){
        super(orderId,noOfItems,order,quantity);
    }

    @Override
    public void printReceipt(){
        System.out.println("==Restaurant Order==");
        System.out.println("Order Id        : " + getOrderId());
        System.out.println("GST             : " + GST + "%");
        for(int i=0;i<getNoOfItems();i++){
            System.out.println(getOrder()[i] + " : " + getQuantity()[i]);
        }
        nextOrderPrompt();
    }

    @Override
    protected void nextOrderPrompt(){
        System.out.println("Thanks for ordering! Use code TASTY10 for 10% off your next meal.");
    }
}

class GroceryOrder extends Order{
    public GroceryOrder(int orderId,int noOfItems,String[] order,int[] quantity){
        super(orderId,noOfItems,order,quantity);
    }

    @Override
    public void printReceipt(){
        System.out.println("==Grocery Order==");
        System.out.println("Order Id        : " + getOrderId());
        for(int i=0;i<getNoOfItems();i++){
            System.out.println(getOrder()[i] + " : "+ getQuantity()[i]);
        }
        nextOrderPrompt();
    }
}

public class FoodDeliverySystem{
    public static void main(String[] args){
        String[] onlineItems = {"Pizza", "Burger", "Coke"};
        int[] onlineQuantity = {2, 1, 3};

        String[] restaurantItems = {"Biryani", "Paneer Tikka"};
        int[] restaurantQuantity = {2, 1};

        String[] groceryItems = {"Rice", "Milk", "Eggs"};
        int[] groceryQuantity = {1, 3, 12};

        Order onlineOrder = new OnlineOrder(101,3,onlineItems,onlineQuantity,"12, Anna Nagar");
        Order restaurantOrder = new RestaurantOrder(102,2,restaurantItems,restaurantQuantity);
        Order groceryOrder = new GroceryOrder(103,3,groceryItems,groceryQuantity);

        onlineOrder.printReceipt();
        System.out.println();

        restaurantOrder.printReceipt();
        System.out.println();

        groceryOrder.printReceipt();
        System.out.println();
    }
}