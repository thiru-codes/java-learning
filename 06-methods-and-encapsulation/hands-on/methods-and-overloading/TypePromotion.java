//Notification Dispatcher
class NotificationService{
    void send(String message, double priorityCode){
        System.out.println("double: " + priorityCode + " " + message);
    }
    void send(String message, long referenceId){
        System.out.println("long: " + referenceId + " " + message);
    }
}

public class TypePromotion {
    public static void main(String[] args) {
        NotificationService notify = new NotificationService();

        notify.send("Alert", 500);
    }
}

//Automatic Type Promotion: 
// If an exact parameter match is not found: 
//Java will automatically promote smaller data types 
//to larger ones (uses primitive widening hierarchy)