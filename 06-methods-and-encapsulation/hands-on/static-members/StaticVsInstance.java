// Practice how instance methods can interact with static variables
// but not vice versa

class ServerTracker{
    static int activeConnections;

    void connectUser(){
        activeConnections++;
        System.out.println("User connected. Total active: " + activeConnections);
    }

    static void resetTracker(){
        activeConnections = 0;
    }
}

public class StaticVsInstance {
    public static void main(String[] args) {
        ServerTracker conn1 = new ServerTracker();
        ServerTracker conn2 = new ServerTracker();

        conn1.connectUser();
        conn2.connectUser();
        ServerTracker.resetTracker();
        System.out.println("No. of active connections: " + ServerTracker.activeConnections);

    }
}
