package implementstatic;

public class Configuration {
    // static variables
    public static String environment;
    public static int maxConnections;

    // static initializer block
    static {
        environment = "PRODUCTION";
        maxConnections = 100;
        System.out.println("Static block executed: Class variables initialized.");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");    
        System.out.println("Environment: " + environment);
    }
}
