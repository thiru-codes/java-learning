//Order processor 
class OrderSystem{
    public String processOrder(int orderId, double price){
       return "Order confirmed!";
    }

    private boolean processOrder(double price, int orderId){
        return true;
    }

    public void getStatus(double p, int id){
        boolean result = processOrder(p, id);
        System.out.println("Internal status check: " + result);
    }
}

public class SequenceofTypes {
    public static void main(String[] args) {
        OrderSystem order = new OrderSystem();

        System.out.println(order.processOrder(100, 1290.80));
        order.getStatus(1290.80, 100);
    }
}
