class Notification{
    void send(String message){
        System.out.println("Push Notification sent: " + message);
    }
}

class EmailNotification extends Notification{
    @Override
    void send(String message){
        System.out.println("Email notification sent with the following message body: ");
        System.out.println("\n"+message);
    }

    void send(String username, String message){
        System.out.println("\nEmail notification sent to " + username + " : ");
        System.out.println("\nDear " + username + ", " + message);
    }
}


public class NotificationSystem {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        EmailNotification emailNotification = new EmailNotification();

        notification.send("hope your week is treating you okay. take a screen break and grab a coffee today, you probably need it. ");
        emailNotification.send("T","hope your week is treating you okay. take a screen break and grab a coffee today, you probably need it. ☕️");
    }
}
